package Day10;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Day10_6 {
	
	// 파일처리 : 자바 내 메모리 -> 보조 기억장치
	// DB처리 : 자바 내 메모리 -> DB 서버 [PC]
		// FileOutputStream : 파일 출력 클래스
			// 객체명.write(byte 열);
		// FileInputStream : 파일 입력 클래스
			// 객체명.read(byte 배열);
		// String 클래스
			// 문자열.equals() : 문자열 비교 메소드
			// 문자열.getBytes() : 문자열 -> 바이트열 변환
			// new String[바이트배열] : 바이트배열 -> 문자
	
	public static void main(String[] args) throws IOException {
		// ** 둘다 byte로 밖에 안됨 **
		
		// 1. 파일 출력(저장하기)
		FileOutputStream 파일출력 = new FileOutputStream("D:/자바/java.txt");
		// FileOutputStream : 파일 출력 클래스
		// FileOutputStream( 파일경로/파일명.확장자) 
		String 내용 = "입력된 데이터";
		파일출력.write(내용.getBytes()); 
		
		// 2. 파일 입력(받아오기)
		FileInputStream 파일입력 = new FileInputStream("D:/자바/java.txt");
		byte[] bytes = new byte[1000]; 
				파일입력.read(bytes);
				System.out.println("파일내용 : " + new String(bytes));
	}

}
