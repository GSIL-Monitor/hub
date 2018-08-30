package compment;

/**
 * Created by songweiliang on 2017/8/10.
 */
public class CommonUtil {

    public static Boolean isBlank(Object o){
        if(o == null || o == ""){
            return true;
        }
        return false;
    }
}
