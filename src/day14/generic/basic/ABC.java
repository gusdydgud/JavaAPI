package day14.generic.basic;

public class ABC<T> { //제네릭은 인터페이스, 클래스에 <타입>문법
	
	private T t; //타입이 미정 상태 (생성할 때 지정)
	
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}

	private Object obj;

	public Object getObj() {
		return obj;
	}

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	

}
