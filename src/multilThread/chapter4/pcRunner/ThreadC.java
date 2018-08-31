package multilThread.chapter4.pcRunner;

/** 消费者线程
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/31/2018 9:29 PM
 */
public class ThreadC extends Thread {
    private MyService myService;
    public ThreadC(MyService myService){
        this.myService = myService;
    }
    @Override
    public void run(){
        for(int i=0;i<Integer.MAX_VALUE;i++){
            myService.get();
        }
    }
}
