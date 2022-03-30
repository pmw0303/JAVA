package Day06;

public class Day06_5 {

	public static void main(String[] args) {
		
		// 1. 빈생성자로 객체 생성
		Korean k1 = new Korean();
			// 2. 객체 생성 후 필드 값 변경
			k1.name = "홍길동";
			k1.ssn = "123213-123123";
		
			System.out.println(k1.nation);
			System.out.println(k1.name);
			System.out.println(k1.ssn);
			
		// 2. 필드 2개를 갖는 생성자로 객체 생성	
		Korean k2 = new Korean("박자바", "011111-1234567");
		
		System.out.println(k2.nation);
		System.out.println(k2.name);
		System.out.println(k2.ssn);
		System.out.println();
		//////////////////////////////////////////////////
		// 1. 빈 생성자 객체
		Korean 한국인1 = new Korean();
		// 한국인 1 국적 대한민국 / 이름, 주민번호 X
		
		// 2. 필드 1개 생성자 객체 생성
		Korean 한국인2 = new Korean("홍깅동");
		// 한국인 2 국적 대한민국 / 이름 홍길동 / 주민번호 X
		
		// 3. 필드 2개 생성자 객체 생성
		Korean 한국인3 = new Korean("임꺽정", "123456-123456");
		// 한국인 3 국적 대한민국 / 이름 임꺽정 / 주민번호 O
		
		// 4. 필드 3개 생성자 객체 생성
		Korean 한국인4 = new Korean("미국", "스티븐", "999");
		// 한국인 4 국적 미국 / 이름 스티븐 / 주민번호 O
		
		System.out.print(한국인1.nation + "\t");
		System.out.print(한국인1.name + "\t");
		System.out.print(한국인1.ssn + "\t");
		
		System.out.println();
		
		System.out.print(한국인2.nation + "\t");
		System.out.print(한국인2.name + "\t");
		System.out.print(한국인2.ssn + "\t");
		
		System.out.println();
		
		System.out.print(한국인3.nation + "\t");
		System.out.print(한국인3.name + "\t");
		System.out.print(한국인3.ssn + "\t");
		
		System.out.println();
		
		System.out.print(한국인4.nation + "\t");
		System.out.print(한국인4.name + "\t");
		System.out.print(한국인4.ssn + "\t");
		
		
		
		
	}
}
