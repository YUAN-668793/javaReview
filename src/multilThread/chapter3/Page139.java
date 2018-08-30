package multilThread.chapter3;

/** notify
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 4:36 PM
 */
public class Page139 extends Thread {
    private Object lock;
    public Page139(Object lock){
        this.lock = lock;
    }
    @Override
    public void run(){
            synchronized (lock) {
                System.out.println("开始  notify time=" + System.currentTimeMillis());
                lock.notify();
                System.out.println("结束  notify time=" + System.currentTimeMillis());
            }
    }
}
