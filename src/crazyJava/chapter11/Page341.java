package crazyJava.chapter11;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Jiayuan on 2018/3/6.
 */
public class Page341 {
    public static void main(String[] args) throws Exception {
        //以当前路径来创建Path对象
        Path path = Paths.get(".");
        System.out.println("path的根路径："+path.getNameCount());
        //获取path对应的绝对路径
        Path absoultePath = path.toAbsolutePath();
        System.out.println(absoultePath);
        //获取绝对路径的根路径
        System.out.println(absoultePath.getRoot());
        //获取绝对路径所包含的路径数量
        System.out.println("absoultePath里所包含的路径数量："+absoultePath.getNameCount());
        System.out.println(absoultePath.getName(3));
        Path path2 = Paths.get("g:","publish","codes");
        System.out.println(path2);
    }
}
