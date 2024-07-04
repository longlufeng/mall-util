package com.llf.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
	
	static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
	
	
	static SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	static SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static String getCurDate() {
		String curDate = sdf1.format(new Date());
		return curDate;
		
	}
	
	public static String getCurDate(String dateFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		String curDate = sdf.format(new Date());
		return curDate;
		
	}
	
	public static String getCurDateTime() {
		String curDateTime = sdf2.format(new Date());
		return curDateTime;
		
	}
	
	public static String getCurDateTime(String timeFormat) {
		SimpleDateFormat sdf = new SimpleDateFormat(timeFormat);
		String curDateTime = sdf.format(new Date());
		return curDateTime;
		
	}
	
	public static String getCurDateMonthAgo(int number) {
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, -number);
		return sdf1.format(c.getTime());
		
	}
	
	public static void main(String[] args) {
		System.out.println(getCurDateMonthAgo(1));
	}

}
