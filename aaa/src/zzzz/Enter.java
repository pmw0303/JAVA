package zzzz;

import java.util.ArrayList;
import java.util.Scanner;

public class Enter {
	ArrayList<Car> carlist = new ArrayList<Car>();
	
	void in(Scanner scanner) {
		String carNum;
		String parkArea;
		
		try {
			System.out.println("차량 번호 입력"); carNum =  scanner.next();
			System.out.println("주차 위치 입력"); parkArea = scanner.next();
			for(Car temp : carlist) {
				if(carNum == temp.getCarNum() && parkArea == temp.getParkArea()) {
					System.out.println("이미 주차가 되어있습니다");
				}else {
					System.out.println("주차되었습니다");
					// 시간 계산 넣기
					Car car = new Car(carNum, parkArea);
					carlist.add(car);
				}
			}
		} catch (Exception e) {
			
		}
	}
	
	
}
