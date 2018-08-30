package sjms.chainOfRespo;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class Client {
    public static void main(String[] args){
        ALeader lowLeader = new LowManager();
        ALeader HighLeader = new HighManager();
        lowLeader.setNexLeader(HighLeader);

        lowLeader.handleRequest("二级审批");
    }
}
