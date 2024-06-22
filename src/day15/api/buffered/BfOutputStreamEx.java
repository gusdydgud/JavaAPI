package day15.api.buffered;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class BfOutputStreamEx {
	
	public static void main(String[] args) {
		
		/*
		 * Buffered가 붙은 클래스는, 성능향상 클래스 입니다.
		 * buffered + 스트림클래스 명으로 사용합니다.
		 */
		String path = "C:\\Users\\user\\Desktop\\course\\java\\upload\\hello3.txt";
		BufferedOutputStream bos = null; //1byte기반으로 데이터를 씀
		BufferedInputStream bis = null; //1byte기반으로 데이터를 읽음
		try {
			bos=  new BufferedOutputStream(new FileOutputStream(path));
			bis = new BufferedInputStream(new FileInputStream(path));
			
			//데이터를 씀
			String str = "hello world";
			
//			bos.write(str.getBytes(), 0, str.length());
			bos.write(str.getBytes());
			//flush를 사용해서 버퍼를 비울때, 글이 써져 내려감
			bos.flush();
			
			////////////////////////////////////////////////
			//글을 읽음
			while(true) {
				int w = bis.read();
				if(w ==-1) break;
				System.out.print((char)w);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bos.close();
				bis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
