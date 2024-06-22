package day14.api.collection.queue;

public class UserVO implements Comparable<UserVO> { //비교할 대상 <> 자리에써줌
	
	private String name;
	private int age;
	
	public UserVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	public UserVO(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}


	@Override
	public int compareTo(UserVO o) {
		// TODO Auto-generated method stub
		//내꺼랑, 매개변수꺼랑 비교해서 정렬
		//이름으로 대소비교
		
//		return this.name.compareTo(o.getName()); //이름 오름차순
//		return o.getName().compareTo(this.name);
		//나이로 대소비교
		return Integer.compare(this.age, o.getAge());
	}


	@Override
	public String toString() {
		return "UserVO [name=" + name + ", age=" + age + "]";
	}
	
	

}
