package algorithms.temp;

/** 定义一个可比较的数据类型
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 2018/7/27 12:44
 */
public class Date implements Comparable<Date> {
    private final int day;
    private final int month;
    private final int year;
    public Date(int d,int m,int y){
        day =d;
        month = m;
        year = y;
    }
    public int compareTo(Date that){
        if(this.year > that.year) return +1;
        if(this.year < that.year) return -1;
        if(this.month > that.month) return +1;
        if(this.month < that.month) return -1;
        if(this.day > that.day) return +1;
        if(this.day < that.day) return -1;
        return 0;
    }
    public String toString(){
        return month+"/"+day+"/"+year;
    }

}
