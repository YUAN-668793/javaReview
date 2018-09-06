package multilThread.chapter1;

/** currentThread方法
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 3:11 PM
 */
public class Page16 extends Thread {
    public Page16(){
        System.out.println("构造方法打印："+Thread.currentThread().getName());
    }
    @Override
    public void run(){
        System.out.println("run方法打印："+Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Page16 p = new Page16();
        p.start();
        //p.run();
    }
}
