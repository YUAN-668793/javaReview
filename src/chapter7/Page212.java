package chapter7;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class Page212 {
	public static void main(String[] args) {
		//创建一个集合
		Collection books = new HashSet();
		books.add("轻量级JavaEE企业应用实战");
		books.add("疯狂Java讲义");
		books.add("疯狂Android讲义");
		Iterator it = books.iterator();
		while(it.hasNext()) {
			String book = (String)it.next();
			if(book.equals("疯狂Android讲义")) {
				it.remove();
			}
			book="测试字符串";
		}System.out.println(books);
	}
}
