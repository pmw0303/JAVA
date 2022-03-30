package Day12;

public class Day12_2 {

	// p499 String 클래스 메소드

	// charAt() : 문자열에서 특정문자 추출

	public static void main(String[] args) {
		String ssn = "123456-1876541";
		char s = ssn.charAt(7);

		switch (s) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");

		}
		
		// p501 equals() : 문자열 비교
			// 기본자료형 사용하는 변수는 연산자 사용가능 / ==
			// String 클래스 사용하는 객체는 == 연산자 사용 불가 / equals
		
		
		
		String strVar1 = new String("신민철");
		String strVar2 = "신문철";
		
		if(strVar1 == strVar2) { // 힙 주소 비교
			System.out.println("같은 String");
		}else if(strVar1 != strVar2) {
			System.out.println("다른 String");
		}
		
		if(strVar1.equals(strVar2)) { // 힙 내용을 비교
			System.out.println("같은 문자열");
		}else {
			System.out.println("다른 문자열");
		}
		
		// p502 getBytes() : 문자열 -> 바이트열 변환
		String str = "안녕하세요";
		
		byte[] bytes1 = str.getBytes(); // 문자열 -> ㅂ바이트열
		System.out.println(bytes1.length); // 배열 길이
		
		String str1 = new String(bytes1);
		System.out.println("바이트열 -> 문자열 : " + str1);
		try {
		byte[] byte2 = str.getBytes("EUC-KR");
		System.out.println("길이 : " +byte2.length);
		String str2 = new String(byte2, "EUC-KR");
		System.out.println("바이트열 -> 문자열 : " +str2);
		
		byte[] byte3 = str.getBytes("UTF-8");
		System.out.println("길이 : " +byte3.length);
		String str3 = new String(byte3, "UTF-8");
		System.out.println("바이트열 -> 문자열 : " +str3);
		System.out.println();
		}catch(Exception e) {
			
		}
		
		String oldStr = "자바는 객체지향";
		String newStr = oldStr.replace("자바", "JAVA");
		
		System.out.println("기존 : " + oldStr);
		System.out.println("새로운 : " + newStr);
		System.out.println();
		
		// p507 Substring() vs split() : 문자열 자르기
		//     인덱스 기준        문자기준
		String ssn3 = "888888-1111111";
				
		String firstNum = ssn3.substring(0, 6);
		System.out.println(firstNum);
		
		String secondNum = ssn3.substring(7);
		System.out.println(secondNum);
		// split
		System.out.println(ssn3.split("-")[0]); // 앞부분 
		System.out.println(ssn3.split("-")[1]); // 뒷부분
		System.out.println("-------------------------");
		// p508
			// 영문문자열.toLowerCase() -> 영문 [소문자]
			// 영문문자열.toUpperCase() -> 영문 [대문자]
		
		// p509
			// 문자열.trim() : 공백제거 
		// p510 valuOf() : 기본타입 [int, double 등] -> 문자열 변환
		String str2 = String.valueOf(10); // int형 10 -> String 10 으로 변환
		String str3 = String.valueOf(10.5); // double형 10.5 -> String 10.5 으로 변환
		String str4 = String.valueOf(true); // boolean형 true -> String true
		String str5 = 10+""; // 숫자+문자 -> 문자
		
		System.out.println(str2 + 10);
		System.out.println(str3 + 10);
		// if(str4) -> 오류 [문자형임]
		System.out.println(str4 + 10);
		
		
	}

}
