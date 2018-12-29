package work.batulu.temp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author zhangjiayuan@qipeipu.com
 * @date 2018/12/28 16:15
 * @since 1.0.0
 */
public class Test {

    private String insertField() {
        StringBuffer buffer = new StringBuffer();
        List<String> tests = Arrays.asList("dfdf","dfdf","dfdfd");
        Object collect = tests.stream().collect(Collectors.joining(",", "(", ")"));
        return null;
    }

    public void test1(){
        StringBuffer stringBuffer = new StringBuffer();
        String s1 = stringBuffer.toString();
        System.out.println(s1);
    }

    public static void main(String[] args) {
        Test t = new Test();
        t.test1();
    }
}
