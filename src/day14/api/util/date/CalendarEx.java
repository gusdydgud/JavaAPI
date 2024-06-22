package day14.api.util.date;

import java.util.Calendar;

public class CalendarEx {
	
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //이 안에 날짜, 시간 등이 들어있음.
		System.out.println(cal);
		//Calendar, date -> LocalDateTime
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		System.out.println(year+" "+month+" "+day);
		System.out.println(hour+":"+minute+":"+second);
		
	}

}
