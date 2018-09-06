package chapter11;

import java.io.FileOutputStream;
import java.nio.charset.Charset;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jiayuan on 2018/3/6.
 */
public class Page342{
    public static void main(String[] args) throws Exception{
        //复制文件
        Files.copy(Paths.get("FilesTest.java"),new FileOutputStream("a.txt"));
        //判断FilesTest.java是否为隐藏文件
        System.out.println("FilesTest.java是否为隐藏文件："+Files.isHidden(Paths.get("FilesTest.java")));
        //一次性读取FileTest.java文件的所有行
        List<String> lines = Files.readAllLines(Paths.get("FilesTest.java"), Charset.forName("gbk"));
        System.out.println(lines);
        //判断指定文件的大小
        System.out.println("FilesTest.java的大小为："+Files.size(Paths.get("FilesTest.java")));
        List<String> poem = new ArrayList<>();
        poem.add("水晶潭底银鱼跃");
        poem.add("清徐风中壁竿横");
        //直接将多个字符串内容写入指定文件夹
        Files.write(Paths.get("pome.txt"),poem,Charset.forName("gbk"));
        Files.list(Paths.get(".")).forEach(path-> System.out.println(path));
        Files.lines(Paths.get("FileTest.java"),Charset.forName("gbk")).forEach(line-> System.out.println(line));
        FileStore cStore = Files.getFileStore(Paths.get("C:"));
        System.out.println("C：共有空间："+cStore.getTotalSpace());
        System.out.println("C：可用空间："+cStore.getUsableSpace());
    }
}
