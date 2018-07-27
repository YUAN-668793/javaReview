package thread.crazyJava;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/21 16:32
 */
public class JoinThread extends Thread{
    //提供一个有参数的构造器，用于设置线程的名字
    public JoinThread(String name){
        super(name);
    }
    //重写run方法，定义线程执行体
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println(getName()+""+i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        //启动子线程
        new JoinThread("新线程").start();
        for(int i=0;i<100;i++){
            if(i==20){
                JoinThread jt = new JoinThread("被Join的线程");
                jt.start();
                //main线程调用了jt线程的join()方法，main线程必须等到jt执行结束才会向下执行
                jt.join();
            }
            System.out.println(Thread.currentThread().getName()+""+i);
        }
    }
}
