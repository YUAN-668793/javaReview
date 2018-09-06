package multilThread.chapter1;

/** 线程优先级继承特性
 * 线程的优先级具有继承性，比如A启动线程B，则B线程的优先级与A是一样的（Page43)
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 8:25 PM
 */
public class Page44 extends Thread {
    @Override
    public void run(){
        System.out.println("Page44 run priority:"+this.getPriority());
    }

    public static void main(String[] args) {
        System.out.println("main begin:"+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(6);
        System.out.println("main end:"+Thread.currentThread().getPriority());
        Page43 p = new Page43();
        p.start();
    }
}
