package test.com;

import sjms.dongtaiProxy.StarImpl;

/**
 * create by songweiliang on 2018/8/19
 */
public class ObjectTest {

    public void test(){
        System.out.println(this.getClass());
        System.out.println(super.getClass());
    }

//    public static void main(String[] args){
//
//        ObjectTest test = new ObjectTest();
//        test.test();
//    }
}


class Test1 implements Runnable{
    private Integer one;
    private Boolean flag;

    @Override
    public void run() {
        while(!flag)
            Thread.yield();
        System.out.println(one);
    }

    public static void main(String[] args){
        Test1 test1 = new Test1();
        Thread t = new Thread(test1);
        test1.one = 1;
        test1.flag = true;
        t.run();
    }
}

class  Test2{
    private static boolean ready;
    private static int number;

    private  static class ReaderThread extends Thread{
        @Override
        public void run(){
            System.out.println(ready);
            while (!ready){
                Thread.yield();

            }
            System.out.println(number);
        }
    }

    public static void main(String[] args){
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}