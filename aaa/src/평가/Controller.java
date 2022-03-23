package 평가;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Controller {

	Scanner scanner = new Scanner(System.in);
	static ArrayList<Car> carlist = new ArrayList<>();
	
	public static void In(String carNum) {
		try {
			int carcnt=0;
			if(carlist.isEmpty()) {
				LocalDateTime now = LocalDateTime.now();
				Car cars = new Car(carNum, now);
				carlist.add(cars);
				return;
			}
			for(Car temp : carlist) {
				if(temp.getCarNum().equals(carNum)) {
					if(temp.getCarOut().equals("주차 중")) {
						System.err.println("주차중인 차량입니다");
						return;
					}else {
						LocalDateTime now = LocalDateTime.now();
						Car cars = new Car(carNum, now);
						carlist.add(cars);
						return;					
					}
				}
			}
			LocalDateTime now = LocalDateTime.now();
			Car cars = new Car(carNum, now);
			carlist.add(cars);			
		} catch (Exception e) {}
	}
	
	
	public static void Out(String carNum) {
		try {
			if(carlist.isEmpty()) {
				LocalDateTime now = LocalDateTime.now();
				Car cars = new Car(carNum, now);
				carlist.add(cars);
				return;
			}
			for(Car temp : carlist) {
				if(!temp.getCarOut().equals("주차 중")) {
					System.err.println("이미 출차 처리 되었습니다");
					return;
				}
				LocalDateTime now = LocalDateTime.now();
				LocalDateTime past = temp.getNow();
				Date nowd = Timestamp.valueOf(now);
				Date pastd = Timestamp.valueOf(past); 
				int term = (int)(nowd.getTime()-pastd.getTime())/600000;
				int money = (term-3) * 1000;
				if(money < 0) {
					money =0;
				}
				temp.setCarOut(now.format(DateTimeFormatter.ofPattern("HH:mm")));
				temp.setMoney(Integer.toString(money));
				return;
			}
			System.err.println("이미 출차 처리 되었습니다");
			
			
		} catch (Exception e) {}
	}
	
}
