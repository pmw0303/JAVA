package Day07;

public class Day07_4 {

	public static void main(String[] args) {
		
		// 1. 객체 선언*****
		Car2 mycar = new Car2();
		
		// 2. 자동차 시동 걸기
		mycar.keyTurnOn();
		
		// 3. 자동차 주행
		mycar.run();
		
		// 4. 속도 확인
		int speed = mycar.getSpeed();
		System.out.println("현재 속도 : " + speed + "km/h");
		
	}
	
}
