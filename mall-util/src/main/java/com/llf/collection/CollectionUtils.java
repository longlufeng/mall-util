package com.llf.collection;

import java.util.Collection;
import java.util.Map;

public class CollectionUtils {
	
	public static boolean isEmpty(Object obj) {
		
		if(obj != null) {
			if(obj instanceof Collection<?>) {
				if(((Collection<?>) obj).size() == 0) {
					return true;
				}
			}
			if(obj instanceof Map<?, ?>) {
				if(((Map<?, ?>) obj).isEmpty()) {
					return true;
				}
			}
			
		}
		
		return false;
		
	}

}
