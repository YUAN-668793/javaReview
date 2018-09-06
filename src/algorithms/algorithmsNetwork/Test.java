package algorithmsNetwork;

/**
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/27 15:44
 */
public class Test {
    public void insertSort(int[] a){
        int len = a.length;
        int insertNum;
        for(int i=1;i<len;i++){
            insertNum = a[i];
            int j = i-1;
            while(j>=0&&a[j]>insertNum){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = insertNum;
        }
        for(int result:a){
            System.out.print(result+" ");
        }
    }

    public void bubble(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++){
                if(a[j]>a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for(int result:a){
            System.out.print(result+" ");
        }
    }

    public void test1(int[] a){
        int len = a.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len-i-1;j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        for(int result:a){
            System.out.print(result+" ");
        }
    }

    public static void main(String[] args) {
        int[] a = new int[]{4,1,2,1,6,3,2,7,8};
        Test e = new Test();
        e.test1(a);
    }

}
