# 项目使用说明

**代码中src/main/java/com.ctrip.flight.intelpenaltysearch.soa.HelloSOAServiceImpl是样例服务，可以随时参看**

## 新增服务
1. 参看[SOA文档](http://conf.ctripcorp.com/pages/viewpage.action?pageId=61550573)的Step1到Step4，生成SOA代码
2. 在src/main/java/com.ctrip.flight.intelpenaltysearch/soa或者其子package中新建Class实现上一步生成的服务接口，为其添加annotation `@Component`
3. 修改src/main/java/com.ctrip.flight.intelpenaltysearch/soa/BaijiServletConfiguration.java中的构造函数，以调整service的根路径和实现类

## 整合Ctrip DAL
- 请参看[DAL结合Spring/Spring Boot使用样例](http://conf.ctripcorp.com/pages/viewpage.action?pageId=134867661)

## 本地运行调试
- 通过src/test/java/com.ctrip.flight.intelpenaltysearch/ServiceStarter.java进行运行或者调试，启动时自动通过embedded Tomcat进行服务发布

## 测试环境或者生产环境发布
- 直接Maven打包即可

## 备注
- 通过src/test/resources/application.properties中的`server.port`进行本地运行时服务端口修改，测试环境或者生产环境的端口不受此配置控制