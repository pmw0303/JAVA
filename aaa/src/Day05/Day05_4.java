package Day05; //��Ű���� [ �ҽ����ϵ��� ���� ]

import java.util.Scanner;

public class Day05_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[][] member = new String[100][2];
		String[][] book = new String[100][3];

		book[0][0] = "�ڹ�å";
		book[0][1] = "�뿩��X";
		book[0][2] = "aa";

		book[1][0] = "�ڹ�å1";
		book[1][1] = "";
		book[1][2] = "aa";

		member[0][0] = "admin";
		member[0][1] = "0000";

		while (true) { // �� ó�� while

			System.out.println("�����뿩 ���α׷�");
			System.out.println("1. ȸ������ | 2. �α��� ");
			System.out.println("����> ");
			int ch = scanner.nextInt();

			if (ch == 1) { // if ȸ������

				System.out.println("----------ȸ������-----------");
				System.out.println("ID �Է� : ");
				String id = scanner.next();
				System.out.println("PW �Է� : ");
				String pw = scanner.next();

				boolean idcheck = true;
				for (int i = 0; i < member.length; i++) {
					if (member[i][0] != null && member[i][0].equals(id)) {
						// ==null : ȸ��X . !=null : ȸ��O.
						System.err.println(" �˸�]] ������ ���̵� �����մϴ�.");
						idcheck = false; // ȸ������ �Ұ����ϰ� idcheck ������ false ����
						break;
					}
				}

				// ����κ�
				if (idcheck) { // idcheck �� true �� ��쿡�� ȸ������ó��
					for (int i = 0; i < member.length; i++) {
						if (member[i][0] == null) { // i��° �� �� id�� ������ = �����
							member[i][0] = id;
							member[i][1] = pw;

							System.err.println(" �˸�]] ȸ�������� �Ǿ����ϴ�.");
							break; // ���������� �� [ 1���� ���� ]
						}
					}
				}

			} // if ȸ������ end
			else if (ch == 2) { // else if �α���
				System.out.println("---------�α���---------");
				System.out.print(" MEMBER ID : ");
				String id = scanner.next();
				System.out.print(" MEMBER PASSWORD : ");
				String pw = scanner.next();

				boolean logincheck = false; // �α��� ���� �ʱⰪ

				for (int i = 0; i < member.length; i++) { // for

					 if (member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) { // if �α���
																												// Ȯ��
																												// ����

						System.err.println("�˸�>> �α��� ����");
						logincheck = true;

						while (true) { // �α��� �� while

							System.out.println("1. �����˻� |2. ������� |3. �����뿩 |4. �����ݳ� |5. �α׾ƿ�");

							int ch1 = scanner.nextInt(); // ch1 - �α��� �� ��ȣ ����
							if (ch1 == 1) { // �����˻�

								System.out.println("�˻��� ���� �Է� : ");
								String search = scanner.next();

								for (int j = 0; j < book.length; j++) {

									if (book[j][0].equals(search)) {
										System.out.printf("%s %s\n", book[j][0], book[j][1]);

									} else {
										System.out.println("�������� �ʽ��ϴ�");
									}

								}

							} else if (ch1 == 2) { // �������

								for (int j = 0; j < book.length; j++) {

									if (book[j][0] != null) {
										System.out.printf("%s  ", book[j][0]);
									}
								}
								System.out.println();

							} else if (ch1 == 3) { // �����뿩

								System.out.println("�뿩�� ���� ���� : ");
								String name = scanner.next();
								for (int j = 0; j < book.length; j++) {
									if (name.equals(book[j][0])) {
										if (book[j][1].equals("�뿩��X")) {

											System.out.println("�뿩 �Ͻðڽ��ϱ�?");
											System.out.println("1. �� | 2. �ƴϿ�");
											int ch3 = scanner.nextInt();

											if (ch3 == 1) {
												book[j][1] = "�뿩��(" + id + ")";
												break;
											}

										} else {
											System.out.println("�뿩���Դϴ�");
										}

									}
								}

							} else if (ch1 == 4) { // �����ݳ�

								System.out.println("�ݳ��� ���� ���� : ");
								String name1 = scanner.next();

								for (int j = 0; j < book.length; j++) {
									if (name1.equals(book[j][0])) {
										if (book[j][1].equals("�뿩��(" + id + ")")) {
											System.out.println("�ݳ��Ͻðڽ��ϱ�?");
											System.out.println("1. �ݳ� | 2. �ݳ�X");
											int ch_4 = scanner.nextInt();

											if (ch_4 == 1) {

												book[j][1] = "�뿩��X";
												break;
											} else {
												break;
											}

										}

									} else {
										System.out.println("����� �뿩�� ������ �ƴմϴ�");
										break;
									}
								}

							} else if (ch1 == 5) { // �α׾ƿ�

								break;

							} else { // �ٸ� ��ȣ �Է�
								System.err.println("�˸�>> �˼� ���� ��ȣ�Դϴ�");
							}

						} // �α��� �� while end

					} // if �α��� Ȯ�� ���� end

				} // for end

				if (logincheck == false)
					System.err.println(" �˸�]] ȸ�������� ���ų� �ٸ��ϴ�.");

			} // ch==2 if �α��� end
			else {
				System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�.!!");
			} // �� ó�� while end

		}
	}
}





//if (member[0][0].equals("admin") && member[0][1].equals("0000")) {
//
//	System.out.println("������ ���");
//	System.out.println("1. ������� | 2. ������� | 3. �������� | 4. �α׾ƿ�");
//	System.out.println("����>> ");
//
//	int ch_2_1 = scanner.nextInt();
//
//	if (ch_2_1 == 1) { // �������
//
//		System.out.println("������ ��� �Ͻðڽ��ϱ�?");
//		System.out.println("1. ��� | 2. ���X ");
//		int ch2_1_1 = scanner.nextInt();
//		if (ch2_1_1 == 1) {
//
//			for (int j = 0; j < book.length; j++) {
//
//				System.out.println("����� å �̸� : ");
//				String e_book = scanner.next();
//
//				if (e_book.equals(book[j][0])) {
//
//					System.err.println("�̹� ��ϵǾ� �ֽ��ϴ�");
//					break;
//				} else {
//
//					if (e_book != book[j][0]) {
//
//						book[j][0] = e_book;
//						System.out.println("��ϵǾ����ϴ�");
//						break;
//					}
//
//				}
//			}
//		}
//
//	} else if (ch_2_1 == 2) { // �������
//
//		for (int j = 0; j < book.length; j++) {
//
//			if (book[j][0] != null) {
//				System.out.printf("%s  ", book[j][0]);
//			}
//		}
//		System.out.println();
//
//	} else if (ch_2_1 == 3) { // ��������
//
//		System.out.println("������ �����Ͻðڽ��ϱ�?");
//		System.out.println("1. ���� | 2. ����X ");
//		int ch_2_1_1 = scanner.nextInt();
//
//		if (ch_2_1_1 == 1) {
//
//			for (int j = 0; j < book.length; j++) {
//
//				System.out.println("������ å �̸� : ");
//				String d_book = scanner.next();
//
//				if (d_book.equals(book[j][0])) {
//
//					book[j][0] = null;
//					System.err.println("�����Ǿ����ϴ�");
//					break;
//				}
//				System.err.println("å�� �������� �ʽ��ϴ�");
//			}
//		}
//
//	} else if (ch_2_1 == 4) { // �α׾ƿ�
//		break;
//	}
//} else
