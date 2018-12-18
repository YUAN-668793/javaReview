package work.temp;

/**
 * @author zhangjiayuan@qipeipu.com
 * @date 2018/12/17 17:20
 * @since 1.0.0
 */
public class Test1 {
    public void calc1(){
        int[][] array = new int[10000][10000];
        long start = System.currentTimeMillis();
        for (int j=0; j<10000; j++) {
            for (int i=0; i<10000; i++) {
                array[i][j] = 0;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("方式一："+(end-start));
    }

    public void calc2(){
        int[][] array = new int[10000][10000];
        long start = System.currentTimeMillis();
        for (int i=0; i<10000; i++) {
            for (int j=0; j<10000; j++) {
                array[i][j] = 0;
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("方式二："+(end-start));
    }

    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.calc1();
        test1.calc2();
    }
}
