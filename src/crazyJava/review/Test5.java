package review;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/12 15:06
 */
public class Test5 {
    public static void main(String[] args) {
        Test5 rt = new Test5();
        FutureTask<Integer> task = new FutureTask<Integer>((Callable<Integer>)()->{
            int i = 0;
            for(;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"的循环变量i的值："+i);
            }
            return i;
        });
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"的循环变量i的值："+i);
            if(i == 20){
                new Thread(task,"有返回值的线程").start();
            }
        }
        try{
            //获取线程的返回值
            System.out.println("获取线程的返回值："+task.get());
        }catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
