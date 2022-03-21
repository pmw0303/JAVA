package 연습;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Parking_exit {
	
	public Parking_exit() {}
	
	void out(Parking_state state, Scanner scanner) {
		
		LocalDateTime localdate = LocalDateTime.now();
		ArrayList<Parking_date> date_array = new ArrayList<>();
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/java/차량출입기록.txt");
			byte[] bytes = new byte[1024];
			inputStream.read(bytes);
			String 파일내용 = new String(bytes);
			String[] 주차정보목록 = 파일내용.split("\n");
			int i=0;
			for(String temp : 주차정보목록) {
				if(i+1 == 주차정보목록.length) {
					String[] 필드목록 = temp.split(",");
					Parking_date parking_date = new Parking_date(Integer.parseInt(필드목록[0]),
							Integer.parseInt(필드목록[1]),
							Integer.parseInt(필드목록[2]),
							Integer.parseInt(필드목록[3]),
							Integer.parseInt(필드목록[4]),
							Integer.parseInt(필드목록[5]),
							Integer.parseInt(필드목록[6]));
					
					date_array.add(parking_date);
					i++;
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Calendar calendar = Calendar.getInstance();
		
		long yearNow = calendar.get(Calendar.YEAR);
	    long monthNow = calendar.get(Calendar.MONTH) + 1;
	    long dayNow = calendar.get(Calendar.DAY_OF_MONTH);
	    long timeNow= calendar.get(Calendar.HOUR_OF_DAY);
	    long minNow= calendar.get(Calendar.MINUTE);
	    
	    int num=0;
	    int real_num = num - 1;
	    System.out.println("차량 번호를 입력하세요");
	    num=scanner.nextInt();
	    
	    for(Parking_date board : date_array) {
	    	if(num==board.get차량번호()) {
	    		System.out.println("차량번호\t주차연\t주차월\t주차일\t주차시\t주차분\t주차위치");
	    		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n", 
	    				board.get차량번호(), board.get주차연(), board.get주차월(),
	    				board.get주차월(), board.get주차일(), board.get주차시(),
	    				board.get주차분(), board.get주차위치()+1);
	    		System.out.println("출차 하시겠습니까"); int sc = scanner.nextInt();
	    		System.out.println("1.예 2.아니요");
	    		
	    		if(sc==1) {
	    			
	    		}
	    		
	    	}
	    }
		
	}
	
}
