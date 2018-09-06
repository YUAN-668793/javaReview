package multilThread.chapter2;

/**synchronized 方法和锁对象
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 1:38 PM
 */
public class Page61 {
    synchronized public void methodA(){
        try{
            System.out.println("begin methodA threadName = "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end endTime="+System.currentTimeMillis());
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
     public void methodB(){
        try{
            System.out.println("begin methodB threadName = "+Thread.currentThread().getName());
            Thread.sleep(5000);
            System.out.println("end");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
