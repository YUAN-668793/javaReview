package multilThread.chapter1;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 8:21 PM
 */
public class Page43 extends  Thread {
    /*public final static int MIN_PRIORITY = 1;
    public final static int NORM_PRIORITY = 5;
    public final static int MAX_PRIORITY = 10;*/
    @Override
    public void run(){
        System.out.println("Thread run priority:"+this.getPriority());
        Page44 p = new Page44();
        p.start();
    }
}
