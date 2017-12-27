package com.test;

import java.util.Date;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.omar.entity.TestEntity;
import com.omar.entity.TestEntityTwo;
import com.omar.service.TestEntityService;
import com.omar.util.DatasourcesUtils;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
@TransactionConfiguration(transactionManager="transactionManager", defaultRollback=true)
@TestExecutionListeners({ TransactionalTestExecutionListener.class})
public class DemoTest  extends AbstractJUnit4SpringContextTests{
	
	@Resource(name="testEntityServiceImpl")
	private TestEntityService testEntityService;
	
	/*
	 * 第一种保存
	 */
	@Test
	//@Transactional
	public void test1() throws Exception {
		TestEntity testEntity = new TestEntity();
		testEntity.setName("1222222");
		testEntityService.saveTest(testEntity);
		//保存成功之后 测试事务回滚 事务可回滚
	}
	
	/*
	 * 切换数据源
	 */
	@Test
	//@Transactional
	public void test2() throws Exception {
			//先保存 后 切换 测试成功 接下来 测试 事务
			DatasourcesUtils.setDataSources(DatasourcesUtils.LOCAL_DATA_SOURCES);
			
			//数据源 切换成功
			DatasourcesUtils.setDataSources(DatasourcesUtils.JDE_DATA_SOURCES);
			TestEntityTwo testEntityTwo = new TestEntityTwo();
			testEntityTwo.setName("动态数据库切换测试02 异常事务处理wwwww");
			testEntityTwo.setCreateDate(new Date());
			testEntityService.saveTest01(testEntityTwo);
			
			TestEntity testEntity = new TestEntity();
			testEntity.setName("动态数据库切换测试wwqeqweqweqweq");
			testEntityService.saveTest(testEntity);
			int i = 1/0;
		
		test1();
		//先保存 后切换
		//测试表明  事务 不成功
	}

}
