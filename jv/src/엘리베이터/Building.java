package 엘리베이터;

import java.util.Random;
import java.util.Scanner;

public class Building {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Elevator e = new Elevator(1);

		System.out.println("----------------");
		System.out.print("현재 층 입력 : ");
		int now = sc.nextInt();
		
		boolean arrive = false;
		while(true) {
			if(now > 20 || now < 0) {
				System.out.println("잘못된 숫자 입력");
				
			}else if(now > 0) {
				if(e.floor < now) {
					System.out.println(e.floor + "층입니다");
					e.floor ++;
					if(e.floor == now)
					System.out.println("도착했습니다"); arrive = true;
				}else if(e.floor > now) {
					System.out.println(e.floor + "층입니다");
					e.floor --;
					if(e.floor == now)
					System.out.println("도착했습니다"); arrive = true;
				}
			}else if(now < 20) {
				
			}else if(now == e.floor) {
				
			}
		}
		
	}
}
