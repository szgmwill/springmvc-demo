package com.tianxun.demo.entity;

import java.util.Date;

import com.google.gson.annotations.Expose;
import com.tianxun.demo.enums.Sex;

/**
 * Test Demo Data Object
 * @author willzhang
 * pid, demo_biz_1, demo_biz_2, demo_biz_3, create_time
 */
public class TestDemoDo {
	private long pid;
	
	private int demoBiz1;
	
	private String demoBiz2;
	
	private Sex demoBiz3;
	
	private Date createTime;

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public int getDemoBiz1() {
		return demoBiz1;
	}

	public void setDemoBiz1(int demoBiz1) {
		this.demoBiz1 = demoBiz1;
	}

	public String getDemoBiz2() {
		return demoBiz2;
	}

	public void setDemoBiz2(String demoBiz2) {
		this.demoBiz2 = demoBiz2;
	}

	public Sex getDemoBiz3() {
		return demoBiz3;
	}

	public void setDemoBiz3(Sex demoBiz3) {
		this.demoBiz3 = demoBiz3;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	public String toString() {
		return "TestDemoDo [pid=" + pid + ", demoBiz1=" + demoBiz1
				+ ", demoBiz2=" + demoBiz2 + ", demoBiz3=" + demoBiz3
				+ ", createTime=" + createTime + "]";
	}
	
	
}
