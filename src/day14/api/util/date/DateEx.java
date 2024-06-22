package day14.api.util.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {
	
	public static void main(String[] args) {
		
		//날짜를 나타내는 데이트객체
		Date date = new Date();
		
		System.out.println(date); // 날짜타입
		
		//날짜를 -> 문자열로 형변환
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String now = sdf.format(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss E요일");
		String now2 = sdf2.format(date);
		
		System.out.println(now2);
		System.out.println("--------------------------------");
		
		//날짜형식의 문자열 -> 날짜타입으로 형변환
		String str = "2024-05-31 09:22:21";
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyy-MM-dd hh:mm:ss");
		try {
			Date now3 = sdf3.parse(str);
			System.out.println("변경된 날짜타입:"+now3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
