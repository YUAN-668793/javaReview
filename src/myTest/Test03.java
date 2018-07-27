package myTest;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public interface Test03 {
    public final String str1 = "1234" ;
    static void run(){
        System.out.println("static method");
    };
    default void start(){
        System.out.println("default method");
    }

    public static void main(String[] args) {
        Test03.run();
    }
}
