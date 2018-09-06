package crazyJava.chapter13;

import java.net.URLDecoder;
import java.net.URLEncoder;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Page394 {
    public static void main(String[] args) throws Exception{
        String keyWord = URLDecoder.decode("https://www.so.com/s?ie=utf-8&fr=none&src=360sou_newhome&q=%E8%AE%A1%E7%AE%97%E6%9C%BA","UTF-8");
        System.out.println(keyWord);
        String urlstr = URLEncoder.encode("计算机","GBK");
        System.out.println(urlstr);
    }
}
