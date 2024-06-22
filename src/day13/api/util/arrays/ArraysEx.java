package day13.api.util.arrays;

import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;

public class ArraysEx {
	
	public static void main(String[] args) {
		
		//배열관련 클래스 Arrays
		Integer arr[] = {3,4,5,1,2,6,7,9,10};
		//배열 정렬
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
//		Arrays.sort(arr,Collections.reverseOrder());
//		System.out.println(Arrays.toString(arr));
		
		//요소 검색 binarySearch (선행조건 - 정렬)
		int index = Arrays.binarySearch(arr, 4); // 배열, 찾을값
		System.out.println(index);
		
		//배열 복사
		Integer[] arr2;
		arr2 = Arrays.copyOf(arr, arr.length*2); //배열 , 복사할 길이
		System.out.println(Arrays.toString(arr2));
		
		arr2 = Arrays.copyOfRange(arr, 2, 5); //2~5미만 인덱스 까지복사
		System.out.println(Arrays.toString(arr2));
		
		//배열비교 equals
		if(Arrays.equals(arr, arr2)) {
			System.out.println("배열요소가 같음");
		}else {
			System.out.println("배열요소가 다름");
		}
		
	}

}
