package test.test1;

import java.util.Scanner;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/19 21:10
 */
public class Main {
    public static void main(String[] args) {
        Integer time = 0;
        Scanner sc = new Scanner(System.in);
            time = Integer.parseInt(sc.next());
        Integer[] a= new Integer[time];
        for(int i=0;i<time;i++){
            a[i] = Integer.parseInt(sc.next());
        }
        System.out.println(a);

    }
}
