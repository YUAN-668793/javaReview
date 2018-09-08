package crazyJava.temp;

import java.time.LocalDate;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/8/2018 9:52 AM
 */
public class Test1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.getYear()+"/"+localDate.getMonthValue()+"/"+localDate.getDayOfMonth());
    }
}
