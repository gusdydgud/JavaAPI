package day13.api.lang.system;

import java.util.Properties;

public class SystemEx01 {

	public static void main(String[] args) {
		
		//시스템클래스는 static메서드로 전부 정의되어 있음
		
//		System.exit(0);//프로그램 종료
//		System.out.println("?");
		Properties p = System.getProperties(); //운영체제 관련된 내용들을 얻을 수 있음.
		System.out.println(p);
		
		long start = System.currentTimeMillis();
		String str = "";
		for(long i = 1;i<=100000l;i++) {
			str+="a";
		}
		long end = System.currentTimeMillis();
		
		System.out.println((end-start)*0.001);
		
		
	}
	
}
