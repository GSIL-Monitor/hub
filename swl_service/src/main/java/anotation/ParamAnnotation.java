package anotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by songweiliang on 2017/9/5.
 */
@Target(value = {ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)

public @interface ParamAnnotation {
    String collum();
    String type();
    int length();
}
