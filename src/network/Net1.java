package network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/5/1 20:56
 */
public class Net1 {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("DESKTOP-LCGQH2C");
        //InetAddress address = InetAddress.getByName("192.168.25.1");
        String name = address.getHostName();
        String ip = address.getHostAddress();
        System.out.println(name+"=="+ip);
    }
}
