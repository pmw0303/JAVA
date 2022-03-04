package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String win = "";

		String[] board = { "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]" };
//		 ���� ����
//		 	1. 9ĭ ��� ���� ���� �� 2. 	

//			3�� �Ǿ��� ��		
//			����
//			012 345 678
//			����
//			036 147 258
//			�밢��
//			048 246

		// ������ ���-------------------------
		while (true) {

			for (int i = 0; i < board.length; i++) {

				System.out.print(board[i]); // 3���
				if (i % 3 == 2)
					System.out.println();
			}
			// �÷��̾ ���� ��ġ(�ε���) ����------------------------
			while (true) {
				System.out.print("��ġ ���� : ");
				int put = scanner.nextInt();

				if (board[put].equals("[ ]")) { // ������ ��ġ�� �����̸� �� �α�
					board[put] = "[O]";
					break;
				} else {
					System.out.println("�˸�>> �ش� ��ġ�� �̹� �� ����. [�缱��]");
				}
			} // ------------------------------------------------

			// ��ǻ�Ͱ� ���� ������ ���� ��ġ(�ε���) ����-------------------
			while (true) {

				Random random = new Random();
				int put = random.nextInt(9); // 0~8 ������ ���� int��
				if (board[put].equals("[ ]")) { // �ش� ���� ����
					// ���� ��ġ�� �����̸� X�� �α�
					board[put] = "[X]";
					break; // �� �ΰ� Ż��
				}
			} // ------------------------------------------------

			// ���� �߻� --------------------------------------

			// ����
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
				// i�� 0���� 6���� 3�� ���� 0, 3, 6
				if (board[i].equals(board[i + 1]) && board[i + 1].equals(board[i + 2])) {
					win = board[i]; // �¸��� �� ������ ����

				}
			}

			// ���� i�� 0���� 2���� 1������ -> 0 1 2
			for (int i = 0; i <= 2; i += 1) {
				if (board[i].equals(board[i + 3]) && board[i + 3].equals(board[i + 6])) {
					win = board[i];

				}
			}

			// �밢�� 048 246
			for (int i = 0; i <= 2; i += 2) {
				if (board[0].equals(board[4]) && board[4].equals(board[8])) {
					win = board[i];
				}
				if (board[2].equals(board[4]) && board[4].equals(board[6])) {
					win = board[i];
				}
			}

			// ���� ���� ---------------------------------

			if (win.equals("[O]")) {
				System.err.println("�÷��̾� �¸�");
				break;
			}
			if (win.equals("[X]")) {
				System.err.println("��ǻ�� �¸�");
				break;
			}

		} // ������ ��� while

		for (int i = 0; i < board.length; i++) {

			System.out.print(board[i]); // 3���
			if (i % 3 == 2)
				System.out.println();

		}
	}
}