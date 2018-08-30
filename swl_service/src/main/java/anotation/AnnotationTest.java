package anotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by songweiliang on 2017/9/6.
 */
public class AnnotationTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException {
        List list = new ArrayList();
        list.add(11);
        list.add(22);
        list.add(33);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            list.add(15);
            System.out.println( iterator.next());
        }

    }
}
