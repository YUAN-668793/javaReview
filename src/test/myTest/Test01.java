package test.myTest;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public abstract class Test01 {
    private int i ;
    public abstract void run();
    public static void start(){
        System.out.println("static method");
    };
    public Integer calc(){
        return 0;
    }

    public static void main(String[] args) {
        Test01.start();

    }
}
