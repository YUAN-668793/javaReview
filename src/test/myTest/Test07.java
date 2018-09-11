package test.myTest;

/**
 * Created by Jiayuan on 2018/3/7.
 */
public class Test07 {
    public static void main(String[] args) throws Exception{
        try{
            System.out.println("deal with exception");
            throw new Exception();
        }catch(Exception ex){
            ex.printStackTrace();
        }finally {
            System.out.println("end the program");
        }
    }
}
