package chapter5;

public class Page135 {
	private static void test() {
		System.out.println("static修饰的类方法");
	}
	private void print(){
		System.out.println("test");
	}
	public static void main(String[] args) {
		Page135 nas = null;
		nas.test();   //静态方法（类方法）在类加载期间就完成
		nas.print(); //实例方法依靠对象的创建而创建
	}
}
