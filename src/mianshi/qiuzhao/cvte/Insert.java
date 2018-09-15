package mianshi.qiuzhao.cvte;

/** 插入排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/14/2018 12:49 AM
 */
public class Insert {
    public void insertSort(int[] a){
        int len = a.length;
        int j ;
        int insertNum;
        for(int i=1;i<len;i++){
            j = i-1;
            insertNum = a[i];
            while(j>=0 && insertNum <= a[j]){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
    }

    public static void main(String[] args) {
        int[] a = {1,0,2,6,3,7,8,9};
        Insert is = new Insert();
        is.insertSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }

}
