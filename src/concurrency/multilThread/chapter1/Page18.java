package concurrency.multilThread.chapter1;

/** isAlive()方法
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 3:17 PM
 */
public class Page18 extends Thread{
    @Override
    public void run(){
        System.out.println("run="+this.isAlive());
    }

    public static void main(String[] args) throws InterruptedException {
        Page18 p = new Page18();
        System.out.println("begin="+p.isAlive());
        p.start();
        //Thread.sleep(1000);   添加后，后面输出变为false，因为p对象执行完毕
        System.out.println("end="+p.isAlive());
    }
}
