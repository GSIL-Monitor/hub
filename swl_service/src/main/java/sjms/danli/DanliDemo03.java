package sjms.danli;


import java.io.Serializable;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by songweiliang on 2017/11/11.
 * 延迟加载，线程安全；
 */
public class DanliDemo03 implements Serializable{
    private static class inner{
        public static DanliDemo03 instance = new DanliDemo03();

    }
    public static DanliDemo03 createInstance(){
        return inner.instance;
    }
    private DanliDemo03(){
        //此方法用于防止反射方式破解
        if(inner.instance != null){
            throw  new RuntimeException();
        }
    }
    //用于解决饭序列化的漏洞
    private Object readResolve(){
        return inner.instance;
    }
}



class A extends ReentrantLock{

    public void get(){
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("我是读操作");
    }

    public void put(){
        System.out.print("我是写操作");
    }
    public static void main(String[] args){
       final A a = new A();
        new Thread(new Runnable() {
            public void run() {
                a.get();
            }
        }).start();

        new Thread(new Runnable() {
            public void run() {
                a.put();
            }
        }).start();
    }
}