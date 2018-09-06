package chapter5;

interface Eatable{
	void taste();
}
interface Flyable{
	void fly(String weather);
}
interface Addable{
	int add(int a,int b);
}
/*
 * Lambda表达式
 */
public class Page166 {
	public void eat(Eatable e) {
		System.out.println(e);
		e.taste();
	}
	public void drive(Flyable f) {
		System.out.println("我正在驾驶"+f);
		f.fly("天气晴朗");
	}
	public void test(Addable a) {
		System.out.println("5与3的和为："+a.add(5, 3));
	}
	public static void main(String[] args) {
		Page166 lq = new Page166();
		lq.eat(()->System.out.println("苹果味道不错"));
		lq.drive(weather->{
			System.out.println("今天天气是："+weather);
			System.out.println("直升机飞行平稳");
		});
		lq.test((a,b)->a+b);
	}
}
