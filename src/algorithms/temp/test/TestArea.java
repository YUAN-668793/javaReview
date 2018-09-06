package algorithms.temp.test;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/27 15:08
 */
public class TestArea {
    public static void sort(Comparable[] a){
        int N = a.length;
        for(int i=0;i<N;i++){
            int min = i;
            for(int j = i+1;j<N;j++){
                if(less(a[j],a[min])){
                    min =j;
                    exch(a,i,min);
                }
            }
        }
        for(Comparable result:a){
            System.out.print(result+" ");
        }
    }
    public static boolean less(Comparable v,Comparable w){
        return v.compareTo(w)<0;
    }
    public static void exch(Comparable[] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void main(String[] args) {
        Integer[] te = new Integer[]{8,1,4,5,6,7,-1};
        sort(te);
    }
}
