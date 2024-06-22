package day17.thread.basic;

public class MyThread implements Runnable {

	private int num;
	
	@Override
	public synchronized void run() {
		// TODO Auto-generated method stub
		for(int i =0 ;i<10;i++) {
			num++; //10번증가
			
			
			try {
				if(Thread.currentThread().getName().equals("스레드명 A")) {
					Thread.sleep(1000); //1초 멈춤
				}else {
					Thread.sleep(500);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+":"+ num);
		}
		
		
	}

	
}
