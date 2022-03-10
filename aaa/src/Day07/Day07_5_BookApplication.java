package Day07;

import java.util.Scanner;

public class Day07_5_BookApplication {
	
	// BookApplication Ŭ���� : ����� �����ڵ�
		// Book Ŭ���� : ���� ���� �ڵ� 
		// Member Ŭ���� : ȸ�� ���� �ڵ� 
		
		// * ���� �뿩 console ���α׷�[ Ŭ�������� ]
			// 1. Ŭ���� ���� 
				// 1. book
					// �ʵ� : ISBN(������ȣ) , ������ , �۰� , �����뿩���� , �뿩ȸ��
					// �޼ҵ� : 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.������� 6.��������
				// 2. member
					// �ʵ� : ��ȣ,���̵�,��й�ȣ,�̸�,����ó
					// �޼ҵ� : 1.ȸ������ 2.�α��� 3.���̵�ã�� 4.��й�ȣã��
			// 2. ȭ�� ���� 
				// 1. �ʱ� �޴� [ 1.ȸ������ , 2.�α��� , 3.���̵�ã�� , 4.��й�ȣã��  ]
				// 2. �Ϲ�ȸ���޴� [ 1.�����˻� 2.������� 3.�����뿩 4.�����ݳ� 5.�α׾ƿ� ]
				// 3. �����ڸ޴�  [ 1.������� 2.������� 3.�������� 4.����(����) 5.�α׾ƿ�
	
	// ** main �ۿ� ������ �����ϴ� ���� : ��� �޼ҵ忡�� ����ϱ� ����
		// �������� : { ���� ���� } ��ȣ ������ ������ { } ���� ������
			// ���� �ٸ� { } ������ ���� -> ��������
		// static : ���α׷� ���۽� �޸� �Ҵ� / ���α׷� ���� �� �޸� �ʱ�ȭ
			// ���α׷� ���������� ��� ���� ���Ǵ� �޸� [����]
		
	static Scanner sc = new Scanner(System.in);
	static Member[] member = new Member[1000]; // ��� Ŭ�������� ���Ǵ� �迭
	static Book[] books = new Book[1000];

	
	public static void main(String[] args) {
				// �޼ҵ� ȣ��
					// menu();
					// static : �޸� �켱 �Ҵ� �̱� ������ static �� �޼ҵ�, �ʵ� ������
					// main �޼ҵ� static �޼ҵ� �̱� ������ static �޼ҵ常 ����ȣ�� ����
		
		Day07_5_BookApplication application = new Day07_5_BookApplication();
		application.menu();
		
	}
	
	// 1. �ʱ� �޴� �޼ҵ�
	 void menu() {
		
		while(true) {
		System.out.println("---------------- ���� �뿩 ���α׷� --------------------");
		System.out.println("1. ȸ������ | 2. �α��� | 3. ���̵�ã�� | 4. ��й�ȣã��");
		Member member = new Member(); 
		
		int ch = sc.nextInt();
			if(ch==1) { // ȸ������
				boolean result = member.ȸ������(); // ȸ������ �޼ҵ� ȣ��
				if(result) {
					System.err.println("�˸�>> ȸ������ ����");
				}else {
					System.err.println("�˸�>> ȸ������ ����");
				}
				
			}else if(ch==2) { 
				
				// �α���
				String result = member.�α���();
				if(result == null) {
					// 2. ������ �޴� �޼ҵ� ȣ��
					System.err.println("�˸�>> ȸ�������� �����ϴ�");
				}else if(result.equals("admin")) {
					System.err.println("�˸�>> ������ �޴��Դϴ�");
					adminmenu();
				}else {
					System.out.println("�˸�>> " + result + "�� �ȳ��ϼ���");
					membermenu(result);
				}
				
					// 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
					
				
			
				
			}else if(ch==3) { // ���̵�ã��
				member.���̵�ã��();
				
			}else if(ch==4) { // ��й�ȣã��
				member.��й�ȣã��();
				
			}else {
				System.err.println("�˸�>> �� �� ���� ��ȣ�Դϴ�.");
			}
		}
	}
	// 2. �Ϲ�ȸ�� �޴� �޼ҵ�
	void membermenu(String loginid) {
		 System.out.println("-------------ȸ�� �޴�-----------------");
		 System.out.println("1. �����˻� 2. ������� 3. �����뿩 4. �����ݳ� 5. �α׾ƿ�");
		 System.out.print("��ȣ ���� : "); 
		 
		 Book book = new Book();

			while (true) {
				int ch = sc.nextInt();
				if (ch == 1) {
					book.�����˻�();
				} else if (ch == 2) {
					book.�������();
				} else if (ch == 3) {
					book.�����뿩(loginid);
				} else if (ch == 4) {
					book.�����ݳ�(loginid);
				} else if (ch == 5) {
					return;
				}
			}
		}
	// 3. ������ �޴� �޼ҵ�
	void adminmenu() {
		System.out.println("-------------������ �޴�-----------------");
		System.out.println("1. ������� 2. ������� 3. �������� 4. �α׾ƿ�");
		 System.out.print("��ȣ ���� : "); 
		 
		 Book book = new Book();

			while (true) {
				int ch = sc.nextInt();
				if (ch == 1) {
					book.�������();
				} else if (ch == 2) {
					book.�������();
				} else if (ch == 3) {
					book.��������();
				} else if (ch == 4) {
					return;
				}

			}
		}
}
