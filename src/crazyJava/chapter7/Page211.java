package crazyJava.chapter7;

import java.util.Collection;
import java.util.HashSet;

public class Page211 {
	public static void main(String[] args) {
		//创建一个集合
		Collection books = new HashSet();
		books.add("轻量级JavaEE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		//调用foreach方法遍历集合  当程序调用Iterable的foreach（Consumer action)遍历集合元素时，程序会依次将集合元素传给Consumemr的accept方法，Consumer为函数式接口
		books.forEach(obj->System.out.println("迭代集合元素:"+obj));
	}
}
