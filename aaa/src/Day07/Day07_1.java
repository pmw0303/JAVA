package Day07;

public class Day07_1 {
	public static void main(String[] args) {
		
		// 메소드 호출 방법
			// 1. 메소드가 존재하는 클래스의 객체 필요
			// 2. 객체명.메소드명()
				// . : 접근연산자( 필드나 메소드 호출 시 )
		
		// 1. 객체 선언
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int return1 = myCalc.plus(3, 5);
		
		System.out.println("return1 : " + return1);
		
		
		double return2 = myCalc.divide(7, 4);
		
		System.out.println("return2 : " + return2);
	}

}
