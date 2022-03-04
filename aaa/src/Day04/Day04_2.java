package Day04;

import java.util.Scanner;

public class Day04_2 {

	public static void main(String[] args) {

		// 자판기 프로그램
//			1. 메뉴판 [1. 콜라(300) 2. 환타(200) 3. 사이다(100) 4. 결제(장바구니)]
//					메뉴판에서 제품 선택하면 장바구니에 넣기
//					[조건] : 재고 부족하면 알림(재고부족)
//			2. 초기 재고 [제품 10개 씩]
//			3. 결제시 금액 입력받아 결제액만큼 차감 후 잔돈 출력
//					[조건] : 투입한 금액보다 결제액이 부족하면 결제 취소(금액부족)

		Scanner scanner = new Scanner(System.in);
		// 재고 수
		int cols = 10;
		int hwas = 10;
		int cids = 10;
		// 구매 수
		int colb = 0;
		int hwab = 0;
		int cidb = 0;
		// 가격
		int col = 300;
		int hwa = 200;
		int cid = 100;
		// 총 금액
		int balance = 0;

		while (true) {
			System.out.println("---------------------------");
			System.out.println("1. 콜라|2. 환타|3. 사이다|4. 결제");
			System.out.println(" 300원   200원   100원");
			System.out.println("---------------------------");
			System.out.print("선택 : \n");
			int ch = scanner.nextInt();

			if (ch == 1) { // 콜라 구매
				if (cols == 0) {
					System.out.println("알림)) 완 판");
				} else {
					System.out.println("[ 콜라를 담았습니다. ]");
					colb++;
					cols--;
				}
			} else if (ch == 2) { // 환타 구매
				if (hwa == 0) {
					System.out.println("알림)) 완 판");
				} else {
					System.out.println("[ 환타를 담았습니다. ]");
					hwab++;
					hwas--;
				}

			} else if (ch == 3) { // 사이다 구매
				if (cids == 0) {
					System.out.println("알림)) 완 판");
				} else {
					System.out.println("[ 사이다를 담았습니다. ]");
					cidb++;
					cids--;
				}

			} else if (ch == 4) {
				balance = (colb * 300) + (hwab * 200) + (cidb * 100);
				System.out.println("----------결제 품목----------");
				System.out.println("제품명\t수량\t금액");
				if (colb != 0)
					System.out.println("콜라 :\t" + colb + "\t" + (colb * 300));
				if (hwab != 0)
					System.out.println("환타 :\t" + hwab + "\t" + (hwab * 200));
				if (cidb != 0)
					System.out.println("사이다 :\t" + cidb + "\t" + (cidb * 100));
				System.out.println("제품 총 결재액 : " + balance);
				System.out.println("--------------------------");
				System.out.println("1. 결제 2. 취소");
				int ch2 = scanner.nextInt();

				if (ch2 == 1) {
//					금액 입력받기
//					금액이 결제액보다 적으면 결제 불가 -> 재입력
//					금액이 결제액보다 크면 결제 -> 잔돈 출력

					while (true) {
						System.err.println("알림)) 금액 : ");
						int money = scanner.nextInt();
						if (money < balance) {
							System.err.println("알림)) 결제 금액 부족");
							
						}else {
							System.err.println("알림)) 결제 완료");
							System.err.println("알림)) 남은 금액 : " + (money-balance));
							break;
						}
					}

				} else if (ch2 == 2) {
					System.out.println("알림)) 구매목록 모두 지우기");
					cols += colb;
					hwas += hwab;
					cids += cidb;
					colb = 0;
					hwab = 0;
					cidb = 0;

				} else {
					System.out.println("오류");
				}

			} else {
				System.out.println("오류");
			}

		}

	}
}
