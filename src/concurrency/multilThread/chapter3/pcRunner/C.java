package concurrency.multilThread.chapter3.pcRunner;

/** 消费者
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/30/2018 8:24 PM
 */
public class C {
    private String lock;
    public C(String lock){
        this.lock = lock;
    }
    public void getValue(){
        try {
            synchronized (lock) {
                if (ValueObject.value.equals("")) {
                    lock.wait();
                }
                System.out.println("get的值是" + ValueObject.value);
                ValueObject.value = "";
                lock.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
