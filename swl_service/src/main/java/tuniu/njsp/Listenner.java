package tuniu.njsp;

/**
 * Created by songweiliang on 2017/8/8.
 */


        import javax.jms.JMSException;
        import javax.jms.Message;
        import javax.jms.MessageListener;
        import javax.jms.TextMessage;
/**
 * 消息监听器
 * @author MCL
 *
 */
public class Listenner implements MessageListener{

    public void onMessage(Message message) {
        // TODO Auto-generated method stub
        try {
            System.out.println("消息订阅者一收到的消息："+((TextMessage)message).getText());
        } catch (JMSException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}