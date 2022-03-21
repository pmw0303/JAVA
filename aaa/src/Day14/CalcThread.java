package Day14;

public class CalcThread extends Thread{
	
	public CalcThread(String name) {
		setName(name); // 인수를 받은 데이터로 스레드이름 정하기
		
	}
	
	// 멀티스레드 실행
	@Override
	public void run() {
		for(int i=0 ; i<200000000 ; i++) {
			
		}
		System.out.println("스레드 이름 : " + getName());
	}
}
