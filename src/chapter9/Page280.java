package chapter9;

public class Page280 {
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a/b;
			System.out.println("两个数相除的结果是："+c);
		}catch(IndexOutOfBoundsException ie) {
			System.out.println("数组越界");
		}catch(NumberFormatException ne) {
			System.out.println("数字格式异常");
		}catch(ArithmeticException ae) {
			System.out.println("算数异常");
		}catch(Exception e) {
			System.out.println("未知异常");
		}finally {
			System.out.println("程序结束");
		}
	}
}
