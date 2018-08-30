package sjms.factory;

/**
 * Created by songweiliang on 2017/11/12.
 */
public class Client{
    public static void main(String[] args){
        AbstractCarFactory a = new LuxuryCarFatory();
        IEngen e = a.createEngen();
        e.run();;
    }
}
