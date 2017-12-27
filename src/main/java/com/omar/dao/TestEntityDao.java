package com.omar.dao;

import org.springframework.stereotype.Repository;

import com.omar.entity.TestEntity;
import com.omar.entity.TestEntityTwo;

@Repository("testEntityDaoImpl")
public interface TestEntityDao{
	
	/**
	 * 保存到第一个数据库
	 * @Title: saveTest 
	 * @param testEntity
	 * @author: Omar(OmarZhang)
	 * @date: 2016年2月3日 上午1:51:39
	 */
	public void saveTest(TestEntity testEntity);
	
	/**
	 * 保存到第二个数据库
	 * @Title: saveTest 
	 * @param testEntity
	 * @author: Omar(OmarZhang)
	 * @date: 2016年2月3日 上午1:51:39
	 */
	
	public void saveTest01(TestEntityTwo testEntity);
	
}
