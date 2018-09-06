package chapter2;

public class Page28 {
		public static void main(String[] args) {
			//以0开头的整数值是八进制的整数
			int octalValue = 013;
			//以0x或oX开头的整数值是十六进制的整数
			int hexValue1 = 0x13;
			int hexValue2 = 0xaF;
			//定义两个8位的二进制整数
			int binVal1 = 0b11010100;
			byte binVal2 = 0B01101001;
			//输出结果
			System.out.println(octalValue);
			System.out.println(hexValue1);
			System.out.println(hexValue2);
			System.out.println(binVal1);
			System.out.println(binVal2);
		}
}
