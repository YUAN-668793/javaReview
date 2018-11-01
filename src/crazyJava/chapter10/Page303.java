package crazyJava.chapter10;

@FunctionalInterface
public interface Page303 {
	static void foo() {
		System.out.println("foo类方法");
	}
	default void bar() {
		System.out.println("默认方法");
	}
	void test();//只定义一个抽象方法
}
