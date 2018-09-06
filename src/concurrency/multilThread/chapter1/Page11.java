package multilThread.chapter1;

/** 共享数据
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 2:52 PM
 */
public class Page11 extends Thread {
    private int count = 5;
    @Override
    synchronized public void run(){
        super.run();
        count--;   //非原子操作
        System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
    }

    public static void main(String[] args) {
        Page11 p = new Page11();
        Thread a = new Thread(p,"A");
        Thread b = new Thread(p,"B");
        Thread c = new Thread(p,"C");
        Thread d = new Thread(p,"D");
        Thread e = new Thread(p,"E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
