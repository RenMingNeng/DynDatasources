/**
 * @Description: 
 * @ClassName: com.zp.util.MyInspectDatasource
 * @author: Omar(OmarZhang)
 * @date: 2016年2月16日 上午11:23:38 
 */
package com.omar.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;

/**
 * @Description: 
 * @ClassName: com.zp.util.MyInspectDatasource
 * @author: Omar(OmarZhang)
 * @date: 2016年2月16日 上午11:23:38 
 *
 */
public class MyInspectDatasource{
	
	/**
	 * @Description: 
	 */
	public MyInspectDatasource() {
		
	}
	
	/**
	 * 执行方法之前进行拦截
	 * @Title: aspectBefore 
	 * @param joinPoint
	 * @author: Omar(OmarZhang)
	 * @date: 2016年2月16日 下午1:39:48
	 */
	public void aspectBefore(JoinPoint joinPoint){
		MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
		DynDatasource datasource = methodSignature.getMethod().getAnnotation(DynDatasource.class);
		if(datasource == null) {
			return ;
		}
		String dataSourceName = datasource.sourceName();
		System.out.println("动态切换数据源["+dataSourceName+"] 成功");
		DatasourcesUtils.setDataSources(dataSourceName);
	}

}
