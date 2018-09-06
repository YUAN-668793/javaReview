package multilThread.chapter1;

/** sleep方法
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 3:35 PM
 */
public class Page21 extends Thread {
    @Override
    public void run(){
        try {
            System.out.println("run threadName="+this.currentThread().getName()+" begin");
            Thread.sleep(2000);
            System.out.println("run threadName="+this.currentThread().getName()+" end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Page21 p = new Page21();
        System.out.println("begin="+System.currentTimeMillis());
        System.out.println("id:"+p.getId());
        p.start();    //异步执行
        System.out.println("end="+System.currentTimeMillis());
    }
}
