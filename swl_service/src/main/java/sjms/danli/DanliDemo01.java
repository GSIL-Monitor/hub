package sjms.danli;

/**
 * Created by songweiliang on 2017/11/11.
 * 懒汉式 非线程安全
 */
public class DanliDemo01 {
    private static DanliDemo01 danliDemo01;
    private DanliDemo01(){}
    public static synchronized DanliDemo01 createInstance(){
        if(danliDemo01 == null){
            danliDemo01 = new DanliDemo01();
        }
        return danliDemo01;
    }

}


