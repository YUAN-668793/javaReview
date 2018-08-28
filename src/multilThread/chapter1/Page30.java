package multilThread.chapter1;

/** 在沉睡中停止
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 5:08 PM
 */
public class Page30 extends Thread {
    @Override
    public void run(){
        super.run();
        try{
            System.out.println("run begin");
            Thread.sleep(200000);
            System.out.println("run end");
        }catch (InterruptedException e){
            System.out.println("在沉睡中被停止，进入catch!"+this.isInterrupted());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            Page30 p = new Page30();
            p.start();
            Thread.sleep(200);
            p.interrupt();
        }catch (InterruptedException e){
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
