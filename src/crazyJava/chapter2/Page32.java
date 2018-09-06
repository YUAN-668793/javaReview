package chapter2;

public class Page32 {
	public static void main(String[] args) {
		//浮点数值发生改变
		float af = 5.2345556f;
		System.out.println(af);
		//使用boolean类型的值和字符串进行连接运算时，boolean类型的值会自动转换成字符串
		String str = true +"==";
		System.out.println(str);
		//float fa = 5.16;  5.16默认是double类型，需进行强制转换
		float fa = (float) 5.16;
		String a =  "45";
		int aValue = Integer.parseInt(a);
		System.out.println(aValue);
		byte ba = 5;
		//Page36
		//当一个算术表达式中包含多个基本类型的值时，整个算术表达式的数据类型将发生自动提升，比如下面的sValue-2
		short sValue = 5;
		//sValue = sValue - 2;  报错，sValue-2 表达式被提升到int类型，把int类型赋给左边的short型，引起错误
		sValue = (short)(sValue - 2);
		
		//表达式的类型将严格保持和表达式中最高等级操作数相同的类型
		int val = 3;
		int intrResult = 23/val;
		//输出结果为7
		System.out.println(intrResult);
		
		System.out.println("Hello!"+'a'+7);
		//输出结果为：Hello!a7
		System.out.println('a'+7+"Hello!");
		//输出结果为：104Hello!，将‘a’提升为int型，a变成对应的ASCII值，97，即97+7=104，再与字符串连接
	}
}
