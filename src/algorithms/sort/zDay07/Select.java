package algorithms.sort.zDay07;

/** 选择排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/22/2018 10:46 AM
 */
public class Select {
    public static void select(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            int position = i;
            int min = a[i];
            for(int j = i;j<len;j++){
                if(min>a[j]){
                    min = a[j];
                    position = j;
                }
            }
            a[position] = a[i];
            a[i] = min;
        }
        for(int num:a){
            System.out.print(num);
        }
    }

    public static void main(String[] args) {
        int[] a = {1,3,9,8,7,5,6,3,2};
        Select.select(a);
    }
}
