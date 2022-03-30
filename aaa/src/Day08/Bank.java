package Day08;

import java.util.Scanner;

public class Bank {
	static Scanner sc = new Scanner(System.in);
	static Member[] member = new Member[100]; // ��� Ŭ�������� ���Ǵ� �迭
	static Account[] account = new Account[100];
	static Loan[] loan = new Loan[100];

	public static void main(String[] args) {

		Bank menu = new Bank();
		menu.menu();

	}

	void menu() {

		while (true) {
			System.out.println("---------------- ����� ��ũ --------------------");
			System.out.println("1. ȸ������ | 2. �α��� | 3. ���̵�ã�� | 4. ��й�ȣã��");
			Member member = new Member();

			int ch = sc.nextInt();
			if (ch == 1) { // ȸ������
				boolean result = member.signIn(); // ȸ������ �޼ҵ� ȣ��
				if (result) {
					System.err.println("�˸�>> ȸ������ ����");
				} else {
					System.err.println("�˸�>> ȸ������ ����");
				}

			} else if (ch == 2) {

				// �α���
				String result = member.logIn();
				if (result == null) {
					// 2. ������ �޴� �޼ҵ� ȣ��
					System.err.println("�˸�>> ȸ�������� �����ϴ�");

				} else if (result.equals("admin")) {
					System.err.println("�˸�>> ������ �޴��Դϴ�");

				} else {
					System.out.println("�˸�>> " + result + "�� �ȳ��ϼ���");
					acc(result);
				}

				// 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��

			} else if (ch == 3) { // ���̵�ã��
				member.findId();

			} else if (ch == 4) { // ��й�ȣã��
				member.findPw();

			} else {
				System.err.println("�˸�>> �� �� ���� ��ȣ�Դϴ�.");
			}
		}
	}
	
	void acc(String id) {//���� �� ����
		while(true) {
			System.out.println(" --------------- ȸ�� �޴� ------------------");
			System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. ���¸�� 7.�α׾ƿ�");
			System.out.print(">>>>>>: "); int ch = sc.nextInt();
			Account account = new Account(); // ������ڷ� ��ü => �޼ҵ� ȣ���
			if( ch == 1 ) 		{
				boolean result = account.createAcc(id);
				if( result ) 
					System.err.println(" �˸�]] ���»��� ���� ");
				else 
					System.err.println(" �˸�]] ���»��� ����");
				
			} 	//���� ����
			else if( ch ==2 ) 	{account.depositAcc(id);}		//�Ա�
			else if( ch == 3 ) 	{account.withdrawAcc(id);}	//���
			else if( ch == 4 ) 	{account.transferAcc(id);}	//��ü
			else if( ch == 5 ) 	{account.loanAcc(id);}		//����
			else if( ch == 6 ) 	{account.listAcc(id);}		//���� ���
			else if( ch == 7 ) 	{ return; } // �Ϲ�ȸ���޴� �޼ҵ� ���� [ �α׾ƿ� ] 
			else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�. "); }
		}	
	
} 

}
