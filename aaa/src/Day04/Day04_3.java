package Day04;

import java.util.Random;
import java.util.Scanner;

public class Day04_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int p; // ����� �� ������ ��ȣ
		int c; // ��ǻ�Ͱ� ������ ����
		int match = 0; // �� ���� ��
		int pw = 0;
		int cw = 0; // ���� �¸� ��

		// ���α׷� ���� / ���� ���� : 3�� �Է� ��
		while (true) {

			System.out.println("------���������� ����-------");
			System.out.println("����(0) ����(1) ��(2) ����(3) ���� : ");
			p = scanner.nextInt();

			Random random = new Random(); // ���� ��ü ����
			// c = random.nextInt(3); // ���� ������ ����
			// c = random.nextInt(��); // �� �������� ���� ������ ����
			// c = random.nextInt(10); // 0 ~ 9
			// c = random.nextInt(11) + 10; // 10 ~ 20

			c = random.nextInt(3); // ���� ������ ����
			System.out.println(" ��ǻ�Ͱ� �� �� : " + c);

			if (p == 3) { // ���� ����

				System.out.println("���� ����");
				System.out.println("�� ���� Ƚ�� : " + match);
				System.out.println("�÷��̾� �¸� �� : " + pw);
				System.out.println("��ǻ�� �¸� �� : " + cw);
				if (pw > cw) {

					System.err.println("���� �¸��� : �÷��̾�");
				} else if (cw > pw) {

					System.err.println("���� �¸��� : ��ǻ��");

				} else {
					System.err.println("���� ��� : ���º�");
					
				}break;

			} else if (p >= 0 && p <= 2) {
				if (p == 0 && c == 2 || p == 1 && c == 0 || p == 2 && c == 1) { // �÷��̾� �¸� (0, 2) (1, 0) (2, 1)

					System.err.println("�÷��̾� �¸�");
					pw++;

				} else if (p == 0 && c == 0 || p == 1 && c == 1 || p == 2 && c == 2) { // ���� ���

					System.err.println("���º�");
				} else {
					System.err.println("��ǻ�� �¸�");
					cw++;
				}

				match++;
			} else {
				System.out.println("�� �� ���� ��ȣ �Դϴ�.");
			}

		}

	}
}
