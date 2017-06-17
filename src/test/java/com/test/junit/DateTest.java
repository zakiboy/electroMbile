package com.test.junit;

import java.util.Calendar;
import java.util.Date;

import org.springframework.cglib.core.Local;

import com.electro.util.DateType;
import com.electro.util.DateUtil;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		String date1 = DateUtil.formatDate(date, DateUtil.YYYYMMDDHHmmss);
		System.out.println("现在时间是："+date1);
//        Calendar c = Calendar.getInstance();
//        c.setTime(date); // 设置当前日期 
//        c.add(Calendar.MINUTE, 1);//DateUtil.getNewDate(date, DateType.getName(6), 1)
		String date2 = DateUtil.formatDate(DateUtil.getNewDate(date, DateType.getName(1), 1), DateUtil.YYYYMMDDHHmmss);
		System.out.println("1年之后的时间是："+date2);
		String date3 = DateUtil.formatDate(DateUtil.getNewDate(date, DateType.getName(2), 1), DateUtil.YYYYMMDDHHmmss);
		System.out.println("1月之后的时间是："+date3);
		String date4 = DateUtil.formatDate(DateUtil.getNewDate(date, DateType.getName(3), 1), DateUtil.YYYYMMDDHHmmss);
		System.out.println("1天之后的时间是："+date4);
		String date5 = DateUtil.formatDate(DateUtil.getNewDate(date, DateType.getName(4), 1), DateUtil.YYYYMMDDHHmmss);
		System.out.println("1小时之后的时间是："+date5);
		String date6 = DateUtil.formatDate(DateUtil.getNewDate(date, DateType.getName(5), 1), DateUtil.YYYYMMDDHHmmss);
		System.out.println("1分钟之后的时间是："+date6);
		String date7 = DateUtil.formatDate(DateUtil.getNewDate(date, DateType.getName(6), 1), DateUtil.YYYYMMDDHHmmss);
		System.out.println("1秒钟之后的时间是："+date7);
	}

}
