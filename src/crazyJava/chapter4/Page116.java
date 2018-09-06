package chapter4;

public class Page116 {
	public static void main(String[] args) {
		double d = 13.4;
		long l = (long)d;
		System.out.println(l);
		int in = 5;
		//boolean b = (boolean)in;
		Object obj = "Hello";
		String objStr = (String)obj;
		System.out.println(objStr);
		Object objPri = new Integer(5);
		//用该方法判断是否可以转换成功，使强制类型转换更加安全 ,instanceof运算符的前一个操作数通常是一个引用类型变量，后一个操作数通常是一个类，前后操作数要么相同，要么是继承关系
		//instanceof判断前一个对象是否是后一个类的实例
		if(objPri instanceof String) {			
			String str = (String)objPri;
		}
	}
}
