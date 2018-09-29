package concurrency.multilThread.chapter1;

/**继承Thread类
 * 注意查看运行结果，在使用多线程技术时，代码的运行结果与代码执行顺序或调用顺序是无关的
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 9:08 AM
 */
public class Page5 extends Thread {
    @Override
    public void run(){
        //super.run();
        System.out.println("MyThread");
    }

    public static void main(String[] args) {
        Page5 p = new Page5();
        p.start();
        //p.start();   多次调用出现 Exception in thread "main" java.lang.IllegalThreadStateException
        System.out.println("run over");
    }
}
