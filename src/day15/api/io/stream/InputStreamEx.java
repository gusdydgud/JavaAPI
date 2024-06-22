package day15.api.io.stream;

import java.io.InputStream;
import java.util.Arrays;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamEx {

	public static void main(String[] args) {
		
		/*
		 * Input이 붙어 있는 클래스는 1바이트 기반의 출력스트림 클래스입니다.
		 * 1. 파일을 읽어들이는데 사용하는 클래스가 FileInputStream
		 * 2. io패키지의 모든 클래스는 throws가 있어서, try-catch블록과 함께 사용합니다.
		 * 
		 * */
	
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello.txt"; //파일명까지 포함(hello.txt)
		
		InputStream ios = null;
		
		try {
			ios = new FileInputStream(path);
	
			//1바이트씩 읽기
			while(true) {
				int data = ios.read(); //-1나옴(순식간에 읽고 읽을 데이터 없어서)
				
				if(data == -1) {
					break;
				}
		
				System.out.print((char)data); //문자는 2바이트인데, inputstream은 1바이트로 데이터를 읽어서 한글은 깨짐
				  							  //영어는 1바이트라 잘나옴
				byte arr[] = new byte[100];	//100글자
				int length = ios.read(arr); 
				System.out.println("데이터를 읽은 길이:"+length);
				System.out.println(Arrays.toString(arr));
				
				int i =0;
				while(i<length) {
					System.out.println((char)arr[i]);
					i++;
				}
			}
			
//			System.out.println( ios.read()); //o [1byte씩]
//			System.out.println( ios.read()); //ㅏ
//			System.out.println( ios.read()); //ㄴ
//			System.out.println( ios.read()); //ㄴ
//			System.out.println( ios.read()); //ㅕ
//			System.out.println( ios.read()); //ㅇ
//			System.out.println( ios.read());
//			System.out.println( ios.read());
//			System.out.println( ios.read());
//			System.out.println( ios.read());
//			System.out.println( ios.read());
			
			//읽을 글자가 없으면 -1 나옴
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			
			try {
				ios.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
