package Day09;

public class Day09_5_타이어실행예제 {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		for(int i = 1 ; i <= 7 ; i++) {
			int problemLocation = mycar.run(); // 자동차 회전 메소드 5회
		
			switch(problemLocation) {
			
			case 1:
				System.out.println("앞왼쪽 한국타이어 교체");
				mycar.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break; // switch 탈출
				
			case 2:
				System.out.println("앞오른쪽 금호타이어 교체");
				mycar.frontRightTire = new KumhoTire("앞오른쪽", 13);
				break;
				
			case 3:
				System.out.println("뒤왼쪽 한국타이어 교체");
				mycar.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
				
			case 4:
				System.out.println("뒤오른쪽 금호타이어 교체");
				mycar.backRightTire = new KumhoTire("뒤오른쪽", 17);
				break;
			}
		
			System.out.println("-------------");
			
		
		}
	}
}
