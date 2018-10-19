package deep.deep1;

import deep.temp.MyThread;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/** 四种类型的线程池
 * 1.固定大小
 * 2.缓存大小
 * 3.单一线程
 * 4.延迟线程
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/19/2018 4:13 PM
 */
public class ThreadPool {

    public static void main(String[] args) {
        //创建一个可重用的固定线程大小的线程池
        //ExecutorService pool = Executors.newFixedThreadPool(2);
        //创建一个使用单一worker线程的Executor.以无界队列方式来运行该线程
        //ExecutorService pool = Executors.newSingleThreadExecutor();
        //创建缓存大小的线程池
        //ExecutorService pool = Executors.newCachedThreadPool();
        //延期执行线程池
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        Thread t3 = new MyThread();
        Thread t4 = new MyThread();
        Thread t5 = new MyThread();
        Thread t6 = new MyThread();
        //注意extcute为异步执行
        pool.execute(t1);
        pool.execute(t2);
        pool.execute(t3);
        pool.execute(t4);
        pool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("noName innerClass");
            }
        });
        pool.submit(new Callable(){
            @Override
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });
        pool.schedule(t5,5, TimeUnit.SECONDS);
        pool.execute(t6);
        pool.shutdown();
    }
}
