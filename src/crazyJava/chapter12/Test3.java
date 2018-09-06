package crazyJava.chapter12;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 9:52
 */
public class Test3 {
    public static void main(String[] args) {
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>) ()->{
           int i = 0;
           for(;i<100;i++){
               System.out.println(Thread.currentThread().getName()+" "+i);
           }
           return i;
        });

        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i == 20){
                new Thread(task,"task线程").start();
                try {
                    task.get();
                } catch (Exception e){
                    e.printStackTrace();
                }
            }
        }
    }
}
