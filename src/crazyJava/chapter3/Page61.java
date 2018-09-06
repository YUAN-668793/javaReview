package chapter3;

public class Page61 {
	public static void main(String[] args) {
		
		/*
		 * break跳出当前循环
		 * continue忽略continue语句之后的代码
		 * return结束循环体所属的方法
		 * 
		 */
		//外层循环，outer作为标识符
			outer:
				for(int i = 0;i < 5;i++) {
					for(int j = 0;j < 3; j++) {
						System.out.println("i的值为："+i+"j的值为："+j);
						if(j == 1) {
							//跳出outer标签所标识的循环
							break outer;
						}
					}
				}
	}
}
