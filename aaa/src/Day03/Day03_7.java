package Day03;

import java.util.Scanner;

public class Day03_7 {

	public static void main(String[] args) {

		boolean run = true;

		int balance = 0;

		Scanner scanner = new Scanner(System.in);

		while (run) { // while(true) ���ѷ���
			System.out.println("------------------------------");
			System.out.println("1. ���� |2. ��� |3. �ܰ� |4. ���� ");
			System.out.println("------------------------------");
			System.out.print("���� > ");

			int num = scanner.nextInt();

			if (num == 1) {
				System.out.print("���ݾ� : ");
				int ye = scanner.nextInt();
				balance += ye;

			} else if (num == 2) {
				System.out.print("��ݾ� : ");
				int chu = scanner.nextInt();
				balance -= chu;
				if (balance < chu) {
					System.out.println("��� �Ұ�");
					
				} else {
					balance -= chu;
				}
				
			} else if (num == 3) {
				System.out.println("�ܰ� : " + balance);
			} else if (num == 4) {
				break; // ���� ����

			} else {
				System.out.println("�����Դϴ�. ");
			}

		}

		System.out.println("���α׷� ����");
	}
}
