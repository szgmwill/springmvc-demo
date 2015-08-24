package com.tianxun.demo.common;

import java.io.Serializable;
/**
 * 通用Json返回结果
 * @author willzhang
 *
 */
public class JsonResult implements Serializable {
	
	private static final long serialVersionUID = 4088189846234880089L;
	public static final JsonResult EMPTY = new JsonResult();
	private int code = 0;
	private String msg = "成功";
	private Object data;
	private String systemMessage;

	public JsonResult() {
	}

	public JsonResult(Object data) {
		this.data = data;
	}

	public JsonResult(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public static JsonResult createErrorInstance(int code, String msg) {
		JsonResult result = new JsonResult(code, msg);
		return result;
	}

	public static JsonResult createInstance(Object object) {
		JsonResult result = new JsonResult();
		result.data = object;
		return result;
	}

	public String getSystemMessage() {
		return systemMessage;
	}

	public void setSystemMessage(String systemMessage) {
		this.systemMessage = systemMessage;
	}	
}
