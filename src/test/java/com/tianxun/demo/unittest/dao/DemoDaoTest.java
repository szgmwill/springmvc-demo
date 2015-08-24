package com.tianxun.demo.unittest.dao;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.tianxun.demo.dao.TestDemoDao;
import com.tianxun.demo.entity.TestDemoDo;
import com.tianxun.demo.unittest.BaseSpringTestCase;
/**
 * 数据库单元测试用例
 * @author willzhang
 *
 */
public class DemoDaoTest extends BaseSpringTestCase {
	
	@Autowired
	private TestDemoDao dao;
	
	@Test
	public void testQueryDemo() {
		int reqNum = 111;
		
		TestDemoDo result = dao.queryTestDemo(reqNum);
		
		Assert.assertNotNull(result);
		
		System.out.println("查询结果:"+result.toString());
		
	}
}
