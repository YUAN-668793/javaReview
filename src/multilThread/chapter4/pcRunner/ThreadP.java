package multilThread.chapter4.pcRunner;

/** 生产者线程
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/31/2018 9:28 PM
 */
public class ThreadP extends Thread {
    private MyService myService;
    public ThreadP(MyService myService){
        this.myService = myService;
    }
    @Override
    public void run(){
        for(int i=0;i<Integer.MAX_VALUE;i++){
            myService.set();
        }
    }
}
