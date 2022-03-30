package 연습;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
//	ArrayList<Car> carlist = new ArrayList<>();
	LocalDateTime now = LocalDateTime.now();
	String cur = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd   HH : mm"));	
		while(true) {
			// 모든 차량 출력
				// 배열 or 리스트내 모든 객체 출력 반복문
			System.out.println("================================ 주차 관리 ====================================");
			System.out.println("\t\t\t현재시간 : " + cur);
			System.out.println("  날짜\t\t차량번호\t\t입차\t\t출차\t\t금액");
			for(Car temp : Controller.carlist) {
				System.out.printf("  %s\t%s\t\t%s\t\t%s\t\t%s\n", temp.getDay(), temp.getCarNum(), 
						temp.getCarIn(), temp.getCarOut(), temp.getMoney());
			}
			System.out.println("=============================================================================");
			System.out.println("\t\t\t1.입차\t\t2.출차");
			int ch = scanner.nextInt();
			try {
				if(ch==1) {
					// 차량번호 받기
					System.out.println("차량 번호 입력");
					String carNum = scanner.next();
					// 입력받은 번호를 컨트롤러 메소드에 넘김
					
					// 메소드 결과에 따른 출력
					Controller.In(carNum);
					
				}else if(ch==2) {
					// 차량번호 받기
					System.out.println("차량 번호 입력");
					String carNum = scanner.next();
					// 입력받은 번호를 컨트롤러 메소드에 넘김
					// 메소드 결과에 따른 출력
					Controller.Out(carNum);
					
				}else {
					System.out.println("다시누르셈");
				}
			} catch (Exception e) {
				
			}
		}
		
	}
}
