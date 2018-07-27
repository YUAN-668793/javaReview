package chapter12;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Page358 extends Thread {
    public Page358(String name){
        super(name);
    }

    public void run(){
        for(int i = 0;i<100; i++){
            System.out.println(getName()+" "+i);
        }
    }
    public static void main(String[] args) {
        new Page358("新线程").start();
        for(int i = 0;i<100;i++) {
            if (i == 20) {
                Page358 jt = new Page358("被join的线程");
                jt.start();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

}
