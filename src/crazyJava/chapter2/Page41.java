package chapter2;

public class Page41 {
	public static void main(String[] args) {
		//位运算，转化为补码形式
		System.out.println(5 & 9);   //将输出1
		System.out.println(5 | 9);	  //将输出13
		
		System.out.println(~-5);  	//将输出4
		System.out.println(5 ^ 9);  //将输出12
	}
}
