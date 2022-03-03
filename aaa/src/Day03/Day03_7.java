package Day03;

import java.util.Scanner;

public class Day03_7 {

	public static void main(String[] args) {

		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) { // while(true) 무한루프
			System.out.println("------------------------------");
			System.out.println("1. 에금 |2. 출금 |3. 잔고 |4. 종료 ");
			System.out.println("------------------------------");
			System.out.print("선택 > ");

			int num = scanner.nextInt();

			if (num == 1) {
				System.out.print("예금액 : ");
				int ye = scanner.nextInt();
				balance += ye;

			} else if (num == 2) {
				System.out.print("출금액 : ");
				int chu = scanner.nextInt();
				balance -= chu;
				if (balance < chu) {
					System.out.println("출금 불가");
					
				} else {
					balance -= chu;
				}
				
			} else if (num == 3) {
				System.out.println("잔고 : " + balance);
			} else if (num == 4) {
				break; // 루프 종료

			} else {
				System.out.println("오류입니다. ");
			}

		}

		System.out.println("프로그램 종료");
	}
}
