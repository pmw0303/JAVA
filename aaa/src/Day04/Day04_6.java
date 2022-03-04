package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String win = "";

		String[] board = { "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]" };
//		 게임 실행
//		 	1. 9칸 모두 알이 있을 때 2. 	

//			3목 되었을 때		
//			가로
//			012 345 678
//			세로
//			036 147 258
//			대각선
//			048 246

		// 게임판 출력-------------------------
		while (true) {

			for (int i = 0; i < board.length; i++) {

				System.out.print(board[i]); // 3배수
				if (i % 3 == 2)
					System.out.println();
			}
			// 플레이어가 놓을 위치(인덱스) 선택------------------------
			while (true) {
				System.out.print("위치 선택 : ");
				int put = scanner.nextInt();

				if (board[put].equals("[ ]")) { // 선택한 위치가 공백이면 알 두기
					board[put] = "[O]";
					break;
				} else {
					System.out.println("알림>> 해당 위치에 이미 알 존재. [재선택]");
				}
			} // ------------------------------------------------

			// 컴퓨터가 난수 값으로 놓을 위치(인덱스) 선택-------------------
			while (true) {

				Random random = new Random();
				int put = random.nextInt(9); // 0~8 사이의 난수 int형
				if (board[put].equals("[ ]")) { // 해당 난수 공백
					// 난수 위치에 공백이면 X알 두기
					board[put] = "[X]";
					break; // 알 두고 탈출
				}
			} // ------------------------------------------------

			// 승자 발생 --------------------------------------

			// 가로
//			if(board[0].equals(board[1]) && board[0].equals(board[1])) {
//				
//			}
//			if(board[3].equals(board[4]) && board[4].equals(board[5])) {
//				
//			}
//			if(board[6].equals(board[7]) && board[7].equals(board[8])) {
//				
//			}

			for (int i = 0; i <= 6; i += 3) {
				// i는 0부터 6까지 3씩 증가 0, 3, 6
				if (board[i].equals(board[i + 1]) && board[i + 1].equals(board[i + 2])) {
					win = board[i]; // 승리한 알 변수에 대입

				}
			}

			// 세로 i는 0부터 2까지 1씩증가 -> 0 1 2
			for (int i = 0; i <= 2; i += 1) {
				if (board[i].equals(board[i + 3]) && board[i + 3].equals(board[i + 6])) {
					win = board[i];

				}
			}

			// 대각선 048 246
			for (int i = 0; i <= 2; i += 2) {
				if (board[0].equals(board[4]) && board[4].equals(board[8])) {
					win = board[i];
				}
				if (board[2].equals(board[4]) && board[4].equals(board[6])) {
					win = board[i];
				}
			}

			// 게임 종료 ---------------------------------

			if (win.equals("[O]")) {
				System.err.println("플레이어 승리");
				break;
			}
			if (win.equals("[X]")) {
				System.err.println("컴퓨터 승리");
				break;
			}

		} // 게임판 출력 while

		for (int i = 0; i < board.length; i++) {

			System.out.print(board[i]); // 3배수
			if (i % 3 == 2)
				System.out.println();

		}
	}
}