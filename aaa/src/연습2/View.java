package 연습2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import 연습.Car;
import 연습.Controller;

public class View {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LocalDateTime now = LocalDateTime.now();
		String cur = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd   HH : mm"));
		
		while(true) {
			
			System.out.println("================================ 주차 관리 ====================================");
			System.out.println("\t\t\t현재시간 : " + cur);
			System.out.println("  날짜\t\t차량번호\t\t입차\t\t출차\t\t금액");
			// 반복문 출력
			for(Car temp : Controller.carlist) {
				System.out.printf("  %s\t%s\t\t%s\t\t%s\t\t%s\n", temp.getDay(), temp.getCarNum(), 
						temp.getCarIn(), temp.getCarOut(), temp.getMoney());
			}		
			System.out.println("============================================================================");
			System.out.println("\t\t\t1.입차 \t\t2.출차");
			int ch = scanner.nextInt();
			try {
				if(ch==1) {
					System.out.println("차량 번호 입력");
					String carNum = scanner.next();
					Controller.In(carNum);
					
				}else if(ch==2) {
					System.out.println("차량 번호 입력");
					String carNum = scanner.next();
					Controller.Out(carNum);
					
				}else {
					System.out.println("다시 입력해주세요");
				}
			} catch (Exception e) {
				
			}
		}
	}
}
