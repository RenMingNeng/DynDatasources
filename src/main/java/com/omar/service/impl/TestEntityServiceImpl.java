package com.omar.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.omar.dao.TestEntityDao;
import com.omar.entity.TestEntity;
import com.omar.entity.TestEntityTwo;
import com.omar.service.TestEntityService;

@Service("testEntityServiceImpl")
public class TestEntityServiceImpl  implements TestEntityService{
	
	@Resource(name="testEntityDaoImpl")
	private TestEntityDao testEntityDao;

	/**
	 * @Title: saveTest 
	 * @param testEntity
	 * @author: Omar(OmarZhang)
	 * @date: 2016年2月3日 上午1:54:44
	 * @see com.omar.service.TestEntityService#saveTest(com.omar.entity.TestEntity)
	 */
	public void saveTest(TestEntity testEntity) {
		testEntityDao.saveTest(testEntity);
		
	}

	/**
	 * @Title: saveTest01 
	 * @param testEntity
	 * @author: Omar(OmarZhang)
	 * @date: 2016年2月3日 上午1:54:44
	 * @see com.omar.service.TestEntityService#saveTest01(com.omar.entity.TestEntityTwo)
	 */
	public void saveTest01(TestEntityTwo testEntity) {
		testEntityDao.saveTest01(testEntity);
	}
}
