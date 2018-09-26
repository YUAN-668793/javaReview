package algorithms.sort.zDay06;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/27/2018 12:52 AM
 */
public class Select {
    public void select(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            int min = a[i];
            int position = i;
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
        Select i = new Select();
        int[] a = {1,0,3,5,6,9,8,6,2,5};
        i.select(a);
        for(int num:a){
            System.out.print(num);
        }
    }
}
