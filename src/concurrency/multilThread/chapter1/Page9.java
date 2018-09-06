package multilThread.chapter1;

/** 不共享数据
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/28/2018 2:46 PM
 */
public class Page9 extends Thread {
    private int count = 5;
    public Page9(String name){
        super();
        this.setName(name);
    }
    @Override
    public void run(){
        super.run();
        while(count>0){
            count--;
            System.out.println("由"+this.currentThread().getName()+"计算，count="+count);
        }
    }

    public static void main(String[] args) {
        Page9 a = new Page9("A");
        Page9 b = new Page9("B");
        Page9 c = new Page9("C");
        a.start();
        b.start();
        c.start();
    }
}
