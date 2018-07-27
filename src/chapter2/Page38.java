package chapter2;

public class Page38 {
	public static void main(String[] args) {
		//整型除法将导致结果截断取整
		//正常除法运算
		double a = 5.2;
		double b = 3.1;
		double div = a/b;
		System.out.println(div);
		//输出正无穷大
		System.out.println("5除以0.0的结果是："+5/0.0);   
		//输出负无穷大
		System.out.println("-5除以0.0的结果是："+-5/0.0);
		//抛出异常
		System.out.println("-5除以0的结果是："+5/0);
	}
}
