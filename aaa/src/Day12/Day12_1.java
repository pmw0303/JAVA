package Day12;

import java.io.IOException;
import java.util.Arrays;

public class Day12_1 {

	public static void main(String[] args) throws IOException {
		
		// p496
			// String 클래스
				// 1. java.lang 패키지 [import] 소속
				// 2. 객체인데 자동 리터럴 [객체가 자동 생성]
				// 3. 13개의 생성자 [문자열, 바이트열 등]
				// 4. 외부 [파일, 네트워크 등]로 받은 데이터는 보통 바이트열
		
		// p497
		// 1. 여러 개 바이트를 저장할 수 있는 바이트 배열 선언
		byte[] bytes = {72,101,108,108,111,32,74,97,118,97};
		// 2. 바이트 배열 -> 문자열 변환
		String str1 = new String(bytes);
		
		// 3. 확인	
		System.out.println("바이트 배열 -> " + str1);
		
		// 4. 특정 위치부터 변환
		String str2 = new String(bytes, 6, 4);
		// new String( 배열명, 시작인덱스, 개수)
		System.out.println("바이트 배열 -> " + str2);
		
		// p498
			// System.out : 시스템클래스내 출력
			// System.in : 시스템클래스내 입력
		byte[] bytes2 = new byte[100];
		
		System.out.println("입력"); // 출력필드 내 print메소드 호출
		int readByteNo = System.in.read(bytes2);
		
		System.out.println("입력받은 바이트" + Arrays.toString(bytes2));
		
		String str3 = new String(bytes2, 0, readByteNo-2);
		System.out.println(str3);
		
	}
}
