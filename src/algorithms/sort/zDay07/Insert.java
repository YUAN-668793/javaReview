package algorithms.sort.zDay07;

/** 插入排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/22/2018 10:39 AM
 */
public class Insert {
    public static void insert(int[] a){
        int len = a.length;
        int insertNum;
        int j;
        for(int i=1;i<len;i++){
            j = i-1;
            insertNum = a[i];
            while(j>=0 && insertNum<a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
        for(int num:a){
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,6,5,8,9,8,7,4};
        Insert.insert(a);
    }
}
