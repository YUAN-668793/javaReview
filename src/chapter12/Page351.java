package chapter12;

/**
 * Created by Jiayuan on 2018/3/6.
 */
public class Page351 implements Runnable{
    private int i;
    public void run(){
        for(;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i == 20){
                Page351 st = new Page351();
                new Thread(st,"新线程1").start();
                new Thread(st,"新线程2").start();
            }
        }
    }
}
