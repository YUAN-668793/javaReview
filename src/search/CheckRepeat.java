package search;

/** 判断数组中是否存在相同的值
 * 若优化，则先排序后在判断相邻值是否相等
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 8/27/2018 1:07 PM
 */
public class CheckRepeat {
    public void checkRepeat(int[] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    System.out.println("repeat elements:"+a[i]);
                    return;
                }
            }
        }
        System.out.println("no repeat elements");
    }

    public static void main(String[] args) {
        CheckRepeat cr = new CheckRepeat();
        int[] a = {1,0,2,3,6,8,9,7,2};
        cr.checkRepeat(a);
    }
}
