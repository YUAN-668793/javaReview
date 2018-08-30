package multilThread.chapter3;

/** wait
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 4:34 PM
 */
public class Page138 extends Thread {
    private Object lock;
    public Page138(Object lock){
        this.lock = lock;
    }
    @Override
    public void run(){
        try{
            synchronized (lock){
                System.out.println("开始  wait time="+System.currentTimeMillis());
                lock.wait();
                System.out.println("结束  wait time="+System.currentTimeMillis());
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
