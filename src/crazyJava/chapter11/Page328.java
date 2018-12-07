package crazyJava.chapter11;

import java.io.FileReader;
import java.io.IOException;

public class Page328 {
	public static void main(String[] args) throws IOException{
		//创建字符输入流
		try(FileReader fr = new FileReader("FileReaderTest.java")){
			//创建一个长度为32的“竹筒”
			char[] cbuf = new char[32];
			//用于保存实际读取的字符数
			int hasRead = 0;
			//使用循环来重复趋势“取水”过程
			while((hasRead=fr.read(cbuf))>0) {
				//取出“竹筒”中的水滴（字符），将字符数组转换成字符串输入！
				System.out.println(new String(cbuf,0,hasRead));
			}
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
}
