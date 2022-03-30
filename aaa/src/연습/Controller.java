package 연습;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.sql.Timestamp;

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
//	static LocalDateTime now = LocalDateTime.now();
	
	public static void In(String carNum) {
		int carcount = 0;
		if(carlist.isEmpty()) {
			LocalDateTime now = LocalDateTime.now();
			Car cars = new Car(carNum,now);
			carlist.add(cars);
			return;
		}
		for(Car temp : carlist) {
			if(temp.getCarNum().equals(carNum)) {
				if(temp.getCarOut().equals("주차 중")) {
					System.out.println("차량 번호 중복");
					return;
				}else {
					LocalDateTime now = LocalDateTime.now();
					Car cars = new Car(carNum,now);
					carlist.set(carcount, cars);
					return;	
				}
			}
			carcount++;
		}
		LocalDateTime now = LocalDateTime.now();
		Car cars = new Car(carNum,now);
		carlist.add(cars);
	}
	
	public static void Out(String carNum) {
		if(carlist.isEmpty()) {
			System.out.println("차량이 비어있습니다.");
			return;
		}

		for(Car temp : carlist) {
			if(temp.getCarNum().equals(carNum)) {
				if(!temp.getCarOut().equals("주차 중")){
					System.out.println("이미 출차 처리 된 차량입니다.");
					return;
				}
				LocalDateTime now = LocalDateTime.now();
				LocalDateTime past = temp.getNow();
				Date nowdate =Timestamp.valueOf(now); //현재
				Date pastdate =Timestamp.valueOf(past); //과거
				int term = (int)((nowdate.getTime()- pastdate.getTime())/600000);
				int money = (term-3) * 1000;
				if(money<0) {
					money = 0;
				}
				temp.setMoney(Integer.toString(money));
				temp.setCarOut(now.format(DateTimeFormatter.ofPattern("HH:mm")));
				return;
			}
		}
		System.out.println("없는 차량입니다.");
	
	}
}
