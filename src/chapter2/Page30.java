package chapter2;

public class Page30 {
	public static void main(String[] args) {
		//直接指定单个字符作为字符值
		char aCahr = 'a';
		//使用转义字符来作为字符值
		char enterChar = '\r';
		//使用Unicode编码值来指定字符值
		char ch = '\u9999';
		System.out.println(ch);
		//定义一个“疯”字符值
		char zhong = '疯';
		//直接将一个char变量当成int类型变量使用
		int zhongValue = zhong;
		System.out.println(zhongValue);
		//直接把一个0~65535范围内的int整数赋给一个char变量
		char c = 97;
		System.out.println(c);
	}
}
