package com.tianxun.demo.service.impl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianxun.demo.dao.TestDemoDao;
import com.tianxun.demo.entity.TestDemoDo;

/**
 * Spring MVC Service
 * @author willzhang
 *
 */
@Service
public class TestDemoService {
	
	private static final Logger logger = Logger.getLogger(TestDemoService.class);
	
	@Autowired
	private TestDemoDao demoDao;
	
	public TestDemoDo getDemoResult(Integer reqNum) {
		logger.info("getDemoResult invoke~~~~~");
		return demoDao.queryTestDemo(reqNum);
	}
}
