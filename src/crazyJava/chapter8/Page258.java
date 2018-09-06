package chapter8;

public class Page258<T> {
	private T info;
	public Page258(T info) {
		this.info = info;
	}
	public void setInfo(T info) {
		this.info = info;
	}
	public T getInfo() {
		return this.info;
	}
	public static void main(String[] args) {
		Page258<String> al = new Page258<>("苹果");
		System.out.println(al.getInfo());
		Page258<Double> a2 = new Page258<>(5.67);
		System.out.println(a2.getInfo());
	}
}
