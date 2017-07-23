package context;

import com.ctrip.soa.esb.common.types.RequestHead;

import java.util.HashMap;

/**
 * Created by c_liang on 2017/7/20.
 * Description：查询条件
 */
public class SearchCriteria {
    private final HashMap<String,String> _tags;

    public SearchCriteria() {
        _tags = new HashMap<String,String>();
    }

    private RequestHead hearder;

    private SalesType SalesType;

}
