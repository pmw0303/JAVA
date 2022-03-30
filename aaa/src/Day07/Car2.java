package Day07;

public class Car2 {

	// 필드
	int speed;
	
	// 생성자
		// 생성자 없으면 기본 생성자 추가
	
	// 메소드
	// 1. 현재 필드값 반환해주는 메소드
	int getSpeed() {
		return speed;
	}
	// 2. 출력 메소드
	void keyTurnOn() { // 인수 X, 반환 X
		System.out.println("키를 돌립니다.");
	}
	// 3. 스피드 증가 메소드 [ 최대 50까지 10씩 증가 반복 ]
	void run() { // 인수 X, 반환 X
		for(int i=10; i<=50 ; i+=10) {
			// i는 10부터 50까지 10씩 증가하면 반복 -> 5회
			speed = i;
			System.out.println("달립니다.(시속 : " + speed + "km/h)");
		}
	}
}
