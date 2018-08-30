package sjms.bridge;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class PadComputer extends Computer {
   public void padRun(){
       System.out.println(super.brand + " padComputer is running" );
   }

    public PadComputer(IBrand brand) {
        super(brand);
    }
}
