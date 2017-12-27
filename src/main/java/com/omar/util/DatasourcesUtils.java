package com.omar.util;

/**
 * 动态切换数据源
 * @Description: 
 * @ClassName: com.zp.util.DatasourcesUtils
 * @author: Omar(zp)
 * @date: 2015年5月18日 下午1:21:23 
 *
 */
public class DatasourcesUtils {
	/** 本地数据源*/
	public final static String LOCAL_DATA_SOURCES = "localDataSources";
	/** 远程数据源*/
	public final static String JDE_DATA_SOURCES = "remoteDataSources";
	private static final ThreadLocal<String> contextHolder= new ThreadLocal<String>();
	
	/**
	 * 设置数据源名称
	 * @Title: setDataSources 
	 * @param datasourceName
	 */
	public static void setDataSources (String datasourceName) {
		contextHolder.set(datasourceName);
	}
	
	/**
	 * 获取连接类型
	 * @Title: getDataSourceType 
	 * @return
	 */
	public static String getDataSourceType () {
		return contextHolder.get();
	}
	
	/**
	 * 清除
	 * @Title: clear
	 */
	public static void clear(){
		contextHolder.remove();
	}

}
