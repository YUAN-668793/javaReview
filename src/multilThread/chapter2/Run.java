package multilThread.chapter2;

/** 线程启动类Run
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 1:44 PM
 */
public class Run {
    public static void main(String[] args) {
        Page61 object = new Page61();
        ThreadA a = new ThreadA(object);
        a.setName("A");
        a.start();
        ThreadB b = new ThreadB(object);
        b.setName("B");
        b.start();
    }
}
