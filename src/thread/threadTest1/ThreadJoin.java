package thread.threadTest1;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 14:14
 */
public class ThreadJoin extends Thread {
    @Override
    public void run() {
        for(int x = 0;x<100;x++){
            System.out.println(getName()+"==="+x);
        }
    }
}
