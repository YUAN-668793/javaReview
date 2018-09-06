package chapter11;

import java.io.File;

public class Page323 {
	public static void main(String[] args) throws Exception {
		//以当前路径创建一个File对象
		File file = new File(".");
		//直接获取文件名
		System.out.println(file.getName());
		//获取相对路径的父路径可能出错，下面输出null
		System.out.println(file.getParent());
		//获取绝对路径
		System.out.println(file.getAbsoluteFile());
		//获取上一级路径
		System.out.println(file.getAbsoluteFile().getParent());
		//在当前路径下创建一个临时文件
		File tmpFile = File.createTempFile("aaa", ".txt",file);
		//指定JVM退出时删除该文件
		tmpFile.deleteOnExit();
		//以系统当前时间作为新文件名来创建新文件
		File newFile = new File(System.currentTimeMillis()+"");
		System.out.println("newFile文件对象是否存在："+newFile.exists());
		//以指定newFile对象来创建一个文件
		newFile.createNewFile();
	}
}	
