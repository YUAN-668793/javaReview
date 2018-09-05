package jvm;

/** 大对象直接进入老年代
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/5/2018 6:20 PM
 */
public class TestTemp {
    private static int _1MB = 1*1024*1024;
    public static void main(String[] args) {
       byte[] a = new byte[11*_1MB];
    }
}
