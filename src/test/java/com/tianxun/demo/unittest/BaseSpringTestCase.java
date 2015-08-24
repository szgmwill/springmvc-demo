package com.tianxun.demo.unittest;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * spring测试基类
 * 
 * @author willzhang
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({
    "classpath:conf-spring/spring-service.xml"
})
/**
 * 注意Transactional的注解的作用,加上的话,所有的测试数据将不会直接提交到数据库里当测试完毕的话
 */
//@Transactional
public abstract class BaseSpringTestCase {
	
	public BaseSpringTestCase() {
		System.out.println("current os type is windows!");
		if(isWindows()) {
			//如果当前是本地windows环境,自动给一个本地的环境变量吧,懒得每个地方启动时去设置
			System.setProperty("env", "local");
		}
	}
	
	private static boolean isWindows() {
		if (System.getProperties().getProperty("os.name").toUpperCase().indexOf("WINDOWS") != -1) {
			return true;
		}
		return false;
	}
}
