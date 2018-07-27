package thread.threadTest1;

import java.util.Date;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 14:13
 */
public class ThreadSleep extends Thread{
    public ThreadSleep() {

    }

    public ThreadSleep(String name) {
        super(name);
    }
    @Override
    public void run() {
        for(int x = 0;x<100;x++){
            System.out.println(getName()+"==="+x+" "+new Date());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
