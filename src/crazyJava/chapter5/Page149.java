package chapter5;

interface interfaceA{
	int PRO_A = 5;
	void testA();
}
interface interfaceB{
	int PRO_B = 6;
	void testB();
}
interface interfaceC extends interfaceA,interfaceB{
	int PRO_C = 7;
	void testC();
}
public class Page149 {
	public static void main(String[] args) { //接口中的默认成员变量使用public static final修饰，故类.变量的形式可以访问到
		System.out.println(interfaceC.PRO_A);
		System.out.println(interfaceC.PRO_B);
		System.out.println(interfaceC.PRO_C);
	}
}
