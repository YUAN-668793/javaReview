package online.juejin.temp;

/** 实体类测试
 * @author Jiayuan
 * @version 1.0
 * @description:
 * @time 11/5/2018 7:51 PM
 */
public class People {
    private String name;
    private int age;

    public People(String name,int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
