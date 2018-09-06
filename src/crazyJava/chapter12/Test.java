package crazyJava.chapter12;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/2 9:52
 */
public class Test implements Runnable{
    private int i;
    @Override
    public void run() {
        for(;i<100;i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            if(i == 20){
                Test t = new Test();
                new Thread(t,"新线程1").start();
                new Thread(t,"新线程2").start();
            }
        }
    }
}
