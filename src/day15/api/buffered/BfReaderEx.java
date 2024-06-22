package day15.api.buffered;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class BfReaderEx {
	
	public static void main(String[] args) {
		
//			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//			System.out.println("입력해보셈");
//			String str = br.readLine();
//			System.out.println(str);
		//빠른입력.
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello4.txt";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(path));
//			String str = br.readLine(); //한줄씩 받음
			String str;
			//한줄씩 읽기
			while( (str = br.readLine()) !=null) { //더이상 읽을게 없으면 null
				System.out.println(str);
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //한줄 받기
		finally {
			try {
				br.close();
			} catch ( Exception e2) {
				// TODO: handle exception
			}
		}
		
		
	}

}
