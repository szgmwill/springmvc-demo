package com.tianxun.demo.unittest.api;

import java.util.HashMap;
import java.util.Map;

import com.tianxun.demo.util.HttpClientUtil;

/**
 * WEB API DEMO TESTING
 *
 * @author willzhang
 */
public class TestClientDemo {

	private static String ip = "127.0.0.1";

	//private static String ip = "10.209.100.55";

	private static int port = 9090;

	private static int timeout = 6000;

	/**
	 * 测试Demo
	 */
	private static void testQueryDemoAPI() {
		long startTime = System.currentTimeMillis();
		
		String testUrl = "http://"+ip+":"+port + "/projects/projectlist/baseinfo";
		
		/**
		 * 输入参数:reqNum
		 */
		Map<String, String> params = new HashMap<String,String>();
		params.put("test", "test");
		
		int reqNum = 111;
		
		try {
			String resp = HttpClientUtil.httpRequestGet(testUrl+"?reqNum"+reqNum);
			
			System.out.println("resp:"+resp);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("接口["+testUrl+"]调用出错了!!!:"+e.getMessage());
		} finally {
			System.out.println("接口["+testUrl+"]测试完毕,耗时:"+(System.currentTimeMillis() - startTime));
		}
	}

    public static void main(String[] args) {
    	
    	testQueryDemoAPI();
		
    }
}
