package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int p; // 사용자 가 선택한 번호
		int c; // 컴퓨터가 선택한 난수
		int match = 0; // 총 게임 수
		int pw = 0;
		int cw = 0; // 각각 승리 수

		// 프로그램 시작 / 종료 조건 : 3번 입력 시
		while (true) {

			System.out.println("------가위바위보 게임-------");
			System.out.println("가위(0) 바위(1) 보(2) 종료(3) 선택 : ");
			p = scanner.nextInt();

			Random random = new Random(); // 난수 객체 선언
			// c = random.nextInt(3); // 난수 정수로 받음
			// c = random.nextInt(수); // 수 범위까지 난수 정수로 받음
			// c = random.nextInt(10); // 0 ~ 9
			// c = random.nextInt(11) + 10; // 10 ~ 20

			c = random.nextInt(3); // 난수 정수로 받음
			System.out.println(" 컴퓨터가 낸 수 : " + c);

			if (p == 3) { // 게임 종료

				System.out.println("게임 종료");
				System.out.println("총 게임 횟수 : " + match);
				System.out.println("플레이어 승리 수 : " + pw);
				System.out.println("컴퓨터 승리 수 : " + cw);
				if (pw > cw) {

					System.err.println("최종 승리자 : 플레이어");
				} else if (cw > pw) {

					System.err.println("최종 승리자 : 컴퓨터");

				} else {
					System.err.println("최종 결과 : 무승부");
					
				}break;

			} else if (p >= 0 && p <= 2) {
				if (p == 0 && c == 2 || p == 1 && c == 0 || p == 2 && c == 1) { // 플레이어 승리 (0, 2) (1, 0) (2, 1)

					System.err.println("플레이어 승리");
					pw++;

				} else if (p == 0 && c == 0 || p == 1 && c == 1 || p == 2 && c == 2) { // 비기는 경우

					System.err.println("무승부");
				} else {
					System.err.println("컴퓨터 승리");
					cw++;
				}

				match++;
			} else {
				System.out.println("알 수 없는 번호 입니다.");
			}

		}

	}
}
