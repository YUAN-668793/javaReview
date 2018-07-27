package chapter4;

class Base{
	public double size;
	public String name;
	public Base(double size,String name) {
		this.size = size;
		this.name = name;
	}
}
public class Page112  extends Base{
		public String color;
		public Page112(double size, String name, String color) {
			//通过调用父类构造器的初始化过程
			super(size,name);
			this.color = color;
		}
		public static void main(String[] args) {
			Page112 s = new Page112(5.6,"测试对象","红色");
			//输出Page112对象的三个实例变量
			System.out.println(s.size+"=="+s.name+"=="+s.color);
		}
}
