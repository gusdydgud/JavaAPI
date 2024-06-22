package day14.api.util.random;

import java.util.Random;

public class RandomEx {

	public static void main(String[] args) {
		
		Random ran = new Random();
		double d = ran.nextDouble();
		System.out.println(d);
		
		int i = ran.nextInt();
		System.out.println(i);
		
		int j = ran.nextInt(3);
		System.out.println(j);
		
	}
	
}
