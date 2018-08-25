package jvm;

/**新生代Minor GC
 * vm: -verbose:gc -Xms20M -Xmx20M -Xmn10m -XX:+PrintGCDetails -XX:SurvivorRatio=8
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/25/2018 3:11 PM
 */
public class Gc {
    private static final int _1MB = 1024*1024;

    public static void main(String[] args) {
        byte[] allocation1,allocation2,allocation3,allocation4;
        allocation1 = new byte[2*_1MB];
        allocation2 = new byte[2*_1MB];
        allocation3 = new byte[2*_1MB];
        allocation4 = new byte[4*_1MB];  //出现一次Minor GC
    }
}
