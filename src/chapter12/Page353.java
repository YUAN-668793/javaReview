package chapter12;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Page353 {
    public static void main(String[] args) {
        Page353 rt = new Page353();
        //使用lambda表达式创建Callable<Integer>对象
        //使用FutureTask来包装Callable对象
        FutureTask<Integer> task = new FutureTask<>((Callable<Integer>)()->{
            int i = 0;
            for(;i<100;i++){
                System.out.println(Thread.currentThread().getName()+"的循环变量的值："+i);
            }
            return i;
        });
        for(int i = 0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+"的循环变量i的值："+i);
            if(i == 20){
                new Thread(task,"有返回值的线程").start();
            }
        }
        try{
            System.out.println("子线程的返回值："+task.get());
        }catch(Exception ex){
            ex.printStackTrace();
        }

    }
}
