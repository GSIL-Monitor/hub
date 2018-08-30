package sjms.danli;

/**
 * Created by songweiliang on 2017/11/11.
 * 恶汉式 线程安全
 */
public class DanliDemo02 {
    private static DanliDemo02 instance = new DanliDemo02();
    private DanliDemo02(){}

    public static DanliDemo02 createInstance(){
        return instance;
    }
}
