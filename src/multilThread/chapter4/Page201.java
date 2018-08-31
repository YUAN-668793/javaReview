package multilThread.chapter4;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/31/2018 8:10 PM
 */
public class Page201 extends Thread {
    private Page200 service;
    public Page201(Page200 service){
        this.service = service;
    }
    @Override
    public void run(){
        service.testMethod();
    }

    public static void main(String[] args) {
        Page200 service = new Page200();
        Page201 a1 = new Page201(service);
        Page201 a2 = new Page201(service);
        Page201 a3 = new Page201(service);
        Page201 a4 = new Page201(service);
        Page201 a5 = new Page201(service);
        Page201 a6 = new Page201(service);
        a1.start();
        a2.start();
        a3.start();
        a4.start();
        a5.start();
    }
}
