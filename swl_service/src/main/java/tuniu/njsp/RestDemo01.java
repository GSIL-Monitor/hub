package tuniu.njsp;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.http.HttpStatus;

import java.io.IOException;

/**
 * Created by songweiliang on 2017/8/10.
 */
public class RestDemo01 {

    public static void main(String[] arg) {

        String uri = "http://public-api.api.aus.tuniu-sst.org/aus/business/right/getRuleRight";
        HttpClient httpClient = new HttpClient();
        PostMethod post = new PostMethod(uri);
        String request = "";
        post.setRequestEntity(new StringRequestEntity(request));

        try {
            httpClient.executeMethod(post);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(post.getStatusCode());
        if (HttpStatus.SC_OK == post.getStatusCode()) {
            System.out.println("success");
        }
    }
}