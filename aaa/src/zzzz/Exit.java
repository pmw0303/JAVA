package zzzz;

import java.util.ArrayList;
import java.util.Scanner;

public class Exit {
	public Exit() {
	}
	
	void out(Scanner scanner) {
		ArrayList<Car> carlist = new ArrayList<Car>();
		String num;
		
		System.out.println("=========================차량번호 입력=========================");	
		num = scanner.next();
		try {
			for(Car temp : carlist) {
				if(num == temp.getCarNum()) {
					System.out.println("차량번호\t입차시간\t\t출차시간\t\tㄱ금액");
					System.out.printf("%d\t%d\t%s\t\t%s\t\t%d\n",
							temp.getCarNum(), temp.getCarIn()
							, temp.getCarOut(), temp.getMoney());
					System.out.println("출차 하시겠습니까");
					System.out.println("1.예 2.아니오");
					int ch=scanner.nextInt();
					if(ch==1) {
						
						
					}else if(ch==2) {
						break;
					}
				}else System.out.println("잘못된 입력값입니다");
				
			}
		} catch (Exception e) {
			
		}
	}

}
