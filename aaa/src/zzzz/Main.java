package zzzz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Car> carlist = new ArrayList<Car>();
		Enter in = new Enter();
				
		while(true) {		
			try {
				System.out.println("====================== 주차 관리 시스템 =====================");
				System.out.println("차량번호\t주차위치\t입차시간\t\t출차시간\t\t금액\n");					
				System.out.println("========================================================");
				System.out.println();
				
				for(Car temp : carlist) {
					if(temp != null	){
						System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%d\n", temp.getCarNum()
								, temp.getParkArea(), temp.getCarIn(), temp.getCarOut(),
								temp.getMoney());
					}
				}
				
				System.out.println("1.입차 2.출차");
				int ch = scanner.nextInt();
				if(ch==1) {
					in.in(scanner);
				}else if(ch==2) {
					
				}
				
				
			} catch (Exception e) {
				
			}
			
			
		}
	}
}
