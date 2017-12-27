package com.omar;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import com.omar.util.DatasourcesUtils;

/**
 * 动态数据源
 * @Description: 
 * @ClassName: com.zp.DynDatasources
 * @author: Omar(zp)
 * @date: 2015年5月18日 上午11:34:24 
 *
 */
public class DynDatasources extends AbstractRoutingDataSource{

	@Override
	protected Object determineCurrentLookupKey() {
		String type = DatasourcesUtils.getDataSourceType();
		System.err.println(type);
		return	type;
	}
}
