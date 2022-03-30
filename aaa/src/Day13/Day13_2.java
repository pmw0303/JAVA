package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day13_2 {

	
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		// 날짜 형식 모양 변경
		
		String strnow = sdf.format(date);
		// 날짜에 형식 적용 ->  date 형식을 String으로
		
		System.out.println(strnow);
		
		
		// p540
		Calendar now = Calendar.getInstance();
		// 이미 Calender 클래스 내에 객체 존재 -> (new) 별도 생성 불필요
		System.out.println(" 연도 : " + now.get(Calendar.YEAR)); // 년
		System.out.println(" 월 : " + (now.get(Calendar.MONTH)+1)); // 0~11 이므로 1을 더해준다
		System.out.println(" 일 : " + now.get(Calendar.DAY_OF_MONTH)); // 일
		
		System.out.println(" 요일 : " + now.get(Calendar.DAY_OF_WEEK)); // 주 기준 - 일(1) 월(2) 화(3) 수(4) 목(5) 금(6) 토(7)
		int week = now.get(Calendar.DAY_OF_WEEK);
		String 요일 = null;
		switch (week) {
		case 1:
			요일 = "일";
			break;
		case 2:
			요일 = "월";
			break;
		case 3:
			요일 = "화";
			break;
		case 4:
			요일 = "수";
			break;
		case 5:
			요일 = "목";
			break;
		case 6:
			요일 = "금";
			break;
		case 7:
			요일 = "토";
			break;

		}
		System.out.println("요일[한글] : " + 요일);
		
		
		// 오전/오후
		System.out.println("오전/오후(0/1) : " + now.get(Calendar.AM_PM)); 
		int ampm = now.get(Calendar.AM_PM);
		String 오전오후 = null;
		if(ampm == 0) {
			오전오후 = "오전";
		}else if(ampm ==1) {
			오전오후 = "오후";
		}
		System.out.println("오전/오후 : " + 오전오후);
		
		
		System.out.println(" 시 : " + now.get(Calendar.HOUR));
		System.out.println(" 분 : " + now.get(Calendar.MINUTE));
		System.out.println(" 초 : " + now.get(Calendar.SECOND));
		
		// ZonedDateTime 클래스 : 세계 협정시
		ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("협정시 : " + zoned);
		zoned = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("서울시간 : " + zoned);
		zoned = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("뉴욕시간 : " + zoned);
		
		
	}
}
