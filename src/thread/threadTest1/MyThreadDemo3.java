package thread.threadTest1;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 14:30
 */
public class MyThreadDemo3 {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("关羽");
        td2.setName("张飞");
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        Thread.currentThread().setName("刘备");
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

}
