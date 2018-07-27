package chapter4;

public class Page81 {
	public void info() {
		System.out.println("简单的info方法");
	}
	public static void staticinfo() {
		System.out.println("简单的静态info方法");
	}
	public static void main(String[] args) {   //主函数为静态方法
		/*
		 * main()是静态方法，而info()是非静态方法
		 *调用main方法的是该类本身，而不是该类的实例
		 *因此省略的this无法指向有效的对象
		 */
		//info(); 报错，没有static修饰的方法只能使用对象作为调用者来调用，即下面的解决方案
		//属于实例的方法采用对象.方法的形式来调用
		Page81 pa = new Page81();
		pa.info();
		
		//直接调用静态方法
		staticinfo();
		//容易混淆：Java编程时不要使用对象去调用static成员变量和方法，即不建议采用以下方式
		pa.staticinfo();
	}
}
