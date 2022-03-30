package Day06;

public class Day06_2 {

	
	public static void main(String[] args) {
		
//		1. 클래스 생성 -> 객체 생성
		Car myCar = new Car(); // 객체 생성
			
//			Car : 정의된 클래스명
//			myCar : 객체이름[아무거나]
//			new : 메모리 할당 연산자
//			Car() : 생성자
		
		System.out.println("제작 회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상 : " + myCar.color);
		System.out.println("최고 속도 : " + myCar.maxSpeed);
		System.out.println("현재 속도 : " + myCar.speed);
		
		
//		객체 내 필드 값 편경 가능
		System.out.println("-------------------------------");
		myCar.speed = 70;
		System.out.println("현재 속도 : " + myCar.speed);
		
//		새로운 차 객체 생성
		System.out.println("-------------------------------");
		Car yourcar = new Car();
		System.out.println("2번 자동차 : " + yourcar.speed);
		
	}
}
