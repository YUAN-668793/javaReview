package test.test1;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/11/2018 8:23 AM
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        System.out.println("begin");
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }).start();
        System.out.println("end");
    }
}
