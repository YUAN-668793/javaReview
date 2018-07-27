package thread.threadTest1;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 12:32
 */
public class MythreadDemo {
    public static void main(String[] args) {
        MyThread my1 = new MyThread("zjycode");
        MyThread my2 = new MyThread("jiayuan");
        MyThread my3 = new MyThread("baichiy");
        my1.start();
        my2.start();
        my3.start();
        System.out.println(Thread.currentThread().getName());
    }
}
