package myTest;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Test10 {
    public static void main(String[] args) {
        Integer a  = 10;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        System.out.println(sdf.format(date));

    }
}
