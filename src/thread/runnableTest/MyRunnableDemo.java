package thread.runnableTest;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 15:24
 */
public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();

        Thread t1 = new Thread(my,"AAA");
        Thread t2 = new Thread(my,"BBB");

        t1.start();
        t2.start();
    }
}
