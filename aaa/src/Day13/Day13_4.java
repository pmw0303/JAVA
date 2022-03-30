package Day13;

import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {

	public static void main(String[] args) throws Exception{
		
		// p544 DecimalFormat 클래스 : 숫자 데이터를 원하는 형식으로 표현
			// 패턴 종류
				// 0 : 자리수 [빈자리면 0채움]
				// # : 자리수 [빈자리면 채우기 X]
		
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("###########.######");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0"); // 무조건 소수점 한자리 표시
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		// 천 단위 쉼표 구분 **********
		df = new DecimalFormat("#,##0원");
		System.out.println(df.format(0));
		
		df = new DecimalFormat("#,###원");
		System.out.println(df.format(0));
		
		df = new DecimalFormat("0,000원");
		System.out.println(df.format(0));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#.###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#.###");
		System.out.println(df.format(123));
		
		df = new DecimalFormat("+#,###;-#.###");
		System.out.println(df.format(-123));
		
		// 컴퓨터는 백분율 X [ 1 = 100% , 0.4 = 50% ]
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
		// p544 : DecimalFormat 클래스 : 숫자 형식 변환
		// p545 : SimpleDateFormat 클래스 : 날짜 형식 변환
		// p547 : MessageFormat 클래스 : 문자 형식 변환
		
		String id = "java";
		String name = "용권";
		String tel = "010-1234-5678";
		
		String text = "회원 ID : {0} \n회원 이름 : {1} \n회원 전화 : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		// DB 에서 사용할 예정
		String sql = "insert info member values( {0} {1} {2} )";
		Object[] arr = { id, name, tel };
		String result2 = MessageFormat.format(sql, arr);
		System.out.println(result2);
		
		// JAVA 7 버전 이전 Date
		LocalDate currDate = LocalDate.now();
		System.out.println("지금 : " + currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println("지금 : " + currTime);
		
//		Date 현재날짜/시간 [조작이 안되거나 비교기능 불충분]
//		vs
//		LocalDate : 현재날짜    LocalTime : 현재시간
		
		LocalDateTime crr = LocalDateTime.now();
		System.out.println("현재 날짜/시간 : " + crr);
		
		// 시간차 [시간계산]
		Instant ins1 = Instant.now();
		Thread.sleep(1000);  // ms 이므로 1000 = 1초
		Instant ins2 = Instant.now();
		
		if(ins1.isBefore(ins2)) {
			System.out.println("ins1가 더 빠름");
		}else if(ins1.isAfter(ins2)) {
			System.out.println("ins2 가 더 늦음");
		}else {
			System.out.println("동일시간");
		}
		
		System.out.println("시간 차 : " + ins1.until(ins2, ChronoUnit.NANOS));
		
		
	}
}
