package chapter6;

import java.math.BigDecimal;
/*
 * 预防精度损失
 */
public class Page197 {
	public static void main(String[] args) {
		System.out.println("使用String作为BigDecimal构造器参数"); // 采用此种方法
		BigDecimal f1 = new BigDecimal("0.05");
		BigDecimal f2 = BigDecimal.valueOf(0.01);
		BigDecimal f3 = new BigDecimal(0.05);
		System.out.println(f1.add(f2));
		System.out.println(f1.subtract(f2));
		System.out.println(f1.multiply(f2));
		System.out.println(f1.divide(f2));
		System.out.println("使用double作为BigDecimal构造器参数");
		System.out.println(f3.add(f2));
		System.out.println(f3.subtract(f2));
		System.out.println(f3.multiply(f2));
		System.out.println(f3.divide(f2));
	}
}
