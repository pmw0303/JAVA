package Day08;

import java.util.Scanner;

public class Day08_5 {
	//����� ��ũ ���α׷�[2�ΰ���]
	//ȸ�� �ֿ���: 1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣã��
	//���� �ֿ���: 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. ���¸��
		//ȸ���� ���� ���� ���
	//������(�����) ���� ��ǰ�� ����ؼ� ȸ������ �����ؼ� ���� ���
	//����: ����, ����, ȸ��
	//������. ��ǰ�̸� - �����ϸ� �ڱ� ���� �����ؼ� ������.
	// ���� ����� �����ߴ�����.
	static Scanner scan = new Scanner(System.in);
	static Member[] members = new Member[100];
	static Account[] account = new Account[100];
	static Loan[] loan = new Loan[100];
	
	public static void main(String[] args) {
		Day08_5 application = new Day08_5();
		application.menu();
	}


	void menu() {
		while (true) {// ����� ��ũ ����
		System.out.println("-----����� ��ũ------"); // ����� ��ũ ����
		System.out.println("1. ȸ������ 2. �α��� 3. ���̵�ã�� 4. ��й�ȣ ã��");
		System.out.print(">>>>: "); int ch1 = scan.nextInt();
		Member member = new Member();
		if(ch1 == 1) {member.signIn();}
		else if(ch1 == 2) {
			String result = member.logIn();
			if( result == null ) { // �α��ν��� 
				System.err.println(" �˸�]] ������ ȸ�������� �����ϴ�.");
			}else if( result.equals("admin")) { // ������
				// 2. ������ �޴� �޼ҵ� ȣ�� 
				System.out.println(" �˸�]] �ȳ��ϼ���~ "+result+"��");
				accadmin(); // ���� �޼ҵ� ȣ��
			}else{ // �Ϲ� 
				// 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
				System.out.println(" �˸�]] �ȳ��ϼ���~ "+result+"��");
				acc(result);
			}
		}
		
		else if(ch1 == 3) {member.findId();}
		else if(ch1 == 4) {member.findPw();}
		else {System.err.println("����)) �˼����� ��ȣ�Դϴ�.");}
		}
	}
	void accadmin() {
		while(true) {
			System.out.println(" --------------- ���� �޴� ------------------");
			System.out.println("1. ���� ��ǰ ��� 2. ������ ��� 3. �α׾ƿ�");
			System.out.print(">>>>>>: "); int ch = scan.nextInt();
			Loan loan = new Loan(); 
			
			if(ch == 1) {
				System.out.println("���� ��ǰ ���-------------");
				System.out.println("��ǰ �̸� : "); String loanName = scan.next();
				System.out.println("�ݾ� : "); int loanAmount = scan.nextInt();
				System.out.println("���� : "); double loanInterest = scan.nextDouble();
				
				boolean loanNcheck = true;
				for(Loan temp : Day08_5.loan) {
					if(temp != null && temp.loanName.equals(loanName)) {
						System.out.println("�˸�>> �̹� �ִ� ���� ��ǰ�Դϴ�");
						loanNcheck = false;
						break;
					}
				}
				Loan loan123 = new Loan(loanName, loanAmount, loanInterest);
				if(loanNcheck) {
					int i = 0 ; // �ݺ�Ƚ�� [ �ε���üũ ]
					for( Loan temp : Day08_5.loan ) {
						if( temp == null ) { // ������̸� 
							Day08_5.loan[i] = loan123; // �� �ε����� ���ο� ȸ�� ����
							 // ȸ������ �޼ҵ� ���� ~~~~~~~ [ ��ȯ : true ]
							break;
						}
						i++; // i���� 
					}
				}
			}else if(ch==2) {
				for(Loan temp : Day08_5.loan) {
					if(temp != null &&  temp.loanPerson != null) {
						System.out.printf("%s\t%s\n",temp.loanName,temp.loanPerson);
					}
				}
				
			}else if(ch==3) {
				return;
			}else System.out.println("�߸��� ��ȣ�Դϴ�");
			
		}
		
	}
	void acc(String id) {//���� �� ����
			while(true) {
				System.out.println(" --------------- ȸ�� �޴� ------------------");
				System.out.println("1. ���»��� 2. �Ա� 3. ��� 4. ��ü 5. ���� 6. ���¸�� 7.�α׾ƿ�");
				System.out.print(">>>>>>: "); int ch = scan.nextInt();
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
				else if( ch == 5 ) 	{loan(id);}		//����
				else if( ch == 6 ) 	{account.listAcc(id);}		//���� ���
				else if( ch == 7 ) 	{ return; } // �Ϲ�ȸ���޴� �޼ҵ� ���� [ �α׾ƿ� ] 
				else { System.err.println(" �˸�]] �˼� ���� ��ȣ�Դϴ�. "); }
			}	
		
	}
	
	void loan(String id) {
		while(true) {
			System.out.println(" --------------- ���� �޴� ------------------");
			System.out.println("1.��ǰ ��� 2.���� 3.��ȯ�� ��ȸ 4.��ȯ 5.���");
			System.out.print(">>>>>>>: "); int ch = scan.nextInt();
			Loan loan = new Loan();
			if(ch == 1) {loan.loanList(id);}
			else if(ch == 2) {loan.loanLoan(id);}
			else if(ch == 3) {loan.loanRepay(id);}
			else if(ch == 4) {loan.loanReB(id);}
			else if(ch == 5){return;}
			else {System.err.println("����)) �˼����� ��ȣ�Դϴ�");}
			
		}
		
	}
	
}