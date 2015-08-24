package com.tianxun.demo.constant;
/**
 * 错误码表
 * @author willzhang
 *
 */
public enum ErrorCode {
	TX_Result_Empty(10011, "查询为空"),
	
	TX_Result_Exception(10011, "操作异常");
	
	private int code;
	
	private String desc;
	
	private ErrorCode(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public int getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
	
}
