package concurrency.multilThread.chapter1;

/** 停止线程（通过异常退出）
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 4:47 PM
 */
public class Page27 extends Thread {
    @Override
    public void run(){
        super.run();
        try {
            for (int i = 0; i < 500000; i++) {
                if (this.isInterrupted()) {
                    System.out.println("已经是停止状态了，我要退出了！");
                    // break;
                    throw new InterruptedException();
                }
                System.out.println("i=" + (i + 1));
            }
        }catch (InterruptedException e){
            System.out.println("catch!");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            Page27 p = new Page27();
            p.start();
            Thread.sleep(2000);
            p.interrupt();
        } catch (InterruptedException e) {
            System.out.println("main catch");
            e.printStackTrace();
        }
        System.out.println("end!");
    }
}
