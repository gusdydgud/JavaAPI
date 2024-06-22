package day14.api.util.strtoken;

import java.util.StringTokenizer;

public class StringTokenEx {
	
	public static void main(String[] args) {
		
		//split()과 유사
		//StringTokenizer클래스 - 문자를 특정 구분자를 기준으로 잘라서 사용.
		String str1 = "오늘은 5월 31일 이고, 금요일 입니다";
		StringTokenizer st = new StringTokenizer(str1);
		System.out.println("잘린문자의개수:"+st.countTokens());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
//		System.out.println(st.nextToken());
		
		while(st.hasMoreTokens()) { //다음이 있으면true 없으면 false
			System.out.println(st.nextToken());
		}
		System.out.println("----------------------------------");
		
		String log = "2024.05.31, 금요일, 홍길동, /no=30,id=aaa123";
		StringTokenizer st2 = new StringTokenizer(log,",");
		while(st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
		System.out.println("-----------------------------------");
		StringTokenizer st3 = new StringTokenizer(log,",./=");
		while(st3.hasMoreTokens()) {
			System.out.println(st3.nextToken().replace(" ", ""));
		}
		System.out.println("-----------------------------------");
		
		StringTokenizer str4 = new StringTokenizer(log,",",true); 
		while(str4.hasMoreTokens()) {// , 기준으로 자르고 구분자(,)도 잘린문자에 포함시켜줌
			System.out.println(str4.nextToken());
		}
		
		
		
	}

}
