package crazyJava.java8.deep;

/** 使用lambda表达式实现Runnable
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/1/2018 3:27 PM
 */
public class Test1 {
    public static void main(String[] args) {
        //Java8之前
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Before Java8,too much code for too little to do");
            }
        }).start();
        //Java8之后
        new Thread(()-> System.out.println("In Java8,Lambda expression rocks!")).start();

    }
}
