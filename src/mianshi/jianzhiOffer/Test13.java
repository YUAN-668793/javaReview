package mianshi.jianzhiOffer;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 10/7/2018 3:26 PM
 */

/**
 * 选择排序思想
 */
public class Test13 {
    public void reOrderArray(int [] array) {
       /* int length = array.length;
        int[] temp1 = new int[array.length];
        List<Integer> numberIndex = new ArrayList<>();
        int index1 = 0;
        int index2 = 0;
        for(int i = 0;i<length;i++){
            if(array[i]%2 != 0){
                temp1[index1] = array[i];
                index1++;
            }else{
                index2++;
                numberIndex.add(array[i]);
            }
        }
        int index3 = 0;
        for(int j=index1;j<length;j++){
            temp1[j] = numberIndex.get(index3);
            index3++;
        }
        for(int k = 0;k<temp1.length;k++){
            array[k] = temp1[k];
        }
*/
       int length = array.length;
       for(int i = 0;i<length-1;i++){
           for(int j = 0;j<length-1;j++){
               if(array[j]%2 == 0 && array[j+1]%2 == 1){
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
               }
           }
       }
    }

    public static void main(String[] args) {
        Test13 t = new Test13();
        int[] a = {1,3,5,7,2,4,6};
        t.reOrderArray(a);
    }
}
