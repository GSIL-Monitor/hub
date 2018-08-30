package sjms.chainOfRespo;



/**
 * Created by songweiliang on 2017/11/25.
 */
public abstract class ALeader {
    protected String leaderName;
    protected ALeader nexLeader;
    public abstract  void handleRequest(String condition);
    public void setNexLeader(ALeader leader){
        this.nexLeader = leader;
    }
}
