package thread.crazyJava;


/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/21 16:26
 */
public class SecondThread implements Runnable {
    private int i;
    @Override
    public void run() {
       for(;i<100;i++){
           System.out.println(Thread.currentThread().getName()+""+i);
       }
    }

    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            System.out.println(Thread.currentThread().getName()+""+i);
            if(i==20){
                SecondThread st = new SecondThread();
                //变量共享
                new Thread(st,"新线程1-").start();
                new Thread(st,"新线程2-").start();
            }
        }
    }
}
