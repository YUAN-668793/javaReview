package crazyJava.chapter5;

public class Page154 {
	private String prop = "外部类的实例变量";
	private class InClass{
		private String prop = "内部类的实例变量";
		public void info() {
			String prop = "局部变量";
			System.out.println("外部类的实例变量值:"+Page154.this.prop);
			System.out.println("内部类的实例变量值:"+this.prop);
			System.out.println("局部变量的值:"+prop);
		}
	}
	public void test(){
		InClass in = new InClass();
		in.info();
	}
	public static void main(String[] args) {
		new Page154().test();
	}
}
