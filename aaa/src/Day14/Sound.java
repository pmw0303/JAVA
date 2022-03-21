package Day14;

public class Sound extends Thread{

	static boolean stop = true; // 실행여부 판단 [true 시작 / false 종료]
	
	public void soundstop(boolean stop) {
		this.stop = stop;
		if(this.stop) {
			System.out.println("소리 시작");
		}else {
			System.out.println("소리 종료");
		}
	}
	
	@Override
	public void run() {
		while(this.stop) { // stop변수가 true 이면 무한루프
					// [종료조건] stop 변수가 false
			System.out.println("소리 재생 중");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			
			}
		}
	}
	
}
