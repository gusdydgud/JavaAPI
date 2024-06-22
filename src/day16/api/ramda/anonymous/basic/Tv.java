package day16.api.ramda.anonymous.basic;

public class Tv {

	
	public int volume;
	public  RemoteControl remote;
	
	//생성될때, 리모컨 객체를 갖는다(익명객체)
	//Tv안에서만 remoteContrl을 사용할 목적으로 만들어 쓸 때가 있음.
	public Tv() {
		remote = new RemoteControl() {
			
			//안에서 바깥을 참조할 수 있음
			@Override
			public void volumeUp() {
				// TODO Auto-generated method stub
				volume++;
			}
			
			@Override
			public void volumeDown() {
				// TODO Auto-generated method stub
				volume--;
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("Tv를 켭니다");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("Tv를 끕니다");
			}
		};
	}
	
}
