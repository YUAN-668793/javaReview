package crazyJava.chapter6;

public class Page187 {
	public static void main(String[] args) throws Exception{
		//获取java程序关联的运行时对象
		Runtime rt = Runtime.getRuntime();
		System.out.println("处理器数量："+rt.availableProcessors());
		System.out.println("空闲内存数："+rt.freeMemory());
		System.out.println("总内存数："+rt.totalMemory());
		System.out.println("可用最大内存数："+rt.maxMemory());
		//运次记事本程序
		rt.exec("notepad.exe");
	}
}
