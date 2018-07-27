package thread.threadTest1;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 14:24
 */
public class MyThreadDemo2 {
    public static void main(String[] args) {
        ThreadYield ty1 = new ThreadYield();
        ThreadYield ty2 = new ThreadYield();
        ThreadYield ty3 = new ThreadYield();
        ty1.setName("jack");
        ty2.setName("mary");
        ty3.setName("mike");

        ty1.start();
        ty2.start();
        ty3.start();
    }
}
