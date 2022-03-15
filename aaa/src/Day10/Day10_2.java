package Day10;

public class Day10_2 {
	public static void main(String[] args) {
		
		// 인터페이스 
			// 목적 : 동일한 목적하에 동일한 기능을 수행
		
		// 1. 인터페이스 객체 선언
		RemoteControl rc;
		
		// 2. 인터페이스에 텔레비전 클래스 메모리 할당
		rc = new Television();
		// 3. 인터페이스 실행
		rc.turnOn(); // tv실행
		rc.turnOff(); // tv종료
		rc.setVolume(10);
		
		RemoteControl rc1;
		
		rc1 = new Audio();
		
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(5);
		
		
		// *** 클래스 없이 추상 메소드 정의 *** 익명구현객체
		RemoteControl rc2 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("리모컨 켭니다");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("리모컨 끕니다");
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				System.out.println("현재 볼륨 : " + volume);
			}
		};
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(3);
		
		rc2.setMute(true);
		
		// 정적 메소드 호출
		RemoteControl.changeBattery();
		
		// 메모리 할당 받기 -> 외부 클래스, 인터페이스내 필드, 메소드 사용시 
			// 1. new 연산자
			// 2. static 연산자
		
	}

}
