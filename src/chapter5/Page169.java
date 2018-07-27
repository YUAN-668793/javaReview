package chapter5;

/*
 * Lambda表达式.引用类方法
 */
@FunctionalInterface
interface Converter{
	Integer convert(String from);
}
interface Converter2{
	Integer index(String from);
}
public class Page169 {
	public void con1(Converter c) {
		Integer val = c.convert("10");
		System.out.println("转化后的值为:"+val);
	}
	public void con2(Converter2 c2) {
		Integer val2 = c2.index("20");
		System.out.println("2索引后的值为:"+val2);
	}
	public void con2(Converter c) {
		Integer val2 = c.convert("20");
		System.out.println(val2);
	}
	public static void main(String[] args) {
		Page169 converter1 = new Page169();
		converter1.con1(from->Integer.valueOf(from));
		//Page169 converter2 = Integer::valueof;
		Page169 converter2 = new Page169();
		//converter2.con2(from->"fkit.org".indexOf(from));
	}
}
