package Day07;

public class Day07_2 {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		mycar.setGas(5);
		
		// 메소드 호출 [ 인수X 반환=ture 혹은 false
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			mycar.run();
		}
		
		if(mycar.isLeftGas()) { 
			System.out.println("gas를 주입할 필요가 없습니다");
		}else {
			System.out.println("gas를 주입하세요.");
		}
		
	}
}
