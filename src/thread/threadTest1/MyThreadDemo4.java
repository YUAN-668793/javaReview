package thread.threadTest1;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 14:54
 */
public class MyThreadDemo4 {
    public static void main(String[] args) {
        ThreadStop ts = new ThreadStop();
        ts.start();

        try {
            Thread.sleep(3000);
            ts.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
