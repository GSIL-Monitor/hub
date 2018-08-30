package tuniu.njsp;

import javax.swing.*;
import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * Created by songweiliang on 2017/9/13.
 */
public class TestDCompileDemo01 {
    public static  void main(String[] str) throws IOException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        JavaCompiler jc = ToolProvider.getSystemJavaCompiler();
        int result = jc.run(null,null,null,"D:\\auc_code\\HelloWorld.java");
        System.out.println(result==1?"编译失败":"编译成功");

        //运行 使用runtime
        Runtime run = Runtime.getRuntime();
        Process process = run.exec("java -cp D:\\auc_code HelloWorld");
        InputStream in = process.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(in));
        String info = "";
        while((info = bufferedReader.readLine()) != null){
            System.out.print(info);
        }

        //用类加载和反射实现
        URL[] urls = new URL[]{new URL("file:/D:/auc_code/")};
        URLClassLoader loader = new URLClassLoader(urls);
        Class hello = loader.loadClass("HelloWorld");
        Method m = hello.getDeclaredMethod("maiin",String[].class);
        m.invoke(null,(Object)new String[]{});

        test((Object) (new String[]{"aa","bb"}));
    }

    public static void test(Object... param){
        for (Object p:param){
            System.out.print(p);
        }
    }
}
