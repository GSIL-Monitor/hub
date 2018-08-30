package sjms.factory.gcff;

/**
 * Created by songweiliang on 2017/11/12.
 */
public class Clent {
    public static void main(String[] args){
        BaoMaFactory baoMaFactory = new BaoMaFactory();
        ICar baoma = baoMaFactory.createBaoma();
        baoma.run();
    }
}
