package sjms.chainOfRespo;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class LowManager extends ALeader{
    @Override
    public void handleRequest(String condition) {
        if(condition.equals("二级审批")){
            if(nexLeader != null){
                nexLeader.handleRequest(condition);
            }
        }else{
            System.out.println("一级领导审批");
        }
    }


}
