package algorithms.string;

/** 字符串匹配
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/18/2018 7:20 PM
 */
public class Match {
    public int bruteForceStringMatch(int T[],int n,int P[],int m){
        for(int i=0;i<n-m;i++){
            int j=0;
            while(j<m && P[j]==T[i+j]){
                j++;
            }
            if(j==m)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] T = {1,4,6,3,2,8,5,7,9};
        int[] P = {2,8,5};
        Match match = new Match();
        int result = match.bruteForceStringMatch(T,T.length,P,P.length);
        System.out.println(result);
    }
}
