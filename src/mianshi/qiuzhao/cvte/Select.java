package mianshi.qiuzhao.cvte;

/** 选择排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/14/2018 12:54 AM
 */
public class Select {
    public void select(int[] a){
        int len = a.length;
        int min;
        int position;
        for(int i=0;i<len;i++){
            min = a[i];
            for(int j=i;j<len;j++){
                if(min>a[j]){
                    min = a[j];
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,4,5,0,3,0,2,8,9,6,4};
        Select se = new Select();
        se.select(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
