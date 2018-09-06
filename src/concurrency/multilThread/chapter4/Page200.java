package multilThread.chapter4;

import java.util.concurrent.locks.Condition;
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
    private Condition condition = lock.newCondition();
    public void testMethod(){
        try{
            lock.lock();
            System.out.println("执行await()");
            condition.await();
            for(int i=0;i<5;i++){
                System.out.println("ThreadName="+Thread.currentThread().getName()+"( "+(i+1));
            }
            System.out.println("执行结束()");

        }catch (InterruptedException e){
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
    public void signal(){
        try{
            System.out.println("signal方法执行");
            lock.lock();
            condition.signal();
            //condition.signalAll();
        }finally {
            lock.unlock();
        }
    }
}
