package tuniu.njsp;

import java.awt.image.VolatileImage;

/**
 * Created by songweiliang on 2017/8/8.
 */
public class ThreadDemo3 {
    public static void main(String[] ar){
        JvmThread j3 = new JvmThread(500L);
        JvmThread j4 = new JvmThread(500L);
        Thread t1  = new Thread(j3);
        Thread t2 = new Thread(j4);
        t1.start();
        t2.start();

    }
}


class Jvm {
    public static Jvm instance = null;
    private Jvm(){}
    public static  Jvm getInstance(Long time){
        if(null == instance){
            synchronized(Jvm.class){
                if(null == instance){
                    try {
                        Thread.sleep(time);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Jvm();
                }
                return instance;
            }
        }
        return instance;


    }
}

class  JvmThread implements Runnable{
    private Long time;
    public JvmThread(Long time){
        this.time = time;
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + "-->"+JvmTest.getInstance());
    }
}


class JvmTest{
    public static class jvmHolder{
        private static  JvmTest instance = new JvmTest();
    }
    private JvmTest (){}
    public static JvmTest getInstance(){
        return jvmHolder.instance;
    }
}