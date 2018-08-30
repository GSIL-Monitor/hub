package sjms.decator;

import java.net.InetAddress;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by songweiliang on 2017/11/25.
 */
public class Client {
    public static void main(String[] args) throws ParseException {
        String dates = "2017-12-06/2017-12-07/1";
        String[] departureDates = dates.split("/");
        String startDateStr = departureDates[0];
        String endDateStr = departureDates[1];
        System.out.println(startDateStr);
        System.out.println(endDateStr);

        new Thread();
    }


    public static Date getSpecifiedDayAfter(Date date){
        Calendar c = Calendar.getInstance();

        c.setTime(date);
        int day=c.get(Calendar.DATE);
        c.set(Calendar.DATE,day+1);
        return c.getTime();
    }

    public static Date getDate(String dateStr){
        Date  date = null;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }
}
