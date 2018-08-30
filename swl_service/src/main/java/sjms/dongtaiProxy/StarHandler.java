package sjms.dongtaiProxy;

import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by songweiliang on 2017/11/13.
 */
public class StarHandler implements InvocationHandler {
    private Object object;
    StarHandler(Object object){
        this.object = object;
    }
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置操作");
        Object result =  method.invoke(object,args);
        System.out.println("后置操作");
        return result;
    }
}
