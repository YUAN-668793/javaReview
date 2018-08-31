package multilThread.chapter4;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/** lock锁
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/31/2018 8:07 PM
 */
public class Page200 {
    private Lock lock = new ReentrantLock();
    public void testMethod(){
        lock.lock();
        for(int i=0;i<5;i++){
            System.out.println("ThreadName="+Thread.currentThread().getName()+"( "+(i+1));
        }
        lock.unlock();
    }
}
