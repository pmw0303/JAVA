package 평가;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		LocalDateTime now = LocalDateTime.now();
		String cur = now.format(DateTimeFormatter.ofPattern("yyyy - MM - dd  HH:mm"));
		
		while(true) {
			try {
				System.out.println("============================ 주차 현황 표 ================================");
				System.out.println("\t\t\t"+cur); // 시간 출력
				System.out.println("  날짜\t\t차량번호\t\t입차시간\t\t출차시간\t\t금액");
				// 반복문 써서 내용출력
				for(Car temp : Controller.carlist) {
					System.out.printf("  %s\t%s\t%s\t\t%s\t\t%s\n", temp.getDay(), temp.getCarNum(), temp.getCarIn(),
													temp.getCarOut(), temp.getMoney());
				}
				System.out.println("=======================================================================");
				
				System.out.println("\t\t\t1.입차   2.출차");
				int ch = scanner.nextInt();
				
				if(ch==1) {
					// 번호 입력받기
					System.out.println("차량 번호 입력");
					String carNum = scanner.next();
					Controller.In(carNum);
				}else if(ch==2) {
					// 번호 입력받기
					System.out.println("차량 번호 입력");
					String carNum = scanner.next();
					Controller.Out(carNum);
				}else {
					System.out.println("잘못된 번호입니다");
				}
				
			} catch (Exception e) {	}
		}
	}
}
