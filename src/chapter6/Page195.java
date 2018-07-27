package chapter6;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
/*
 * Random伪随机数
 * ThreadLocalRandom伪随机数用于多线程环境
 */
public class Page195 {
	public static void main(String[] args) {
		Random rand = new Random();
		Random rand2 = new Random(System.currentTimeMillis());
		System.out.println(rand2.nextInt(10));
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		int val = tlr.nextInt(4,20);
		System.out.println("val:"+val);
		System.out.println("rand.nextBoolean():"+rand.nextBoolean());
		byte[] buffer = new byte[16];
		rand.nextBytes(buffer);
		System.out.println(Arrays.toString(buffer));
		System.out.println("rand.nextDouble():"+rand.nextDouble());
		System.out.println("rand.nextDouble():"+rand.nextDouble());
		System.out.println("rand.nextGaussian():"+rand.nextGaussian());
		System.out.println("rand.nextInt():"+rand.nextInt());
		System.out.println("rand.nextInt(26):"+rand.nextInt(26));
		System.out.println("rand.nextLong():"+rand.nextLong());
		
	}
}
