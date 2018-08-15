package mianshi;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/15 14:42
 */
public class Test1 {
    public static void main(String[] args) {
        final Business business = new Business();
        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<2;i++){
                    business.subMethod();
                }
            }
        });
    }

       static  class Business {
            private boolean subFlag = true;

            public synchronized void mainMethod() {
                while (subFlag) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName() + ":main thread running loop count:" + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                subFlag = true;
                notify();
            }

            public synchronized void subMethod() {
                while (!subFlag) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                for (int i = 0; i < 10; i++) {
                    System.err.println(Thread.currentThread().getName() + " : sub thread running loop count -- " + i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                subFlag = false;
                notify();
            }
        }
    }
