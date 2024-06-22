package day16.api.ramda.basic;

public class MainClass {
	
	public static void main(String[] args) {
		
		Person p = new Person();
		
//		Say01 say =() -> {
//				// TODO Auto-generated method stub
//				System.out.println("굳");
//			}; 
//		
		
	
		
//		p.greeting(new Say01() { 
//			@Override
//		
//		public void talking() {
//			// TODO Auto-generated method stub
//			System.out.println("안녕?");
//			}
//		});
		
		p.greeting( () -> {
			System.out.println("안녕");
			});
		p.greeting(()-> 
		System.out.println("안녕")
		);
		
//		p.greeting(new Say02() {
//			
//			@Override
//			public String talking(String w) { //그의 인사법
//				// TODO Auto-generated method stub
//				return w +": hello?";
//			}
//		});
		
		p.greeting((String w)-> {
			return w+": hello";
		});
		
		//1. 매개변수의 타입은 생략할 수 있음
		//2. 매개변수가 1개라면 ()도 생략가능
		//3. 실행구문이 1줄이라면, {}도 생략가능 
		//4. 한줄구문으로 적었을때 return 생략
		
		p.greeting( w->	 w + ": bye");
		//calculating메서드를 람다식으로 호출
		//기능 - int의 개수만큼 w를 문자열 합을 구해서 반환
		p.calculating((int i, String w) -> {
			String re="";
			for(int j=0;j<i;j++) {
				re+=w;
			}
			return re;
		});
		
		
		
	}

}
