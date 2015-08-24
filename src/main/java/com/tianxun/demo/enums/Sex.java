package com.tianxun.demo.enums;

import com.google.common.base.Strings;;

public enum Sex {
	boy, girl;
	
	
	public static Sex getSex(String input) {
		if(!Strings.isNullOrEmpty(input)) {
			for(Sex sex : values()) {
				if(input.equalsIgnoreCase(sex.name())) {
					return sex;
				}
			}
		}
		
		return null;
	}
}
