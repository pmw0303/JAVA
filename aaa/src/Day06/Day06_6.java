package Day06;

import java.util.Scanner;

public class Day06_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Board[] boardlist = new Board[100]; // board ��ü 100�� ����

		while (true) { // ���α׷� ���� while [ �������� X ]

			System.out.println("------------Ŀ�´�Ƽ--------------");
			//////////////////// ��� �Խù� ��ȸ
			System.out.println("��ȣ\t�ۼ���\t����");
			// �迭 �� ��� ��ü(�Խù�) ��� �ݺ���
			int index = 0;
			// �ε��� ���� [ �迭 �� ��ü �� üũ ]
			for (Board board : boardlist) {
				if (board != null) {
					System.out.printf("%d\t%s\t%s\n", index, board.writer, board.title);

				}
				index++;
			}
			//////////////////// ��� �Խù� ��ȸ

			System.out.println("1.�۾��� | 2. �ۺ���");

			int ch = sc.nextInt();
			if (ch == 1) { // �۾���
				// 1. 4�� ������ �Է¹޴´�
				System.out.println("----------�۾��� ������------------");
				System.out.print("���� : ");
				String title = sc.next();
				System.out.print("���� : ");
				String content = sc.next();
				System.out.print("�۾��� : ");
				String writer = sc.next();
				System.out.print("��й�ȣ : ");
				String password = sc.next();
				// 2. 4�� ������ ��üȭ
				Board board = new Board(title, content, writer, password);

				// 3. �迭 �� �� ������ ã�Ƽ� ��ü ����
				int i = 0;
				for (Board temp : boardlist) {
					if (temp == null) {
						boardlist[i] = board;
						break;
					}
					i++;
				}
			} else if (ch == 2) { // �ۺ���

				System.out.println(" �Խù� ��ȣ ���� : ");
				int bno = sc.nextInt();

				// �ݺ��� �ʿ� X -> �������ġ[ �ε��� ] �Է� �޾Ƽ� -> �ε��� ��ġ�� ��ü �ҷ�����
				System.out.printf("�ۼ��� : %s ���� : %s ", boardlist[bno].writer, boardlist[bno].title);
				System.out.printf("���� : %s", boardlist[bno].content);
				System.out.println();
				System.out.println("------------------------------------------");
				System.out.println("1. ��Ϻ���(�ڷΰ���) | 2. �ۻ��� | 3. �����ϱ�");

				int ch2 = sc.nextInt();
				if (ch2 == 1) {

				} else if (ch2 == 2) { // ----- �� �� ------ ����

					System.out.println("�˸�>> �� �Խù� ��й�ȣ : ");
					String pw = sc.next();

					if (boardlist[bno].password.equals(pw)) { // �Խù� ��ü �� ��й�ȣ = �Է��� ��й�ȣ

						System.out.println("�˸�>> ���� �Ϸ�");
						boardlist[bno] = null; // �ش� �Խù� null ���� / ����ó��

						// ���� �Ŀ� ������ �ε��� ��� ��ĭ�� ������ �̵�
						// ??? ���� �ش� �ڵ尡 ���� ��� �迭 �� ���̻��� ���� �߻�
						for (int i = bno; i < boardlist.length; i++) {

							if (i == boardlist.length - 1)
								boardlist[boardlist.length - 1] = null;
							else
								boardlist[i] = boardlist[i + 1];

						}

					} else {
						System.out.println("�˸�>> ���� ����");
					}

					// ----- �� �� ------ ��
				} else if (ch2 == 3) { // -------- �� �� ---------
					
					System.out.println("�˸�>> �� �Խù� ��й�ȣ : ");
					String password = sc.next();
					// 2. bno : ���Խù�(�����ִ� �Խù�)�� �ε��� ��ü ��й�ȣ�� �Է¹��� ��й�ȣ�� �����ϸ�
					if(boardlist[bno].password.equals(password)){
						// �ش� �Խù��� ����� ������ ���� �Է¹޾� ����
						System.out.println("������ ���� : "); boardlist[bno].title = sc.next();
						System.out.println("������ ���� : "); boardlist[bno].content = sc.next();
						
						System.out.println("�˸�>> ������ �����Ǿ����ϴ� ");
						
					}else {
						System.out.println("�˸�>> ��й�ȣ�� �ٸ��ϴ� [ ���� ���� ] ");
					}
					
										// -------- �� �� ---------��
				} else {

				}

			} else {
				System.err.println("�˸�>> �� �� ���� ��ȣ�Դϴ�");
			}

		} // ���α׷� ���� while end

	}
}


//for(int i=0;i<rank.length;i++) {
//	rank[i]=1;
//}
//for(int i=0;i>rank.length;i++) {
//	for(int j=0;j>rank.length;j++) {
//		if(sum[i] < sum[j]) {
//			rank[i] = rank[i]+1;
//		}
//	}
//}



