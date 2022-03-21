package Day14;

import java.awt.Toolkit;

public class Day14_4 {
	
	public static void main(String[] args) {
		
		// p576 멀티스레드
			// 프로세스 : 운영체제에서 실행 중인 하나의 어플리케이션
			// 운영체제가 프로세스 필요한 메모리 할당 [자바에서 메모리 관리X 운영체제O]
			// 싱글 스레드 : 코드 읽어주는 흐름 1 개
			// 멀티 스레드 : 코드 읽어주는 흐름 여러 개
			// 병렬 : 설계상 병렬흐름이지만 스레드가 하나씩 처리(우선순위는 운영체제가 할당)	
			// Thread 클래스
				// 1. 임의 클래스에 extends Thread
				// 2. run() 메소드 오버라이딩[재정의]
				// 3. 객체 생성	
				// 4. 객체.start()
					// start() 메소드 호출 시 run 메소드 실행
			// Runnable 클래스
				// 1. 임의클래스에 implements Runnable
				// 2. run 메소드 구현
				// 3. 외부에서 구현객체 생성
				// 4. Thread 클래스 객체 생성 시 생성자에 구현객체 넣어줌
				// 5. Thread 클래스 객체 내 start() 메소드 실행
				// ** .start() 메소드는 run() 메소드 호출
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0 ; i<5 ; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
							
		}
			
		for(int i=0 ; i<5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("----------싱글스레드----------------");	
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0 ; i<5 ; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
			
		// p584
		
		Thread thread2 = new BeepThread();
		thread2.start();
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		System.out.println("-----------멀티스레드---------------");		
		
		// 인터페이스 
			// 1. 클래스에게 implements 한 후에 구현 -> 구현 객체
			// 2. 인터페이스에 new 연산자를 통한 추상메소드 구현 -> 익명 객체
		
		
		// 익명 스레드
		Runnable runnable = new Runnable() {
			// 인터페이스에 new 
			// 메모리 할당하기 위해 추상메소드 먼저 구현
			// 추상메소드를 구현 안하면 익명객체 선언 불가
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0 ; i<5 ; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
				}
				Thread thread3 = new Thread();
				thread3.start();
				
			}
		};
		for(int i=0 ; i<5 ; i++) {
			System.out.println("띵");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		System.out.println("-----------멀티스레드 익명객체---------------");	
		
		System.out.println("MAIN메소드 안에 있는 스레드 이름 : " + Thread.currentThread().getName());
			// Thread.currentThread() : 현 코드를 읽어주는 스레드 호출
				// .getName() : 스레드 이름 호출 // setName() : 스레드 이름 변경
		System.out.println("작업 스레드 이름 : " + thread.getName());
		System.out.println("작업 스레드 이름 : " + thread2.getName());
	
		
		
		
	}

}
