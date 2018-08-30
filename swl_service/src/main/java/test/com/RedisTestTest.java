package test.com; 




import java.util.Vector;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/** 
* RedisTest Tester. 
* 
* @author <Authors name> 
* @since <pre>���� 9, 2017</pre> 
* @version 1.0 
*/ 
public class RedisTestTest {
    public static void main(String[] s) throws InterruptedException {
        Executor pool = Executors.newFixedThreadPool(20);
        Executor pool1 = Executors.newCachedThreadPool();
        Executor pool2 = Executors.newCachedThreadPool(new ThreadFactory() {
            public Thread newThread(Runnable r) {
                return null;
            }
        });
        Executor pool3 = Executors.newSingleThreadExecutor();
        Executor pool4 = Executors.newScheduledThreadPool(20);
       final RedisTestTest test = new RedisTestTest();
        test.getMethod();
        test.getmethod2();


//       final ConcurrentHashMap map = new ConcurrentHashMap();
//
//        new Thread(new Runnable() {
//            public void run() {
//                synchronized (map){
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    map.put(1,1);
//
//                }
//                System.out.println("线程1加map");
//            }
//        }).start();
//        new Thread(new Runnable() {
//            public void run() {
//                map.put(2,2);
//                System.out.println("线程2加map");
//            }
//        }).start();





//        new Thread(new Runnable() {
//            public void run() {
//                try {
//                    System.out.println("线程1启动");
//                    test.getMethod();
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//            }
//        }).start();
//        new Thread(new Runnable() {
//            public void run() {
//                System.out.println("线程2start");
//                test.getmethod2();
//            }
//        }).start();




    }

    public static void removeLast(Vector v){
        Integer last = v.size() - 1;
        v.remove(last);
    }
    public static Integer getLast(Vector v){
        Integer last = v.size() -1;
        return (Integer) v.get(last);
    }

    public    void getMethod() throws InterruptedException {
        synchronized (this){

            Thread.sleep(10000);
            System.out.print("方法1执行");
        }
    }

    public  synchronized  void getmethod2() {
        System.out.println("方法二执行");
    }
} 
