package Day14;

public class Day14_5 {
	
	public static void main(String[] args) {
		
		// 강아지, 고양이, 호랑이 소리 
		// 동시출력 -> Thread
		// 1. Thread 클래스로부텉 extends 
			// 오바라이딩 -> 재정의
		// 2. Runnable 인터페이스로부터 implements
			// 오버라이딩 -> 구현 
		
		// main 스레드가 새로 생성된 스레드 호출
		// Thread 클래스로부터 상속받은 자식클래스 호출
		강아지소리 강아지 = new 강아지소리();
		강아지.start();
		고양이소리 고양이 = new 고양이소리();
		고양이.start();
		호랑이소리 호랑이 = new 호랑이소리();
		호랑이.start();
	}

}
