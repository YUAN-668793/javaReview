package thread.runnableTest;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 15:57
 */
public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread st1 = new Thread(st,"窗口1");
        Thread st2 = new Thread(st,"窗口2");
        Thread st3 = new Thread(st,"窗口3");
        st1.start();
        st2.start();
        st3.start();
    }
}
