package day13.api.lang.object;

public class Person implements Cloneable {

	private String naeme;
	public Person(String name) {
		this.naeme =name;
	}
	public String getNaeme() {
		return naeme;
	}
	public void setNaeme(String naeme) {
		this.naeme = naeme;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		//obj가 가지고 있는 이름이 같으면, true
		if(obj instanceof Person) {
			Person p = (Person)obj;
			if(p.getNaeme().equals(this.naeme)) {
				return true;
			}
		}
		
		return false;
	}
	//멤버변수의 값을 한눈에 확인할수 있도록 overriding
	//generate tostring
	@Override
	public String toString() {
		
		return "Person [naeme=" + naeme + "]";
	}
	//clone 메서드는 오버라이딩해서 사용해라
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	protected void finalize() throws Throwable {
		
		super.finalize();
		System.out.println("객체 소멸됨");
		
		// TODO Auto-generated method stub
	}
	
	
	
	
}
