package work.batulu.java8;

/**
 * @author zhangjiayuan@qipeipu.com
 * @date 12/10/2018 3:16 PM
 * @since 1.0.0
 */
public class FormulaImpl  {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a);
            }
        };
        double calcResult = formula.calculate(100);
        double sqrtResult = formula.sqrt(16);
        System.out.println(calcResult+"=="+sqrtResult);
    }


}
