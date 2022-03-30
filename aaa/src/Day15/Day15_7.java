package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) throws Exception{
		
		// p601 
			// 1. sleep() : 주어진 시간동안 일시 정지
				// 시간단위 : 밀리초 - 1000분의 1초
				// 일반 예외 발생 : 일시정지 상태에서 주어진 시간이 되기전에 실행대기
			// 2. Thread.yield() : 다른 스레드에게 실행 양보
			// 3. Thread.join() : 다른 스레드의 종료를 기다림
			
		// p602 sleep 예제
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for(int i=0 ; i<2 ; i++) {
//			toolkit.beep(); // 소리내기 [소리 1번 나올동안 for문 끝남]
//			System.out.println("소리");
//			Thread.sleep(3000); // 밀리세컨드 기준 => 3초
//		}
//		
//		ThreadA threadA = new ThreadA();
//		ThreadB threadB = new ThreadB();
//		// 스레드 시작
//		threadA.start();
//		threadB.start();
//		// 3초간 일시 정지
//		try {Thread.sleep(3000); } catch(Exception e) {}
//		threadA.work = false;
//		// 스레드 A에 work 값 변경 : A -> B -> A,B 같이 하다가 종료
//		try {Thread.sleep(3000); } catch(Exception e) {}
//		threadA.work = true;
//		
//		try {Thread.sleep(3000);} catch(Exception e) {}
//		threadA.stop = true;
//		threadB.stop = true;
		
		// p607 join
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (Exception e) {
			
		}
		System.out.println("1~100 까지의 합 : " + sumThread.getSum());
		// join 없을 경우 : 0
			// sumThread가 더하기를 끝내기 전에 main스레드 출력
		// join 했을 경우 : 5050
			// 
	}

}
