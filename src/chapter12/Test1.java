package chapter12;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 9:09
 */
public class Test1 extends Thread {

    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i == 20){
                new Test1().start();
                new Test1().start();
            }
        }
    }
}
