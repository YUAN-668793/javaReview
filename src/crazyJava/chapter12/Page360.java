package crazyJava.chapter12;

import java.util.Date;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Page360 {
    public static void main(String[] args) throws Exception{
        for(int i=0;i<10;i++){
            System.out.println("当前时间："+ new Date());
            Thread.sleep(1000);
        }
    }
}
