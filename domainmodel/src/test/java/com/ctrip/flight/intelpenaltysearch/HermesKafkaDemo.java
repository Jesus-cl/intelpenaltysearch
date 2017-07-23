package com.ctrip.flight.intelpenaltysearch;

import java.util.UUID;

import org.junit.Test;

import com.ctrip.hermes.consumer.api.BaseMessageListener;
import com.ctrip.hermes.consumer.api.Consumer;
import com.ctrip.hermes.core.message.ConsumerMessage;
import com.ctrip.hermes.core.result.CompletionCallback;
import com.ctrip.hermes.core.result.SendResult;
import com.ctrip.hermes.producer.api.Producer;

public class HermesKafkaDemo {
	@Test
	public void oneboxTest() throws Exception {
		String topic = "starter.java.kafka";// TODO replace with your hermes topic name
		String consumerGroup = "starter.java.cgroup";// TODO replace with your hermes consumer group name

		// Start consumer
		Consumer.getInstance().start(topic, consumerGroup, new BaseMessageListener<String>() {// TODO replace String with your message type

			      @Override
			      protected void onMessage(ConsumerMessage<String> msg) {
				      System.out.println(String.format("Message received: %s", msg.getBody()));
			      }
		      });

		System.out.println("Consumer started");

		int i = 0;
		while (true) {
			System.out.println("Press any key to send message...");
			System.in.read();
			Producer.getInstance().message(topic, UUID.randomUUID().toString(), "msg-" + i++)//
			      .setCallback(new CompletionCallback<SendResult>() {

				      @Override
				      public void onSuccess(SendResult result) {
					      System.out.println(String.format("Message sent: %s", result.getMessage().getBody()));
				      }

				      @Override
				      public void onFailure(Throwable t) {
					      // TODO Auto-generated method stub

				      }
			      })//
			      .send();
		}
	}
}
