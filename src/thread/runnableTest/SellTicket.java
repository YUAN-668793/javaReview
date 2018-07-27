package thread.runnableTest;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 15:55
 */
public class SellTicket implements Runnable{
    private static int tickets = 100;
    private Object obj = new Object();
    private int i = 0;
    @Override
    public void run() {
        if (i % 2 == 0) {
            while (true) {
                synchronized (this) {
                    if (tickets > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
                    }
                }
            }

        } else {
            selltickets();
        }
        i++;
    }

    private synchronized void selltickets() {
        while (true) {
                if (tickets > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在出售第" + (tickets--) + "张票");
                }
        }
    }
}
