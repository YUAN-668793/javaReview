package chapter5;

public class Page140 {
	public static void main(String[] args) {
		final int a = 5+2;
		final double b = 1.2/3;
		final String str = "疯狂"+"Java";
		final String book = "疯狂Java讲义:"+99.0;
		final String book2 = "疯狂Java讲义:"+String.valueOf(99.0);  //调用方法，无法在编译时确定下来，故不会当成宏变量处理
		System.out.println(book == "疯狂Java讲义:99.0");
		System.out.println(book2 == "疯狂Java讲义:99.0");
	}		
}
