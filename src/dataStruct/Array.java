package dataStruct;

/** 数组
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/8/16 19:52
 */
public class Array {

    /**
     * 在指定位置插入一个元素
     * @param arr
     * @param index
     * @param value
     * @return
     */
    public int[] insert(int[] arr,int index,int value){
        for(int i = arr.length-1;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = value;
        return arr;
    }

    /**
     * 遍历数组
     * @param arr
     */
    public void travrse(int[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    /**
     * 在指定位置删除一个元素
     * @param arr
     * @param index
     * @return
     */
    public int[] delete(int[] arr,int index){
        for(int i=index;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = 0;
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,4,5,7,8,6,2,9};
        Array ay = new Array();
        ay.travrse(arr);
        System.out.println();
        ay.insert(arr,3,3);
        ay.travrse(arr);
        System.out.println();
        ay.delete(arr,3);
        ay.travrse(arr);
    }
}
