package crazyJava.chapter7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Page210 {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("孙悟空");
		c.add(6);
		System.out.println("c集合中的元素个数为："+c.size());
		System.out.println("c集合是否包含‘孙悟空’字符串:"+c.contains("孙悟空"));
		c.add("JavaEE企业级应用实战");
		Collection books = new HashSet();
		books.add("JavaEE企业级应用实战");
		books.add("疯狂java讲义");
		c.removeAll(books);
		System.out.println("c中所有的元素为："+c);
		books.retainAll(c);
		System.out.println("books中的所有元素为："+books);
	}
}
