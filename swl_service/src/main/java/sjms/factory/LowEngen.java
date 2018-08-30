package sjms.factory;

/**
 * Created by songweiliang on 2017/11/12.
 */
public class LowEngen implements IEngen {
    public void run() {
        System.out.print("启动慢，转的慢");
    }
}
