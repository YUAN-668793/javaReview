package chapter10;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
//定义下面的Page304 Annotation保留到运行时
@Retention(value=RetentionPolicy.RUNTIME)
public @interface Page304 {
	
}
