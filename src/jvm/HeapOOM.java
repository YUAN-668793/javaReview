package jvm;

import java.util.ArrayList;
import java.util.List;

/** Java堆溢出
 * VM args:-Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/24/2018 10:26 PM
 */
public class HeapOOM {
    static class OOMObject{

    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        int i = 0;
        while(true){
            list.add(new OOMObject());
            System.out.println(i++);
        }
    }
}
