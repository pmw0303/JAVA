package Day06;

public class Korean {
	// Korean 클래스 선언
	
	// 1. 필드
	String nation = "대한민국";
			// 국가
	String name;
			// 이름 변수 초기화 X -> NULL
	String ssn;
			// 주민등록번호 변수 초기화 X -> NULL 
	
	// 2. 생성자
		// 조건1 : 생성자이름 == 클래스이름 동일
		// 조건2 : 외부로부터 들어오는 매개 값[인수] 선언
		// 조건3 : 동일한 생성자 이름 가질 수 없다
			// 오버로딩 : 동일한 이름일 경우 코드를 재정의
	
	Korean(){
		// 내용물 X
	}
	
	Korean(String n){
		// 필드 1개를 갖는 생성자
		name = n;
		
	}
	
	Korean(String n, String s){
		// 필드 2개를 갖는 생성자
		name = n;
		ssn = s;
	}
	
	Korean(String nation, String name, String ssn){
		// 필드 3개를 갖는 생성자
		this.nation = nation;
		this.name = name;
		this.ssn = ssn;
		
		// 내부변수 ( 현재 클래스 내 변수 )
		// 매개변수 ( 외부로부터 들어온 변수 )
		// 내부변수 == 매개변수 이름이 동일하면 충돌
		// 내부변수 표시 방법
			// this : 현재클래스 표시
	}
	
	// 3. 메소드
	

}
