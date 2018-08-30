package multilThread.chapter3;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 4:39 PM
 */
public class Run {
    public static void main(String[] args) {
        try{
            Object lock = new Object();
            Page138 p1 = new Page138(lock);
            p1.start();
            Thread.sleep(3000);
            Page139 p2 = new Page139(lock);
            p2.start();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
