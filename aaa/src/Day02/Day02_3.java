package Day02;

import java.util.Scanner;

public class Day02_3 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		/*System.out.print("기본급 : ");
		int pay = scanner.nextInt();
		System.out.print("수당 : ");
		int plus = scanner.nextInt();
		
		int real = (int) (pay + plus - (pay*0.1));
		
		System.out.printf("실 수령액 : %s",real);*/
		//-----------------------------------------
		
		System.out.print("금액 입력 : ");
		int money = scanner.nextInt();
		
		System.out.println("십만원권 : " + money/100000);
		money -= (money/100000) * 100000;
		System.out.println("만원권 : " + money/10000);
		money -= (money/10000) * 10000;
		System.out.println("천원권 : " + money/1000);
		money -= (money/1000) * 1000;
		System.out.println("백원 수 : " + money/100);
		
	}

}
