package cn.otherapi.demo;

import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {

		Calendar c = Calendar.getInstance();
		
		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + 1;
		int day = c.get(Calendar.DAY_OF_MONTH);
		int week = c.get(Calendar.DAY_OF_WEEK) - 1;
		
		System.out.println(year + "年" + month + "月" + day + "日" + "周" + week);
	}

}
