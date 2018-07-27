package algorithms;

import java.util.Scanner;

/** 排序算法类模板
 * 大多数情况下，我们的排序代码只会通过两个方法操作数据，less()方法对元素进行比较，exch()方法将元素交换位置
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/27 12:19
 */
public class Example {
    public static void sort(Comparable[] a){

    }
    public static boolean less(Comparable v, Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i, int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void show(Comparable[] a){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
            System.out.println();
        }
    }
    public static boolean isSoeted(Comparable[] a){
        for(int i=0;i<a.length;i++)
            if(less(a[i],a[i-1])) return false;
            return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = null;
        while(sc.hasNext()){
            str += sc.next()+"#";
        }
        String[] a = str.split("#");
        //从标准输入读取字符串，将他们排序并输出
        sort(a);
        assert isSoeted(a);
        show(a);
    }
}
