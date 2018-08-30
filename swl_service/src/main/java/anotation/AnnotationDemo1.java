package anotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by songweiliang on 2017/9/6.
 */
public class AnnotationDemo1 {
    public static void main(String[] arg) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        String path = "anotation.StudentDemo";
        Class clazz = Class.forName(path);
        //返回全类名
        System.out.println(clazz.getName());
        //返回类名
        System.out.println(clazz.getSimpleName());

        //获取属性
        //返回public属性
        Field[] fields = clazz.getFields();
        //返回所有属性
        Field[] fields1 = clazz.getDeclaredFields();
        Field field = clazz.getDeclaredField("name");
        for (Field tmp:fields1){
            System.out.println("属性--"+tmp);
        }

        //方法
        Method[] methods = clazz.getDeclaredMethods();
        //过去指定方法，传入参数区分重载
        Method method = clazz.getDeclaredMethod("setName",String.class);

        //构造器
        Constructor constructor = clazz.getDeclaredConstructor();
        Constructor constructor1 = clazz.getDeclaredConstructor(String.class,int.class,int.class);
        System.out.println("构造器--"+constructor);
        System.out.println("构造器--"+constructor1);

        //动态操作  此方法必须要有无参构造器 很多框架都是用反射来创建对象，所以好的方式是添加无惨构造器
        StudentDemo studentDemo = (StudentDemo) clazz.newInstance();
        System.out.println("对象--"+studentDemo);
        //构造器使用
        StudentDemo studentDemo1 = (StudentDemo) constructor1.newInstance("songweilian",1,1);
        System.out.println("对象--"+studentDemo1.getName());

        //方法使用
        Method method1 = clazz.getDeclaredMethod("setName",String.class);
        method1.invoke(studentDemo1,"songweiliang222");
        System.out.println("方法--"+studentDemo1.getName());

        //属性
        //访问私有的属性和方法的时候可用这个方法
        field.setAccessible(true);
        field.set(studentDemo1,"songweiliang3333");
        System.out.println("属性--"+studentDemo1.getName());
    }
}
