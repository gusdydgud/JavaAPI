package day14.api.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListEx {
	
	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList<>();
		List<String> list = new ArrayList<>();
		
		//list에 값 추가
		list.add("java");
		list.add("jsp");
		list.add("git");
		list.add("database");
		list.add("java");
		list.add("python");
		//리스트 크기
		System.out.println("크기:"+list.size());
		
		//리스트를 문자열로
		System.out.println(list.toString());
		
		//list 중간에 추가
		list.add(2, "hong");
		System.out.println(list.toString());
		
		//list 값 수정
		list.set(2, "수정");
		System.out.println(list.toString());
		
		//list 값 얻기
		System.out.println(list.get(2));
		
		//list 값 삭제
		list.remove(2);//지우고, 지운값 반환
		list.remove("java");
		System.out.println("확인");
		
		System.out.println(list.toString());
		System.out.println("-----------------------------------");
		
		//배열로 리스트 빨리 만들기
//		List<String> newlist = Arrays.asList("a","b","c","d","e");
		String arr[] = {"a","b","c","d","e"};
		List<String> newlist = Arrays.asList(arr);
		System.out.println(newlist.toString());
		
		//리스트 병합
		list.addAll(newlist);
		System.out.println(list.toString());
		
		//리스트에 값의 포함여부 확인
		if(list.contains("c")) {
			System.out.println("있나봄");
		}
	
	}

}
