package test.test1;

import java.util.concurrent.Executors;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/11/2018 8:26 AM
 */
public class Test2 {
    public static void main(String[] args) throws Exception {
        System.out.println("begin");
        Executors.newSingleThreadExecutor().submit( new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        });
        System.out.println("end");
    }
}
