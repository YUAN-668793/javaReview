package review;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/12 20:58
 */
public class Test6 {
    public static void main(String[] args) throws Exception{
        BlockingQueue<String> bq = new ArrayBlockingQueue<String>(2);
        bq.put("java");
        bq.put("java");
        bq.put("java");
    }
}
