package day13.api.lang.buffer;

public class StringBufferEx {
	
	public static void main(String[] args) {
		
		//빠른문자열
		//StringBuffer,StringBuilder
		String str = new String("Java ");
		StringBuffer sb = new StringBuffer("Java ");
		System.out.println(str);
		System.out.println(sb);
		
		str = str +"bye~"; //새로운 str이생겨서 bye가 추가
		sb.append("bye~"); //마지막에 추가 - 원본문자가 바뀜(재활용)
		System.out.println(str);
		System.out.println(sb);
		
		//중간에 추가
		sb.insert(5, "hello "); // 5번위치에 문자열 추가
		System.out.println(sb); 
		
		//문자열 변경
		sb.replace(5, 10, "good"); // 5~10 미만 변경
		System.out.println(sb);
		
		//문자열 삭제
		sb.delete(5, 10); // 5~10 미만 삭제
		System.out.println(sb);
		
		//문자열 로꾸꺼
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		//빠른문자열을 문자열로 형변환
		String s = sb.toString(); //문자열로 형변환
		if(s.equals("Java bye~")) {
			System.out.println("같것냐?");
		}
		
	}

}
