package Day15;

public class Cal {

	private int memory;

	public int getMemory() {
		return memory;
	}

	// 문제점 : 스레드1이 100넣고 -> 스레드2가 50 넣고 [값 변경] -> 100출력 X
	// 해결 [synchronized : 동기화] 
		// 스레드1이 100넣고 -> 스레드2 대기 -> 100출력
			// 스레드2는 스레드1이 종료될 때 까지 대기
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {			
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}	
}
