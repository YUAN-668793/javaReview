package thread.threadTest1;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 14:52
 */
public class ThreadStop extends Thread {
    @Override
    public void run() {
        System.out.println("开始执行");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            //e.printStackTrace();
            System.out.println("线程被中断");
        }
        System.out.println("结束执行");
    }
}
