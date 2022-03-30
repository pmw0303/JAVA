package Day09;

public class Day09_4 {
	public static void main(String[] args) {

		// 296 ~ 297
		// @override : 재정의
		// 동일한 인수의 동일한 메소드 명 불가능
		// 목적 : 동일한 메소드를 재정의[수정]
		
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("원 넓이 : " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("원 넓이 : " + com.areaCircle(r));
		System.out.println();
		
	}
}

