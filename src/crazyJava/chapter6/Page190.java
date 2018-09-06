package chapter6;

import java.util.Objects;

public class Page190 {
	static Page190 obj;
	public static void main(String[] args) throws Exception {
		//输出一个null对象的hashCode值，输出0
		System.out.println(Objects.hashCode(obj));
		//输出一个null对象的toString值,输出null
		System.out.println(Objects.toString(obj));
		//要求obj不能为null，如果obj为null则引发异常
		System.out.println(Objects.requireNonNull(obj));
	}
}
