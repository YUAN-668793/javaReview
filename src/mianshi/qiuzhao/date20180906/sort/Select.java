package mianshi.qiuzhao.date20180906.sort;

/** 选择排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 12:33 PM
 */
public class Select {
    public void selectSort(int[] a){
        int len = a.length;
        int min;
        int position;
        for(int i=0;i<len;i++){
            min = a[i];
            position = i;
            for(int j=i;j<len;j++){
                if(min>a[j]){
                    min = a[j];
                    position = j;
                    a[position] = a[i];
                    a[i] = min;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,0,3,6,5,3,7,8,9,4};
        Select se = new Select();
        se.selectSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
