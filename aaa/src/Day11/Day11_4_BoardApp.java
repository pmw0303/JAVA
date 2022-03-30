package Day11;

import java.util.Scanner;

import Day08.C;

public class Day11_4_BoardApp {

//	��ȸ�� �Խ���/��� ���α׷� [����ó��, ����ó��, ����Ʈ]
//		m - �Խù� Ŭ����
	// ����, ����, ��й�ȣ, �ۼ���, �ۼ���, ��ȸ��, ��۸���Ʈ
//		m - ��� Ŭ����
	// ����, ��й�ȣ, �ۼ���, �ۼ���
//		c - ��Ʈ�ѷ� Ŭ����
	// 1. ��� 2. ���� 3. ���� 4. ���� 5. ���� 6. ��۾���
	// 7. �Խù����� 8. �Խù��ҷ����� 9. ������� 10. ��ۺҷ�����
//		v - Day11_4_BoardApp
	// ��Ʈ�ѷ� �޼ҵ� ȣ��

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller.load(); // ���� [��� �Խù�] �ҷ�����
		
		while (true) {
			try { // ���� �߻� : ����� ���� �Է� �� ���ܹ߻� -> catch �̵�
				
				// ��� �Խù� ��� 
				System.out.printf("%s\t%s\t%s\t%s\t%s\t \n", 
						"��ȣ", "����", "�ۼ���", "�ۼ���", "��ȸ��" );
				int i=0;
				for(Board board : Controller.boadlist) {
					System.out.printf("%d\t%s\t%s\t%s\t%s\t \n", 
							i, board.getTitle(), board.getWriter(), board.getDate(), board.getViewcount() );
					i++;
				}
				
				System.out.println("1.���� 2.���� ����");
				int ch = sc.nextInt();
				if (ch == 1) {
					System.out.println(" *** �Խù� ��� ***"); 
						// nextLine() : ���� ���� ���� but �տ� next�� ������ �ϳ����
						// �ذ� : �Ϲ� next �� nextLine ���̿� nextLine()
					sc.nextLine();
					System.out.println(" ���� : "); 
					String ���� = sc.nextLine();
					System.out.println(" ���� : ");
					String ���� = sc.nextLine();
					System.out.println(" �ۼ��� : ");
					String �ۼ��� = sc.next();
					System.out.println(" ��й�ȣ[����/������] : ");
					String ��й�ȣ = sc.next();
					Controller.write(���� , ���� , �ۼ��� , ��й�ȣ);

				} else if (ch == 2) {
					// �ش� �Խù� ��ȣ[�ε���] �� �Է¹޾� �Խù����� ��� ���
					System.out.println("�Խù� ��ȣ : ");
					int index = sc.nextInt();
					Board temp = Controller.boadlist.get(index); // �ش� �ε��� ��ü�� �ӽ� ��ü
					System.out.println("*** �Խù� ���� ***");
					System.out.println("���� : " + temp.getTitle());
					System.out.println("�ۼ��� : " + temp.getWriter());
					System.out.println("���� : " + temp.getContent());					
					
					// �޴�
					System.out.println("1.�ڷΰ��� 2.���� 3.���� 4.��۾��� ����");
					int ch2 = sc.nextInt();
					if(ch2==1) {			
					}else if(ch2==2) {
						System.out.println("�Խù� ��й�ȣ : "); String pw = sc.next();
						sc.nextLine();
						System.out.println("���� ���� : "); String title = sc.nextLine();
						System.out.println("���� ���� : "); String content = sc.nextLine();		
						Controller.update(index, pw, title, content);
						boolean result = Controller.update(index, pw, title, content);
						if(result) {
							System.out.println("�˸�>> ���� ����");
						}else System.out.println("�˸�>> ���� ����");
						
					}else if(ch2==3) {
						System.out.println("��й�ȣ �Է� : ");
						String pw = sc.next();
						boolean result = Controller.delete(index, pw);
						if(result) {
							System.out.println("��������");
						}else System.out.println("��������");
						Controller.delete(index, pw); // ������ �ε�����ȣ, �н����� -> �μ�					
					}else if(ch2==4) {
						Controller.replywrite(); // �ε�����ȣ, ��۳���, ��ۺ�й�ȣ, ����ۼ��� -> �μ�
					}else { }
					
					
					

				} else {
					
				}
			} catch (Exception e) {
				System.err.println("�˸�>> �ٽ� �Է��ϼ���");
				sc = new Scanner(System.in); // �ٽ� �޸� �Ҵ�
			}
		}
	}

}
