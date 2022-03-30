package 연습2;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import 연습.Car;

public class Controller {

	public static ArrayList<Car> carlist = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	
	public static void In(String carNum) {
		int carcnt=0;
		if(carlist.isEmpty()) {
			LocalDateTime now = LocalDateTime.now();
			Car cars = new Car(carNum, now);
			carlist.add(cars);
			return;
		}
		for (Car temp : carlist) {
			if (temp.getCarNum().equals(carNum)) {
				if (temp.getCarOut().equals("주차 중")) {
					System.out.println("차량 번호 중복");
					return;

				} else {
					LocalDateTime now = LocalDateTime.now();
					Car cars = new Car(carNum, now);
					carlist.set(carcnt, cars);
					return;
				}
			}
			carcnt++;
		}
		LocalDateTime now = LocalDateTime.now();
		Car cars = new Car(carNum,now);
		carlist.add(cars);
	}
	
	public static void Out(String carNum) {
		if(carlist.isEmpty()) {
			LocalDateTime now = LocalDateTime.now();
			Car cars = new Car(carNum, now);
			carlist.add(cars);
			return;
		}
		for(Car temp : carlist) {
			if(!temp.getCarNum().equals("주차 중")) {
				System.out.println("이미 출차 처리 되었습니다");
				return;
			}
			LocalDateTime now = LocalDateTime.now();
			LocalDateTime past = temp.getNow();
			Date nowdate = Timestamp.valueOf(now);
			Date pastdate = Timestamp.valueOf(past);
			int term = (int)(nowdate.getTime() - pastdate.getTime())/600000;
			// 밀리 세컨드 이므로 /1000 - 10을 더 나눠서 시간 /10 - 분으로 설정 /60 총 60만나누기
			int money = (term -3)*1000; 
			if(money < 0) money=0;
			
			temp.setMoney(Integer.toString(money));
			temp.setCarOut(now.format(DateTimeFormatter.ofPattern("HH:mm")));
			return;
		}
		System.out.println("없는 차량입니다");
	}
}
