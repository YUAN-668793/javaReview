package mianshi.jianzhiOffer;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/7/2018 3:12 PM
 */

/**
 * 给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 */

/**
 * 注意，这里的exponent可能为负数，正数或0
 */
public class Test12 {
    public double power(double base, int exponent) {
        double result = 1;
        if(exponent>0){
            for(int i=0;i<exponent;i++){
                result = base * result;
            }
        }if(exponent<0){
            exponent = -exponent;
            for(int i=0;i<exponent;i++){
                result = base * result;
            }
            return 1.0/result;
        }
        if(exponent == 0){
            result = 1;
        }
        return result;
    }
}
