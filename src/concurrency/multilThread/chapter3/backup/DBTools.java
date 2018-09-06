package multilThread.chapter3.backup;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/31/2018 9:23 AM
 */
public class DBTools {
    volatile private boolean prevIsA = false;
    synchronized public void backupA(){
        try{
            while(prevIsA == true){
                wait();
            }
            for(int i=0;i<5;i++){
                System.out.println("★★★★★");
            }
            prevIsA = true;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    synchronized public void backupB(){
        try{
            while (prevIsA == false){
                wait();
            }
            for(int i=0;i<5;i++){
                System.out.println("☆☆☆☆☆");
            }
            prevIsA = false;
            notifyAll();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
