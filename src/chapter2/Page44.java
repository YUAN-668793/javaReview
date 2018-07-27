package chapter2;

public class Page44 {
	public static void main(String[] args) {
		AMessage t1 = new AMessage();
		AMessage t2 = new AMessage();
		//t1，t2是同一个类两个实例的引用
		System.out.println(t1 == t2);
		//t2，t3指向同一个对象
		AMessage t3 = t2;
		System.out.println(t3 == t2);
		
		//Page45
		int a = 5;
		int b = 10;
		if(a>4 | b++>10) {
			//输出结果值为：   a的值是：5，b的值是：11
			System.out.println("a的值是："+a+"，b的值是："+b);
		}
		
		//对于短路逻辑或||而言，如果第一个操作数返回true, || 将不再对第二个操作数求值，直接返回true
		int c = 5;
		int d = 10;
		if(c>4 || d++>10) {
			//输出结果值为：   a的值是：5，b的值是：10
			System.out.println("a的值是："+c+"，b的值是："+d);
		}
		
		//三目运算符
		String str = 5>3 ? "5大于3":"5小于3";
		System.out.println(str);
	}

}
