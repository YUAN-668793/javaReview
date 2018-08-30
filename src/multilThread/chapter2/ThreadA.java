package multilThread.chapter2;

/** ThreadA线程
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 1:41 PM
 */
public class ThreadA extends Thread{
    private Page61 object;
    public ThreadA(Page61 object){
        this.object = object;
    }
    @Override
    public void run(){
        super.run();
        object.methodA();
    }
}
