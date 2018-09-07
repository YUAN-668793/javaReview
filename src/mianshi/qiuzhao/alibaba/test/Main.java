package mianshi.qiuzhao.alibaba.test;

import java.util.Scanner;

/** alibaba-locationRange
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 9/7/2018 8:04 PM
 * keep positive
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String location = sc.nextLine();
        String locations = sc.nextLine();
        String[] locationArr = location.split(",");
        String[] locationsArr = locations.split(",");
        //获取小广所在坐标
        int x1 = Integer.parseInt(locationArr[0]);
        int x2 = Integer.parseInt(locationArr[1]);
        //配送坐标集合
        int[] locationsNum = new int[locationsArr.length];
        for(int j=0;j<locationsArr.length;j++){
            locationsNum[j] = Integer.parseInt(locationsArr[j]);
        }
        int maxX = locationsNum[0];
        int positionX = 0;
        int maxY = locationsNum[1];
        int positionY = 1;
        for(int i=0;i<locationsNum.length;i++){
            //若是偶数位，则说明该坐标为x轴坐标
            if(i%2 == 0){
                //获取最大X坐标
                //若X值相等，则比较y值
                if(maxX<=locationsNum[i]){
                    if(maxX == locationsNum[i]){
                        if(locationsNum[i+1]>positionY){
                            maxX = locationsNum[i];
                            positionX = i;
                        }
                    }else{
                    }
                }
            }
            //奇数位，则说明该坐标为y轴坐标
            else{
                //获取最大Y轴坐标
                if(maxY<=locationsNum[i]){
                    if(maxY == locationsNum[i]){
                        if(locationsNum[i-1]>positionX){
                            maxY = locationsNum[i];
                            positionY = i;
                        }else{

                        }
                    }
                }
            }
        }
        if(x1<positionX || x2<positionY){
            System.out.println("yes,0");
        }
    }
}
