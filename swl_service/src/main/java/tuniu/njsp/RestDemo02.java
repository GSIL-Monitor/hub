package tuniu.njsp;

import org.springframework.web.client.RestTemplate;

/**
 * Created by songweiliang on 2017/8/10.
 */
public class RestDemo02 {
    public static void main(String[] arg){
        RestTemplate restTemplate = new RestTemplate();
        String url = "http://public-api.api.aus.tuniu-sst.org/aus/business/right/getRuleRight";
        String request = "";
        String result = restTemplate.postForObject(url,"1",String.class);
        System.out.println(result);
    }
}
