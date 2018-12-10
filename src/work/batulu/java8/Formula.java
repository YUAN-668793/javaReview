package work.batulu.java8;

/** 允许接口中有默认方法实现
 * @author zhangjiayuan@qipeipu.com
 * @date 12/10/2018 3:14 PM
 * @since 1.0.0
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a){
        return Math.sqrt(a);
    }
}
