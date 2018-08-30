package multilThread.chapter3;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 8:31 PM
 */
public class RunPC {
    public static void main(String[] args) {
        String lock = new String("");
        P p = new P(lock);
        C c = new C(lock);
        ThreadP pThread = new ThreadP(p);
        ThreadC cThread = new ThreadC(c);
        pThread.start();
        cThread.start();
    }
}
