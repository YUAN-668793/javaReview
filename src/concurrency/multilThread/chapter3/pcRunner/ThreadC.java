package multilThread.chapter3.pcRunner;

import multilThread.chapter3.pcRunner.C;

/** 消费者线程
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 8:29 PM
 */
public class ThreadC extends Thread{
    private C c;
    public ThreadC(C c){
        this.c = c;
    }
    @Override
    public void run(){
        while(true){
            c.getValue();
        }
    }
}
