package tuniu.njsp;

/**
 * Created by songweiliang on 2017/8/8.
 */
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.MessageConsumer;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

/**
 * 消息订阅者一
 * @author MCL
 *
 */
public class JMSConsumer {
    private static final String USERNAME = ActiveMQConnection.DEFAULT_USER;// 默认的连接的用户名
    private static final String PASSWORD = ActiveMQConnection.DEFAULT_PASSWORD;// 默认的连接密码
    private static final String BROKEURL = ActiveMQConnection.DEFAULT_BROKER_URL;// 默认的连接地址

    public static void main(String[] args) {
        ConnectionFactory connectionFactory; // 连接工厂
        Connection connection = null; // 连接
        Session session; // 会话 接受或者发送消息的线程
        Destination destination; // 消息的目的地
        MessageConsumer messageConsumer; // 消息的消费者


        connectionFactory = new ActiveMQConnectionFactory(JMSConsumer.USERNAME, JMSConsumer.PASSWORD,
                JMSConsumer.BROKEURL);
        try {
            // 通过连接工厂获取连接
            connection=connectionFactory.createConnection();  // 通过连接工厂获取连接
            connection.start(); // 启动连接
            session=connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE); // 创建Session
            destination=session.createTopic("FirstTopic");
            messageConsumer=session.createConsumer(destination); // 创建消息消费者
            messageConsumer.setMessageListener(new Listenner()); // 注册消息监听

        } catch (JMSException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}