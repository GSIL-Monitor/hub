package tuniu.njsp;

import java.net.URI;

/**
 * Created by songweiliang on 2017/8/10.
 */
public class UriTest {
    public  static void main(String[] arg){
        String urlString = "http://public-api.api.aus.tuniu-sst.org/aus/business/right/getRuleRight";
        URI uri = URI.create(urlString);
        System.out.println(uri.getHost());
    }
}
