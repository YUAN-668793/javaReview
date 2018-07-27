package chapter13;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Page403Client {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket("127.0.0.1",30000);
        //将Socket对应的输入流包装成BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line = br.readLine();
        System.out.println("来自服务器的数据："+line);
        br.close();
        socket.close();
    }
}
