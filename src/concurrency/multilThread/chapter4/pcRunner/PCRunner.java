package multilThread.chapter4.pcRunner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/31/2018 9:30 PM
 */
public class PCRunner {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadP p = new ThreadP(myService);
        p.start();
        ThreadC c = new ThreadC(myService);
        c.start();
    }
}
