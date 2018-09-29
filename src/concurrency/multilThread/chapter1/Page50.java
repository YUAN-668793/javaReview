package concurrency.multilThread.chapter1;

/** 守护线程
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 9:32 PM
 */
public class Page50 extends Thread {
    private int i=0;

    @Override
    public void run(){
        try{
            while (true){
                i++;
                System.out.println("i="+(i));
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            Page50 p = new Page50();
            p.setDaemon(true);
            p.start();
            Thread.sleep(5000);
            System.out.println("thread对象结束，不能再打印了！");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
