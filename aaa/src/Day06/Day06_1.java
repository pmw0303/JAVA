package Day06;

public class Day06_1 {

	public static void main(String[] args) {
		
//		클래스
//			1. 클래스 : 설계도
//			2. 객체(인스턴스) : 설계도 기반으로 메모리 할당받은 변수
//			
//			ex) 붕어빵 틀 = 클래스
//				모양, 밀가루, 틀 .. -> 필드[속성 = 상태]
//				굽기, 뒤집기, 판매 -> 메소드[행동]
//				붕어빵 틀로부터 여러개 생성
//					서로 다른 붕어빵 생성[붕어빵1, 붕어빵2 ..]
//							
//							
//			ex) 회원가입
//				아이디, 비밀번호, 이름, 생년월일 .. -> 필드
//				회원가입, 아이디 찾기, 비밀번호 찾기, 회원탈퇴 ..args -> 메소드[행동]
//					서로 다른 회원 생성 [회원1, 회원2 ..args]	
		
		
		Student s1 = new Student();
		
//		1. Student : 정의된 클래스명
//		2. student : 객체명[아무거나] : 추천[클래스명 소문자]
//		3. new 연산자 : 메모리(저장공간) 생성
//		4. Student() : 생성자명()
//		** 객체 생성시 4가지 필요!!**
		
		System.out.println("s1 변수가 Student 객체를 참조합니다");
		System.out.println(s1);
		
		Student s2 = new Student();
		System.out.println("s2 변수가 다른 Student 객체를 참조합니다");
		System.out.println(s2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
