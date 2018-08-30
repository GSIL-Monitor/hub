package tuniu.njsp;

import dto.EmailInputDto;
import org.apache.activemq.thread.SchedulerTimerTask;
import service.EmailService;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by songweiliang on 2017/8/10.
 */
public class EmailTask {

    public static void main(String[] args){

        Timer t = new Timer();
        Date myDate2 = new Date();
        DateFormat dateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            myDate2 = dateFormat2.parse("2017-08-11 10:36:01");
        } catch (ParseException e) {
            e.printStackTrace();
        }
        t.schedule(new TimerTask() {
            @Override
            public void run() {

                System.out.println("start");
                List<String> receiveList = new ArrayList<String>();
                receiveList.add("songweiliang@tuniu.com");

                EmailInputDto orderInternalEmailSendInputDto = new EmailInputDto();
                orderInternalEmailSendInputDto.setSenderUid(39);
                orderInternalEmailSendInputDto.setSubject("研发日报");
                orderInternalEmailSendInputDto.setMsgText("test email");
                orderInternalEmailSendInputDto.setRecipientEmails(receiveList);
                orderInternalEmailSendInputDto.setSystemCode("DOC");
                orderInternalEmailSendInputDto.setBusinessId("TOF_20160708");
                orderInternalEmailSendInputDto.setSenderName("robot@tuniu.com");
                try {
                    String s = EmailService.send(orderInternalEmailSendInputDto);
                    System.out.println(s);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            },myDate2,10000);
        }

}
