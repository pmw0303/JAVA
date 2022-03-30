package Day15;

public class 음악 extends Thread {

	@Override
	public void run() {
		// 병렬처리 코드 실행
		while(true) {
			System.out.println("음악 실행중");		
			try{
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}
