package anotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by songweiliang on 2017/9/7.
 */
public class ReflectTest {
    public static void main(String[] arg) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        StudentDemo studentDemo = new StudentDemo();

        long startTime = System.currentTimeMillis();
        Class clazz = studentDemo.getClass();
        Method method = clazz.getDeclaredMethod("setName",String.class);
        for(int i=0;i<100000000;i++){
            method.invoke(studentDemo,"songweiliang");
        }
        System.out.println(System.currentTimeMillis()-startTime);



        long startTime1 = System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
//            Class clazz = studentDemo.getClass();
//
//            Method method = clazz.getDeclaredMethod("setName",String.class);
            method.setAccessible(true);
            method.invoke(studentDemo,"songweiliang");
        }
        System.out.println(System.currentTimeMillis()-startTime1);


        long startTime2 = System.currentTimeMillis();
        for(int i=0;i<100000000;i++){
           studentDemo.setName("songweiliang");
        }
        System.out.println(System.currentTimeMillis()-startTime2);






    }
}
