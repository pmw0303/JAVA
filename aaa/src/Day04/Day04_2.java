package Day04;

import java.util.Scanner;

public class Day04_2 {

	public static void main(String[] args) {

		// ���Ǳ� ���α׷�
//			1. �޴��� [1. �ݶ�(300) 2. ȯŸ(200) 3. ���̴�(100) 4. ����(��ٱ���)]
//					�޴��ǿ��� ��ǰ �����ϸ� ��ٱ��Ͽ� �ֱ�
//					[����] : ��� �����ϸ� �˸�(������)
//			2. �ʱ� ��� [��ǰ 10�� ��]
//			3. ������ �ݾ� �Է¹޾� �����׸�ŭ ���� �� �ܵ� ���
//					[����] : ������ �ݾ׺��� �������� �����ϸ� ���� ���(�ݾ׺���)

		Scanner scanner = new Scanner(System.in);
		// ��� ��
		int cols = 10;
		int hwas = 10;
		int cids = 10;
		// ���� ��
		int colb = 0;
		int hwab = 0;
		int cidb = 0;
		// ����
		int col = 300;
		int hwa = 200;
		int cid = 100;
		// �� �ݾ�
		int balance = 0;

		while (true) {
			System.out.println("---------------------------");
			System.out.println("1. �ݶ�|2. ȯŸ|3. ���̴�|4. ����");
			System.out.println(" 300��   200��   100��");
			System.out.println("---------------------------");
			System.out.print("���� : \n");
			int ch = scanner.nextInt();

			if (ch == 1) { // �ݶ� ����
				if (cols == 0) {
					System.out.println("�˸�)) �� ��");
				} else {
					System.out.println("[ �ݶ� ��ҽ��ϴ�. ]");
					colb++;
					cols--;
				}
			} else if (ch == 2) { // ȯŸ ����
				if (hwa == 0) {
					System.out.println("�˸�)) �� ��");
				} else {
					System.out.println("[ ȯŸ�� ��ҽ��ϴ�. ]");
					hwab++;
					hwas--;
				}

			} else if (ch == 3) { // ���̴� ����
				if (cids == 0) {
					System.out.println("�˸�)) �� ��");
				} else {
					System.out.println("[ ���̴ٸ� ��ҽ��ϴ�. ]");
					cidb++;
					cids--;
				}

			} else if (ch == 4) {
				balance = (colb * 300) + (hwab * 200) + (cidb * 100);
				System.out.println("----------���� ǰ��----------");
				System.out.println("��ǰ��\t����\t�ݾ�");
				if (colb != 0)
					System.out.println("�ݶ� :\t" + colb + "\t" + (colb * 300));
				if (hwab != 0)
					System.out.println("ȯŸ :\t" + hwab + "\t" + (hwab * 200));
				if (cidb != 0)
					System.out.println("���̴� :\t" + cidb + "\t" + (cidb * 100));
				System.out.println("��ǰ �� ����� : " + balance);
				System.out.println("--------------------------");
				System.out.println("1. ���� 2. ���");
				int ch2 = scanner.nextInt();

				if (ch2 == 1) {
//					�ݾ� �Է¹ޱ�
//					�ݾ��� �����׺��� ������ ���� �Ұ� -> ���Է�
//					�ݾ��� �����׺��� ũ�� ���� -> �ܵ� ���

					while (true) {
						System.err.println("�˸�)) �ݾ� : ");
						int money = scanner.nextInt();
						if (money < balance) {
							System.err.println("�˸�)) ���� �ݾ� ����");
							
						}else {
							System.err.println("�˸�)) ���� �Ϸ�");
							System.err.println("�˸�)) ���� �ݾ� : " + (money-balance));
							break;
						}
					}

				} else if (ch2 == 2) {
					System.out.println("�˸�)) ���Ÿ�� ��� �����");
					cols += colb;
					hwas += hwab;
					cids += cidb;
					colb = 0;
					hwab = 0;
					cidb = 0;

				} else {
					System.out.println("����");
				}

			} else {
				System.out.println("����");
			}

		}

	}
}
