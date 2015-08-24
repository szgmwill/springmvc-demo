package com.tianxun.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tianxun.demo.common.JsonResult;
import com.tianxun.demo.constant.ErrorCode;
import com.tianxun.demo.entity.TestDemoDo;
import com.tianxun.demo.service.impl.TestDemoService;

/**
 * Spring MVC Controller
 * @author willzhang
 *
 */

@RestController
@RequestMapping("/test")
public class TestDemoController {
	
	private static final Logger logger = Logger.getLogger(TestDemoController.class);
	
	@Autowired
	private TestDemoService service;
	
	/**
	 * 天巡后台WEB服务测试
	 */
	@RequestMapping(method = RequestMethod.GET, value = "/query_demo")
	public JsonResult demoTest(Integer reqNum) {
		long startTime = System.currentTimeMillis();
		logger.debug("开始测试MVC接口");
		JsonResult result = new JsonResult();
		try {
			TestDemoDo ret = service.getDemoResult(reqNum);
			if(ret != null) {
				result.setData(ret);
			} else {
				result.setCode(ErrorCode.TX_Result_Empty.getCode());
				result.setMsg(ErrorCode.TX_Result_Empty.getDesc());
			}
			
		} catch (Exception e) {
			logger.error("demoTest Exception:"+e);
			result.setCode(ErrorCode.TX_Result_Exception.getCode());
			result.setMsg(ErrorCode.TX_Result_Exception.getDesc());
		} finally {
			logger.info("接口[demoTest]调用完毕,耗时:"+(System.currentTimeMillis() - startTime));
		}
		
		return result;
	}
}
