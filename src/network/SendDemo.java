package network;

import java.io.IOException;
import java.net.*;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 21:19
 */
public class SendDemo {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        byte[] bys = "hello,udp!".getBytes();
        int length = bys.length;
        InetAddress address = InetAddress.getByName("192.168.25.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bys,length,address,port);
        ds.send(dp);
        ds.close();
    }
}
