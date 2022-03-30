package Day14;

public class PriorityExample {
	
	public static void main(String[] args) {
		for(int i=1 ; i<=10 ; i++) {
			Thread thread = new CalcThread("Thread" + i);
			if(i != 10) { 
				// i가 1일 때 스레드 생성
				// 먼저 생성되어도 순위할당 [운영체제 -> 스케줄링] 이므로 가장 먼저 종료X
				
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
