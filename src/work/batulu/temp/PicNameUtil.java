package work.batulu.temp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

/** 图片命名
 * @author zhangjiayuan@qipeipu.com
 * @date 12/11/2018 9:11 AM
 * @since 1.0.0
 */
public final class PicNameUtil {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");

    /**
     * 单个文件命名(当前日期+uuid+后缀名)
     * @return
     */
    public static String givePicName(String picName){
        LocalDate date = LocalDate.now();
        String suffix = "."+picName.substring(picName.lastIndexOf(".") + 1);
        return (date.format(dtf))+UUID.randomUUID().toString()+suffix;
    }

    /**
     * 批量文件命名(当前日期+uuid+后缀名)
     * @param picNames
     * @return
     */
    public static List<String> givePicNames(List<String> picNames){
        LocalDate date = LocalDate.now();
        return picNames.stream().map(f->date.format(dtf)+
                UUID.randomUUID().toString()+"."+f.substring(f.lastIndexOf(".") + 1))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        String result =  PicNameUtil.givePicName("duiadadu微信图片.jpg");
        List<String> fileNames = givePicNames(Arrays.asList("jfdofdsfups.jpg","fdserjeo.jpg","7dsad8ad.jpg"));
        System.out.println();
    }
}
