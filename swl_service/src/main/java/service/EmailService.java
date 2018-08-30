package service;

import compment.RestUtil;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by songweiliang on 2017/8/10.
 */
public class EmailService {
    public static String send(Object input) throws InstantiationException, IllegalAccessException {
        String url = "http://10.40.190.199:13030/edm-web/internal/email/send ";
        return RestUtil.post(url,input,String.class);
    }


}
