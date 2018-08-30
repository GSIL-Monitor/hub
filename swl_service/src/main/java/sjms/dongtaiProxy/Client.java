package sjms.dongtaiProxy;

import java.lang.reflect.Proxy;

/**
 * Created by songweiliang on 2017/11/14.
 */
public class Client {
    public static void main(String[] args){
        StarImpl star = new StarImpl();
        IStar proxy = (IStar) Proxy.newProxyInstance(star.getClass().getClassLoader(),star.getClass().getInterfaces(),new StarHandler(star));
        proxy.sing();
    }
}
