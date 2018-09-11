package test.myTest;

import java.time.LocalDateTime;
import java.util.Calendar;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Test09 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.getYear());
        System.out.println(ldt.getMonth());
        System.out.println(ldt.getDayOfWeek());
        System.out.println(ldt.getHour()+":"+ldt.getMinute()+":"+ldt.getSecond());
        long time = Calendar.getInstance().getTimeInMillis();
        System.out.println("nums: "+time);
        System.currentTimeMillis();
    }
}
