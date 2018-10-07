package mianshi.jianzhiOffer;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/7/2018 2:35 PM
 */

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */

/**
 * 列几个例子，发现是斐波那契数列
 */
public class Test10 {
    public int rectCovr(int target){
        if(target<1){
            return 0;
        }else if(target == 2  || target == 1){
            return target;
        }else{
            return rectCovr(target-1) + rectCovr(target-2);
        }
    }
}
