package day16.ramda.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MainClass03 {
	
	public static void main(String[] args) {
		
		/*
		 * 스트림 타입
		 * Stream - 오리지널 스트림
		 * IntStream - 정수 스트림
		 * DoubleStream - 실수 스트림
		 * LongStream - Long타입 스트림
		 * 
		 * 스트림타입 변환
		 * mapToXXX()
		 * 
		 */
		List<Integer> list = new ArrayList<>();
		
		for(int i=1;i<101;i++) {
			list.add(new Random().nextInt(100)+1);
		}
		
		//정수형 스트림으로 형변환 + 정수에서 사용할 수 있는 메서드 추가
		long r1 = list.stream().mapToInt(a -> a).count();
		System.out.println(r1);
		int r2 = list.stream().mapToInt(t->t).sum();
		System.out.println(r2);
		double r3 = list.stream().mapToInt(t->t).average().getAsDouble(); //옵셔널더블타입.getasdouble
		System.out.println(r3);
		int r4 = list.stream().mapToInt(t->t).max().getAsInt();
		System.out.println(r4);
		
		Integer arr[] = {1,40,50,23,43,70,99,94};
		int r6 = Arrays.stream(arr).mapToInt(t->t).max().getAsInt();
		int r5 = Arrays.asList(arr).stream().mapToInt(t->t).min().getAsInt();
		System.out.println(r5);
		System.out.println(r6);
		
		//boxed() -> 원본스트림으로 형변환
		List<Integer> list2 = IntStream.range(1, 15).boxed().collect(Collectors.toList());
		System.out.println(list2.toString());
		
		List<Integer> list3 = IntStream.rangeClosed(1, 10).boxed().collect(Collectors.toList());
		System.out.println(list3.toString());
		
		
		
	}

}
