package multilThread.chapter1;

/** yeild()方法
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 8:15 PM
 */
public class Page42 extends Thread{
    @Override
    public void run(){
        long beginTime = System.currentTimeMillis();
        int count = 0;
        for(int i=0;i<5000000;i++){
            Thread.yield();
            count = count+(i+1);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("用时："+(endTime-beginTime)+"毫秒！");
    }

    public static void main(String[] args) {
        Page42 p = new Page42();
        p.start();
    }
}
