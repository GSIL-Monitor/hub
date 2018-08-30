package sjms.bridge;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class Client {
    public static void main(String args[]){
        PadComputer computer = new PadComputer(new Dell());
        computer.padRun();
    }
}
