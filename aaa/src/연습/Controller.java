package 연습;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
		// 입차 코드 작성
			// 입력받은 차량번호(인수) 받기  *중복체크
			// 입차날짜 구하기
			// 입차 시간 구하기
			// 출차 시간/금액 -> 출차 때
			// 차량번호, 입차날짜, 입차시간 -> 3개변수 객체화
			// 차량 객체 -> 배열 / 리스트 정하기
			// 파일 처리 or DB 처리
			
		// 출차 코드 작성
			// 입력받은 차량번호 가져오기
			// 배열 or 리스트내 동일한 차량번호를 찾기
			// 출차시간(현재시간) 구하기
			// 계산 [출차시간 - 입차시간 = (분-30)/10 *1000
			// 찾은 객체 내 출차시간과 금액을 대입
	
	// 배열 경우 
//	public static Car[] carlist = new Car[100];
	// 리스트
	public static ArrayList<Car> carlist = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);	
	static LocalDateTime now = LocalDateTime.now();
	static String cur1 = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
	static String inTime = now.format(DateTimeFormatter.ofPattern("HH:mm"));
	static String outTime = now.format(DateTimeFormatter.ofPattern("HH:mm"));
	
	public static boolean In() {
		System.out.println("차량번호 입력"); String num = scanner.next();

		for(Car temp : carlist) {
			if(temp.getCarNum().equals(num)) {
				System.out.println("차량 번호 중복");
			}else {
				Car cars = new Car();
				carlist.add(cars);
			}
		}
		
		return false;
	}
	
	public static boolean Out() {
		
	
		return false;
	}
}
