package multilThread.chapter2;

/**ThreadB 线程
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 1:43 PM
 */
public class ThreadB extends Thread {
    private Page61 object;
    public ThreadB(Page61 object){
        this.object = object;
    }
    @Override
    public void run(){
        super.run();
        object.methodB();
    }
}
