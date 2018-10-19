package deep.temp;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/19/2018 4:16 PM
 */
public class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
