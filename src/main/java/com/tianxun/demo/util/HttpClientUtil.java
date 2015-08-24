package com.tianxun.demo.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.httpclient.DefaultHttpMethodRetryHandler;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.HttpStatus;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.httpclient.params.HttpMethodParams;
import org.apache.log4j.Logger;

/**
 * http请求辅助类
 * @author wiki.zhou
 *
 */
public class HttpClientUtil {
	private final static Logger logger = Logger.getLogger(HttpClientUtil.class);
	
	/**
	 * 以GET方式请求url
	 * @param url
	 * @return
	 */
	public static String httpRequestGet(String url) throws Exception {
		HttpClient client = new HttpClient();
		// 设置连接超时时间(单位毫秒) 
		client.getHttpConnectionManager().getParams().setConnectionTimeout(60000);
		// 设置读数据超时时间(单位毫秒)
		client.getHttpConnectionManager().getParams().setSoTimeout(300000); 
		GetMethod method = new GetMethod(url);
		method.getParams().setParameter(HttpMethodParams.RETRY_HANDLER,
				new DefaultHttpMethodRetryHandler(3, false));

		
		String responseStr = "";
		BufferedInputStream bi = null;
		ByteArrayOutputStream bo = null;
		try {
			int statusCode = client.executeMethod(method);
			if (statusCode != HttpStatus.SC_OK) {
				logger.error("Method failed: " + method.getStatusLine());
			}
			InputStream resStream = method.getResponseBodyAsStream();  
			bi = new BufferedInputStream(resStream);
			bo = new ByteArrayOutputStream();
			
		    byte[] bytes = new byte[100];
		    int len = 0;
			while ( (len=bi.read(bytes)) >= 0) {
				bo.write(bytes, 0, len);				
			}
			//字符集
			String charsetName = "UTF-8";
			
			responseStr = new String(bo.toByteArray(), charsetName);
			
			return responseStr;
		} catch (HttpException e) {
			logger.error("Fatal protocol violation: " + e.getMessage());
			throw e;
		} catch (IOException e) {
			logger.error("Fatal transport error: " + e.getMessage());
			throw e;
		} finally {
		    if(null != bo) {
		        bo.close();
		    }
		    if(null != bi) {
		        bi.close();
		    }
			method.releaseConnection();
		}
	}
}
