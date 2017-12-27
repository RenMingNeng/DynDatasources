package com.omar.service;

import com.omar.entity.TestEntity;
import com.omar.entity.TestEntityTwo;
import com.omar.util.DynDatasource;

public interface TestEntityService {
	
	/**
	 * 保存到第一个数据库
	 * @Title: saveTest 
	 * @param testEntity
	 * @author: Omar(OmarZhang)
	 * @date: 2016年2月3日 上午1:51:39
	 */
	@DynDatasource
	public void saveTest(TestEntity testEntity);
	
	/**
	 * 保存到第二个数据库
	 * @Title: saveTest 
	 * @param testEntity
	 * @author: Omar(OmarZhang)
	 * @date: 2016年2月3日 上午1:51:39
	 */
	@DynDatasource(sourceName="remoteDataSources")
	public void saveTest01(TestEntityTwo testEntity);

}
