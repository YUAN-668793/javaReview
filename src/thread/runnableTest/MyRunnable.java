package thread.runnableTest;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 15:22
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"=="+i);
        }
    }
}
