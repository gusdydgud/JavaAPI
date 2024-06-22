package day15.api.io.stream;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamEx {

	public static void main(String[] args) {
		/*
		 * Output이 붙어 있는 클래스는 1바이트 기반의 출력스트림 클래스입니다. 
		 * 1. 파일을 쓸 때 사용하는 클래스는 FileOutStream입니다.
		 * 2. io패키지의 모든 클래스는 throws가 있어서, try-catch블록과 함께 사용합니다.
		 * 
		 * */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello.txt"; //파일명까지 포함(hello.txt)
		
		OutputStream fos = null; //fos.close(); 쓰기위해서
		
		try {
			fos = new FileOutputStream(path);
			
			//출력할 문자
			String str = "hello world? nice to meet you";
			
			fos.write(str.getBytes());
			
//			fos.close(); //스트림 자원해제
			
			
		} catch (FileNotFoundException e) { //FileOutputStream catch구문
			e.printStackTrace();
		} catch (IOException e) { //str.getBytes() catch구문
			
		} finally {
			
			try {
				fos.close(); //정석: 반드시 실행 해야함- finally 구문에 있지 않으면 느려짐
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			
			
			
		}
		
		

	}

}