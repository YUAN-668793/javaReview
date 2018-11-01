package crazyJava.chapter9;

import java.io.FileInputStream;

public class Page288 {
	public static void main(String[] args) throws Exception {
		//因为test()方法声明抛出IOException异常
		//所以调用该方法代码要么处于try...catch块中
		//要么处于另一个带throws声明抛出的方法中
		test();
	}
	public static void test() throws Exception {
		//详细见课本
		FileInputStream fis = new FileInputStream("a.txt");
	}
}
