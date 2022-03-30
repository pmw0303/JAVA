package zzzz;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Enter {
	ArrayList<Car> carlist = new ArrayList<Car>();
	Date date = new Date();
	LocalDate curDate = LocalDate.now();
	SimpleDateFormat sdf = new SimpleDateFormat("hh:mm");
	String strnow = sdf.format(date);
	void in(Scanner scanner) {
		String carNum;	
		try {
			System.out.println("차량 번호 입력"); carNum =  scanner.next();
			int i=0;
			for(Car temp : carlist) {
				if() {
					
				}
			}
		} catch (Exception e) {
			
		}
	}
	
	
}
