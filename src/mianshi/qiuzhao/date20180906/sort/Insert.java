package mianshi.qiuzhao.date20180906.sort;

/** 插入排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 12:39 PM
 */
public class Insert {
    public void insertSort(int[] a){
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
    }

    public static void main(String[] args) {
        Insert insert = new Insert();
        int[] a = {1,0,2,3,4,9,5,8,6,7};
        insert.insertSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
