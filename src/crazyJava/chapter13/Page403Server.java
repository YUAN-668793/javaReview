package crazyJava.chapter13;

import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Page403Server {
    public static void main(String[] args) throws Exception{
        //创建一个ServerSocket,用于监听客户端socket的连接请求
        ServerSocket ss = new ServerSocket(30000);
        //采用循环不断接收来自客户端的请求
        while(true){
            //每当接收到客户端的请求时，服务器端也对应产生一个Socket
            Socket s = ss.accept();
            //将socket对应的输出流包装成PrintStream
            PrintStream ps = new PrintStream(s.getOutputStream());
            ps.println("您好，您收到了服务器的新年祝福");
            //关闭输入流，关闭Socket
            ps.close();
            s.close();
        }
    }
}
