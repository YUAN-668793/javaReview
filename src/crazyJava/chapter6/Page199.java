package chapter6;

import java.util.Date;

public class Page199 {
	public static void main(String[] args) {
		Date d1 = new Date();
		Date d2 = new Date(System.currentTimeMillis()+100);
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.before(d2));
	}
}
