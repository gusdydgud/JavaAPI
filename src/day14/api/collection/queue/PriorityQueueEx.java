package day14.api.collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {
	
	public static void main(String[] args) {
		
		//우선순위 큐 => 자동 정렬기능
		
		PriorityQueue<Integer> queue = new PriorityQueue<>();
//		Queue<Integer> queue = new PriorityQueue<>();
		
		//추가
		queue.offer(5);
		queue.offer(2);
		queue.offer(3);
		queue.offer(10);
		queue.offer(6);
		//[2,3,5,6,10] 정렬이 되어있음
		System.out.println(queue.toString());
		
		//삭제(꺼냄)
		//보이는 거랑 다름에 주의!!
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.toString());
		
		//queue가 비엇는지 확인
		if(queue.isEmpty() == false) { //큐가 비었으면 true, 아니면 false
			System.out.println("비어있다");
		}
		System.out.println("-----------------------------------");
		//UserVO를 담을 수 있는 Queue
		//큐가 순서를 확인할 때 compareTo메서드를 확인합니다.
		//객체를 우선순위큐에 저장할 때는 compareTo에 정희된 형식에 따라서 우선순위방법을 지정해줘야함
		//comparable인터페이스를 구현해서 compareTo메서드를 오버라이딩하면 됩니다.
		
		System.out.println("홍길동".compareTo("홍길자")); //음수가 나오면,홍길동이 사전적으로 앞
		System.out.println("홍길자".compareTo("홍길동")); //양수가 나오면,홍길자가 사전적으로 뒤
		
		Queue<UserVO> que = new PriorityQueue<>();
		que.offer(new UserVO("홍길동",20));
		que.offer(new UserVO("이순신",30));
		que.offer(new UserVO("김갑동",40));
		que.offer(new UserVO("오만원",50));
		
		System.out.println(que.toString());
		
		while(que.isEmpty() == false) {
			System.out.println(que.poll());
		}
		
		
		
		
		
		
		
	}

}
