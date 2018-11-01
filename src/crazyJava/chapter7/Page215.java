package crazyJava.chapter7;

import java.util.stream.IntStream;
/*
 * Java8新增的Stream
 */
public class Page215 {
	public static void main(String[] args) {
		IntStream is = IntStream.builder().add(20).add(13).add(-2).add(18).build();
		System.out.println("is所有元素的最大值："+is.max().getAsInt());
		System.out.println("is所有元素的最小值："+is.min().getAsInt());
		System.out.println("is所有元素的总和："+is.sum());
		System.out.println("is所有元素的总数："+is.count());
		System.out.println("is所有元素的平均值："+is.average());
		System.out.println("is所有元素的平方是否都大于20："+is.allMatch(ele->ele*ele>20));
		System.out.println("is是否包含任何元素的平方都大于20："+is.anyMatch(ele->ele*ele>20));
	}
}
