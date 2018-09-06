package chapter3;

public class Page64 {
	public static void main(String[] args) {
		/*
		 * 静态初始化
		 */
		//定义一个int数组类型的变量。变量名为intArr
		int[] intArr;
		//使用静态初始化，初始化数组时只指定数组元素的初始值，不指定数组长度
		intArr = new int[] {5,6,8,20};
		//定义一个Object数组类型的变量，变量名为objArr
		Object[] objArr;
		//使用静态初始化，初始化数组时数组0元素的类型是定义数组时所指定的数组元素类型的子类
		objArr = new String[] {"Java","李刚"};
		Object[] objArr2;
		//使用静态初始化
		objArr2 = new Object[] {"Java","李刚"};
		System.out.println(objArr[1]);
		objArr[0] = "Spring";
		System.out.println(objArr[0]);
		
		/*
		 * 动态初始化
		 */
		int[] prices = new int[5];
		Object[] books = new String[4];
	}
}
