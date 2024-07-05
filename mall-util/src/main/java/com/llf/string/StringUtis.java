package com.llf.string;

public class StringUtis {
	
	public static boolean isEmpty(Object obj) {
		
		if(obj == null || "".equals(obj) || obj.toString().length() == 0) {
			return true;
		}
		
		return false;
	}

}
