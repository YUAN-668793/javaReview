package thread.crazyJava;

import java.util.Date;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/21 16:39
 */
public class SleepThread {
    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<100;i++){
            System.out.println(new Date());
            //调用sleep()方法让当前线程暂停1s
            Thread.sleep(1000);
        }
    }
}
