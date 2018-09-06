package chapter6;

import java.util.Calendar;

/*
 * Calendar类
 */
public class Page200 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);
		System.out.println(c.get(Calendar.DATE));
		c.set(2003, 10,23,12,32,23);
		System.out.println(c.getTime());
		c.add(Calendar.YEAR, -1);
		System.out.println(c.getTime());
		c.roll(Calendar.MONTH, -8);
		System.out.println(c.getTime());
	}
}
