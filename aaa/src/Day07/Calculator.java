package Day07;

public class Calculator {
	
	// 클래스 선언
	
	// 1. 필드
	
	// 2. 생성자

	// 3. 메소드
	
	void powerOn() {
		System.out.println("전원 실행");
	}
	// 1. void : 리턴타입
		// 
	// 2. powerOn : 메소드 이름[아무거나]
	// 3. (매개변수[인수]) : 함수로 들어오는 데이터
	// 4. { } : 함수 실행부
	
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
		
	}
	// 1. int : 리턴타입 [ 함수가 종료되면서 int형 데이터가 반환]
	// 2. plus : 메소드이름[ 아무거나 ]
	// 3. ( int x, int y) : int형 2개 매개변수 받기
		// 함수 호출시 함수로 들어오는 x 와  y 는 int 형으로 받기
	// 4. 실행부 {}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	
}


