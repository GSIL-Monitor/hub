package tuniu.njsp;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by songweiliang on 2017/8/10.
 */
public class TimerDemoo1
{
    public static void main(String[] arg){
        Timer t = new Timer();
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("我的第一个定时任务");
            }
        },1000,1000);
    }
}
