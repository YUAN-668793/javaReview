package multilThread.chapter1;

/**线程随机性
 * 线程启动顺序与start()执行顺序无关
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 9:23 AM
 */
public class Page6 extends Thread {
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            try {
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("run="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Page6 p = new Page6();
        p.setName("myThread");
        p.start();
        for(int i=0;i<10;i++){
            try {
                int time = (int)(Math.random()*1000);
                Thread.sleep(time);
                System.out.println("main="+Thread.currentThread().getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
