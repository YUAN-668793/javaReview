package chapter12;

/**
 * Created by Jiayuan on 2018/3/6.
 */
public class Page350 extends Thread{
    private int i;
    public void run(){
        for(;i<100;i++){
            System.out.println(getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for(int i = 0;i<100; i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i == 20){
                new Page350().start();
                new Page350().start();
            }
        }
    }
}
