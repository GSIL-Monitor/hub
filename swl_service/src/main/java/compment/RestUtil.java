package compment;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import org.apache.commons.httpclient.URI;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.converter.ObjectToStringHttpMessageConverter;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.RestTemplate;

/**
 * Created by songweiliang on 2017/8/10.
 */
public class RestUtil {
    /**
     * post
     * @param url
     * @param request
     * @param responseType
     * @param <T>
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static <T> T post(String url,Object request,Class<T> responseType) throws IllegalAccessException, InstantiationException {
        if(CommonUtil.isBlank(request)){
            T res =  responseType.newInstance();
            return res;
        }
        String input = JSONArray.toJSONString(request);
        System.out.println(input);
        String realInput = Base64Utils.encodeToString(JSON.toJSONBytes(request));
        RestTemplate restTemplate = new RestTemplate();
        T ret = restTemplate.postForObject(url,realInput,responseType);
        return ret;
    }

    /**
     * get
     * @param url
     * @param request
     * @param responseType
     * @param <T>
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static <T> T get(String url,Object request,Class<T> responseType) throws IllegalAccessException, InstantiationException {
        if(CommonUtil.isBlank(request)){
            T res =  responseType.newInstance();
            return res;
        }
        RestTemplate restTemplate = new RestTemplate();
        T ret = restTemplate.getForObject(url,responseType,request);
        return ret;
    }
    /**
     * 通用的请求方法
     * @param url
     * @param request
     * @param method
     * @param responseType
     * @param <T>
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public static <T> T batch(String url , Object request, HttpMethod method, Class<T> responseType) throws IllegalAccessException, InstantiationException {
        RestTemplate restTemplate = new RestTemplate();
        if(CommonUtil.isBlank(url) || CommonUtil.isBlank(method)){
            T res =  responseType.newInstance();
            return res;
        }
        HttpEntity<Object> entity = new HttpEntity<Object>(request,null);
        HttpEntity<T>  res = restTemplate.exchange(url,method,entity,responseType);
        return res.getBody();
    }
}
