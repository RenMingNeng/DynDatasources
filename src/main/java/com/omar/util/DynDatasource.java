/**
 * @Description: 
 * @ClassName: com.zp.util.DynDatasource
 * @author: Omar(OmarZhang)
 * @date: 2016年2月16日 上午11:15:24 
 */
package com.omar.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description: 
 * @ClassName: com.zp.util.DynDatasource
 * @author: Omar(OmarZhang)
 * @date: 2016年2月16日 上午11:15:24 
 *
 */
@Target({ElementType.METHOD,ElementType.ANNOTATION_TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DynDatasource {
	
	String sourceName() default "localDataSources";
	
}
