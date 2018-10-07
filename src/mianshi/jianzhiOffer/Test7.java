package mianshi.jianzhiOffer;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/7/2018 9:54 AM
 */
public class Test7 {
        public int fibonacci(int n) {
            int one = 0;
            int two = 1;
            if(n <= 0) return one;
            if(n == 1) return two;
            int result = 0;
            for(int i = 2; i <= n; i++){
                result = one + two;
                one = two;
                two = result;
            }
            return result;
        }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.fibonacci(5);
        System.out.println();
    }
}
