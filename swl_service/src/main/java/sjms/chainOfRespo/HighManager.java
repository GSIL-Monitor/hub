package sjms.chainOfRespo;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class HighManager extends ALeader {
    @Override
    public void handleRequest(String condition) {
        if(condition.equals("二级审批")){
            System.out.println("二级领导审批通过");
        }else {
            if(nexLeader != null){
                nexLeader.handleRequest(condition);
            }
        }
    }
}
