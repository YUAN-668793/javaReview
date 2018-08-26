package sort.zDay03;

/**选择排序
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/26/2018 8:40 PM
 */
public class Test2 {
   public void selectSort(int[] a){
       int len = a.length;
       int min;
       int position;
       for(int i=0;i<len;i++){
           position = i;
           min = a[i];
           for(int j=i;j<len;j++){
               if(min>a[j]){
                   min = a[j];
                   position = j;
               }
           }
           a[position] = a[i];
           a[i] = min;
       }
   }

    public static void main(String[] args) {
        int[] a = {1,4,5,2,3,6,0,9,8};
        Test2 t = new Test2();
        t.selectSort(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
