package sjms.shipei;

/**
 * Created by songweiliang on 2017/11/13.
 */
public class Adapter implements Target {
    private Adaptee adaptee;
    public void request() {
        adaptee.print();
    }
}
