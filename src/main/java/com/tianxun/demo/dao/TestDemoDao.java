package com.tianxun.demo.dao;

import org.apache.ibatis.annotations.Param;

import com.tianxun.demo.entity.TestDemoDo;

/**
 * MyBatis Dao 
 * @author willzhang
 *
 */
public interface TestDemoDao {
	
	/**
	 * query demo test
	 */
	public TestDemoDo queryTestDemo(@Param("reqNum") Integer reqNum);
}
