package concurrency.multilThread.chapter1;

/** 线程interrupt方法
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 3:50 PM
 */
public class Page23 extends Thread{
    @Override
    public void run(){
        super.run();
        for(int i=0;i<500000;i++){
            System.out.println("i="+(i+1));
        }
    }

    public static void main(String[] args) {
        try {
            Page23 p = new Page23();
            p.start();
            Thread.sleep(2000);
            p.interrupt();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
