package day13.api.lang.string;

import java.util.Arrays;

public class StringEx01 {
	
	public static void main(String[] args) {
		
		String str = "홍길동 입니다~! 반갑고?";
		String str2 = new String("홍길동");
		String str3 = new String(new char[] {'홍','길','동'});
		System.out.println(str);
		System.out.println(str2);
		System.out.println(str3);
		//charAt() - 문자열 한글자만 자르기
		System.out.println(str.charAt(0));
		
		//substring()
		System.out.println(str.substring(5));
		System.out.println(str.substring(0, 5)); // a ~b미만 문자열 추출
		
		//split()
		String arr[] = str.split(" "); //구분자 기준으로 문자열을 자름
		System.out.println(Arrays.toString(arr));
		
		//toCharArray()
		char arr1[] = str.toCharArray();
		System.out.println(Arrays.toString(arr1));
		
		System.out.println("------------------------------------------");
		//문자열 찾기
		str = "아 좋다 좋아";
		System.out.println(str.indexOf("아")); // "아" 가 있는 위치
		System.out.println(str.lastIndexOf("아")); // "아" 가 뒤에서부터 몇번째에 있는지
		System.out.println(str.indexOf("헐")); // 없으면 음수
		
		//문자열길이
		System.out.println(str.length()); //문자열의 길이 반환
		
		//알파벳의 대소문자 변경
		str = "  Hello World Happy Day  ";
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("------------------------------------------");
		
		//양측 공백제거
		System.out.println(str.trim());
		//모든 공백제거 (문자열 변경)
		System.out.println(str.replace(" ", "!"));//대상문자 , 변경할 문자
		
		str = str.replace("!" , " "); //원본문자에는 저장을 해줘야 바뀜
		System.out.println(str);
		System.out.println("------------------------------------------");
		
		//문자열 비교
		if("홍길동".equals("홍길동")) {
			
		}
		//문자열 대소비교 - 사전등재순을 기준으로
		System.out.println("홍길동".compareTo("이순신"));//양수 뒤에 문자가 사전적으로 앞에있음
		System.out.println("홍길동".compareTo("홍길자"));//음수 뒤에 문자가 사전적으로 뒤에있음
		System.out.println("홍길동".compareTo("홍길동"));//0이 나오면 같은문자
		
		//문자열 합치기
		System.out.println(String.join("->", "서울","대구","부산","찍고"));
		
		//기본타입을 -> 문자열로 형변환
		System.out.println(String.valueOf(3)+String.valueOf(3));
		
		
		
		
	}

}
