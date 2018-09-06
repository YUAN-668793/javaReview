package multilThread.chapter1;

/** 实现runnable接口
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 9:44 AM
 */
public class Page8 implements Runnable {

    @Override
    public void run() {
        System.out.println("运行中");
    }

    public static void main(String[] args) {
        Page8 p = new Page8();
        Thread t = new Thread(p);
        t.start();
        System.out.println("运行结束");

    }
}
