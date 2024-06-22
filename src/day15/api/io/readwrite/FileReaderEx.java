package day15.api.io.readwrite;

import java.io.FileReader;
import java.io.Reader;
import java.util.Arrays;

public class FileReaderEx {
	
	public static void main(String[] args) {
		
		/*
		 * 문자기반으로 읽어들이는 클래스 FileReader클래스 입니다.
		 * 2바이트 단위여서 문자 읽기에 적합합니다.
		 */
		Reader rw = null;
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello2.txt";
		try {
			rw = new FileReader(path);
			//한글자씩 읽기
//			while(true) {
//				
//				int w = rw.read();
//				if(w==-1) { //-1이라면 더이상 읽을 데이터가 없음
//					break;
//				}
//				System.out.print((char)w);
//			}
			char arr[] = new char[100];
			int l = rw.read(arr);
			System.out.println(Arrays.toString(arr));
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				
				rw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}

}
