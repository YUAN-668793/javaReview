package mianshi.qiuzhao.meituan.temp;

import java.util.Scanner;

/** meituan-图的遍历
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/6/2018 8:46 PM
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 1; i <= N; i++) {
            arr[i-1] = i;
        }
        String result = "";
        for(int j=0;j<N-1;j++){
            int x1 = sc.nextInt();
            int x2 = sc.nextInt();
            System.out.println("index:"+result.indexOf(""+x1));
            if(result.equals("")){
                result += x1+"=";
                result += x2;
            }
            else if(result.indexOf(""+x1) != -1){
                System.out.println("result:"+result.substring(result.indexOf(""+x1),result.indexOf(""+x1)+1));
                if(result.substring(result.indexOf(""+x1),result.indexOf(""+x1)+1) != null){
                    result = x2+"="+result;
                }else{
                    result = result+"="+result;
                }
            }
        }
        String[] split = result.split("=");
        String totalResult ="";
        for(int i=0;i<split.length;i++){
            totalResult+=split[i];
        }
        int total = 0;
        int index = result.indexOf("1");
        if(index == 0 || index == (N+N-1)){
            total = N-1;
        }else{
            if(index>N/2){

            }
        }
    }
}
