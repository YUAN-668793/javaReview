package mainshiTest;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/1 9:27
 */
public class Test1 {
    public static void main(String[] args) {
        Object o = new Object(){
            public boolean equals(Object obj){
                return true;
            }
        };
        System.out.println(o.equals("FRED"));
    }
}
