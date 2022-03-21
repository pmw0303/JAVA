package 연습;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Parking_In {

	ArrayList<Parking_date> date_array = new ArrayList<>();
	void in(Parking_state state, Scanner scanner) {
		int position = 0;
		int car_num = 0;
		int year = 0;
		int month = 0;
		int day = 0;
		int hour = 0;
		int min = 0;
		
		System.out.println("주차위치 입력");
		position = scanner.nextInt();
		int real_position = position-1;
		if(state.box[real_position].equals("[ ]")) {
			System.out.println("차량 번호 : "); car_num=scanner.nextInt();
			System.out.println("주차 연 : "); year=scanner.nextInt();
			System.out.println("주차 월 : "); month=scanner.nextInt();
			System.out.println("주차 일 : "); day=scanner.nextInt();
			System.out.println("주차 시 : "); hour=scanner.nextInt();
			System.out.println("주차 분 : "); min=scanner.nextInt();
			
			state.box[real_position] = "[O]";
			System.out.println(position + "주차 완료");
			
			Parking_date date = new Parking_date(car_num, year, month, day, hour, min, real_position);
			date_array.add(date);
			
			try {
				FileOutputStream OutputStream = new FileOutputStream("D:/java/차량출입기록.txt");
				String 내보내기 = car_num + "," + year + "," + month + "," 
							+ day + "," + hour + "," + min + "," + real_position;
						OutputStream.write(내보내기.getBytes());
			}catch(Exception e) {
				
			} System.out.println("주차 완료");
		}else 
			System.out.println("이미 주차가 되어있습니다");	
		
		state.print_state();
	}
}
