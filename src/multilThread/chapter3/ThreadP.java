package multilThread.chapter3;

/** 生产者线程
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 8:27 PM
 */
public class ThreadP extends Thread{
    private P p;
    public ThreadP(P p){
        this.p = p;
    }
    @Override
    public void run(){
        while(true){
            p.setValue();
        }
    }

}
