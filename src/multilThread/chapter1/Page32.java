package multilThread.chapter1;

/** stop暴力停止线程
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 6:29 PM
 */
public class Page32 extends Thread {
    private int i = 0;
    @Override
    public void run(){
        try{
            while(true){
                i++;
                System.out.println("i="+i);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try{
            Page32 p = new Page32();
            p.start();
            Thread.sleep(8000);
            p.stop();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
