package thread.crazyJava;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/21 16:41
 */
public class YieldThread extends Thread {
    public YieldThread(String name){
        super(name);
    }
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println(getName()+""+i);
            if(i ==20){
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        YieldThread yt1 = new YieldThread("高级");
       // yt1.setPriority(Thread.MAX_PRIORITY);
        yt1.start();
        YieldThread yt2 = new YieldThread("低级");
        //yt2.setPriority(Thread.MIN_PRIORITY);
        yt2.start();
    }
}
