package Day05;

import java.util.Scanner;

public class Day05_2 {

//	ȸ���� �湮�� ���α׷� (2���� �迭)
//		1. �ʱ�޴� [1. ȸ������ 2.�α���]
//					1. ȸ������ - ���̵�, ��й�ȣ, �̸�
//					2. �α��� - ���̵�, ��й�ȣ ���� -> �α���
//		2. �α��� �޴� [1. �湮�� 2. �α׾ƿ�]
//					1. �湮�� - ����, ����, �ۼ���(���̵�)
//					2. �α׾ƿ� - �ʱ�޴��� ���ư���

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// ȸ�� 100��[id, password, name]

		String[][] member = new String[100][3]; // 100�� 3�� -> ȸ���� 1��
		// �湮�� 100��[ title, contents, writer ] �����ϴ� �迭

		String[][] boardlist = new String[100][3]; // ���ù��� 1��

		while (true) { // �������� X

			System.out.println("-------ȸ���� �湮��-------");
			System.out.println("-----------------------");
			System.out.println("1. ȸ������   //   2. �α���");
			int ch = scanner.nextInt();

			if (ch == 1) {
				System.out.println("------ȸ������ ������------");
				System.out.println("ID �Է� : ");
				String id = scanner.next();
				System.out.println("PASSWORD �Է� : ");
				String pw = scanner.next();
				System.out.println("NAME �Է� : ");
				String name = scanner.next();

//				3�� ������ �Է¹޾� member 2���� �迭 ����
//					1. �� ������ ã�Ƽ� ����[ ���� �� ������ ������ ȸ�� ]
//					2. ���̵� �ߺ�üũ

				boolean idcheck = true;
				for (int i = 0; i < member.length; i++) { // ID �ߺ�üũ
					if (member[i][0] != null && member[i][0].equals(id)) {
						System.err.println("ID�� �ߺ��Դϴ�");
						idcheck = false;
						break;

					}

				}

				if (idcheck) { // idcheck �� true �� ��쿡�� ȸ������
					for (int i = 0; i < member.length; i++) { // ����
						if (member[i][0] == null) {

							member[i][0] = id;
							member[i][1] = pw;
							member[i][2] = name;
							System.err.println("�˸�>> ȸ������ �Ϸ�");
							break;

						}
					}
				}

			} else if (ch == 2) {
				System.out.println("-------�α��� ������-------");
				System.out.println("ID �Է� : ");
				String id = scanner.next();
				System.out.println("PASSWORD �Է� : ");
				String pw = scanner.next();

				boolean logincheck = false;

				for (int i = 0; i < member.length; i++) {
					if (member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {

						System.err.println("�˸�>> �α��� ����");
					}
					logincheck = true;
//////////////////////////////////////////////////////////////
					while (true) {
						System.out.println("----------------------");
						System.out.println("---------�湮��---------");
						System.out.println("��ȣ\t�ۼ���\t����\t����");

						// ��� �湮 ���
						for (int j = 0; j < boardlist.length; j++) {
							if (boardlist[j][0] != null) {
								System.out.printf("%d\t%s\t%s\t%s \n", j, boardlist[j][2], boardlist[j][0],
										boardlist[j][1]);

							}

						}

						System.out.println("----------------------");
						System.out.println("--------�湮��----------");
						System.out.println("1. �湮�� ����   2. �α׾ƿ�");
						int ch2 = scanner.nextInt();

						if (ch2 == 1) {

							System.out.println("-------------�۾���----------");
							System.out.println("TITLE : ");
							String title = scanner.next(); // ����
							System.out.println("CONTENT : ");
							String content = scanner.next(); // ����
							// �迭�� ���� ã�Ƽ� ���� *****

							for (int j = 0; j < member.length; j++) {
								if (boardlist[j][0] == null) { // **** ���� ã�Ƽ� �ֱ� ****
									boardlist[j][0] = title;
									boardlist[j][1] = content;
									boardlist[j][2] = id; // �α��� �ÿ� ���� ID ����
									break;

								}
							}

						} else if (ch == 2) {
							System.err.println("�˸�>> �α׾ƿ�");
							break;
						} else {
							System.out.println("�˸�>> �˼����� ��ȣ�Դϴ�");
						}
					}
/////////////////////////////////////////////////////////////////////
				} // for
				if (logincheck == false)
					System.err.println("�˸�>> ȸ�������� ���ų� �ٸ��ϴ� ");

			} else {
				System.err.println("�˸�>> �߸��� ��ȣ�Դϴ� ");
			}

		} // while1

	}
}
