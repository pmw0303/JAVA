package Day11;

public class Day11_2 {

	// p442
	// 컴퓨터 하드웨어 문제 에러 [실행불가]
	// 사용자의 잘못된 조작 or 개발자의 잘못된 코딩
	// 종류 ㅣ 1. 일반예외 2. 실행예외
	// 일반예외 : 컴파일 전 예외 검사
	// 실행예외 : 컴파일 후 예외 검사
	// 예외처리
	// 목적 : 에러가 발생하면 프로그램 종료 [안정성]
	// 만약 에러가 발생하면 대체 코드 실행 [프로그램 종료X]

	public static void main(String[] args) {

		// p423
		try {
			String data = null;
			System.out.println(data.toString()); // toString() : 객체 정보 출력
			// 실행전 에러 X
			// 에러 이유 : null 값이기 때문에 메모리 할당이 없음 / 출력 불가
		} catch (NullPointerException e) {
			System.out.println("예외 : " + e);
		}
		// p424
		try {
		String[] 배열 = new String[2];
		배열[0] = "a"; 배열[1] = "b"; 배열[2] = "c";
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("예외 : " + e);
		}
		
		// p426
		try{
		String data1 = "100";
		String data2 = "a100";
		int value1 = Integer.parseInt(data1); // "100" -> 100 O
		int value2 = Integer.parseInt(data2); // "a100" -> a100 X [a는 정수 불가능]
		
		// 오류 발생 이유 : 문자열 내 숫자형식은 변환이 가능하지만 문자열 내 문자형식 변환이 불가능 
		// 오류 발생 시 catch 이동 [이후 코드 실행 X]
		int result = value1 + value2;
		System.out.println(result);
		}catch(NumberFormatException e) {
			System.out.println("예외 : " + e);
		}
		
		// p428
		try {
		String 문자열 = "유재석";
		Object 슈퍼객체;
		
		슈퍼객체 = 문자열; // 자식 -> 부모 O
		문자열 = (String)슈퍼객체; // 부모 -> 자식 X
		}catch(Exception e) {
			System.out.println("예외 : " + e);
		}
	}
}
