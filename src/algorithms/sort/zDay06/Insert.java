package algorithms.sort.zDay06;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/27/2018 12:48 AM
 */
public class Insert {
    public void insert(int[] a){
        int len = a.length;
        for(int i=1;i<len;i++){
            int j = i-1;
            int insertNum = a[i];
            while(j>=0 && insertNum<a[j] ){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
    }

    public static void main(String[] args) {
        Insert i = new Insert();
        int[] a = {1,0,3,5,6,9,8,6,2,5};
        i.insert(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
