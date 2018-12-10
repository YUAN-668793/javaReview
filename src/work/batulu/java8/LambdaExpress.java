package work.batulu.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author zhangjiayuan@qipeipu.com
 * @date 12/10/2018 3:27 PM
 * @since 1.0.0
 */
public class LambdaExpress {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter","anna","mike","xenia");
        System.out.println("测试中文乱码");
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        Collections.sort(names, (a, b) ->  a.compareTo(b));
    }
}
