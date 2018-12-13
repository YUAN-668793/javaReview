package work.batulu.test;

/**
 * @author zhangjiayuan@qipeipu.com
 * @date 12/12/2018 1:46 PM
 * @since 1.0.0
 */
public class Test {
    public static void main(String[] args) {
        Object obj1 = null;
        Object obj2 = new Object();
        if(obj1 == null){
            System.out.println(1);
        }if(obj2 == null){
            System.out.println(2);
        }else {
            System.out.println(3);
        }
    }
}
