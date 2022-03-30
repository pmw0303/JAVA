package Day08;

import Day07.Member;

public class Account {
	//1.�ʵ�
	String accountNumber;
	int amount;
	String accountOwner;
	String loanName;
	//2. ������
	public Account() {}
	public Account(String accountNumber, int amount, String accountOwner) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.accountOwner = accountOwner;

	}
	public Account(String accountNumber, int amount, String accountOwner, String loanName) {
		this.accountNumber = accountNumber;
		this.amount = amount;
		this.accountOwner = accountOwner;
		this.loanName = loanName;
	}
	//3. �޼ҵ�
	boolean createAcc(String id) {
		
		System.out.println("----���� ����----");
		System.out.print("���� ��ȣ ����: "); String num = Day08_5.scan.next();
		
		for( Account temp : Day08_5.account ) {
			if( temp != null && temp.accountNumber.equals(num)) { // ���࿡ ������ �ƴϸ鼭 �迭�� id�� �Է¹��� id�� �����ϸ� 
				System.out.println(" �˸�]] ���� ������� ���¹�ȣ �Դϴ�. ");
				return false; // �Լ����� ---> ���̵� �ߺ��Ǿ��� ������ false[���Խ���]
			}
		}
		
		
		
		
		Account account = new Account(num, 0, id);
		int j = 0; // �ݺ�Ƚ�� [ �ε��� ]
		for( Account temp : Day08_5.account ) {
			if( temp == null ) { // null ã��
					Day08_5.account[j] = account;
					break; // ������ 
			}
			j++; // �ε��� ����
		}
		return true;
		}
	public void depositAcc(String id) { // �Ա� ����
		System.out.println("----�Ա�----");
		System.out.print("�Ա��� ���¹�ȣ: "); String accNum = Day08_5.scan.next();
		System.out.print("�Ա��� �ݾ� ����: "); int num = Day08_5.scan.nextInt();
		
		boolean depoCheck = false ;
		int j = 0;
		for(Account temp : Day08_5.account) {
			if (temp != null && temp.accountOwner.equals(id) && temp.accountNumber.equals(accNum)) {
				Day08_5.account[j].amount += num;
				depoCheck = true;
			}
			j++;
		}
		
		if(depoCheck) System.out.println("�Ա� ����");
		else System.out.println("�Ա� ����");
	}//�Ա� ��
	public void withdrawAcc(String id) {//��� ����

		System.out.println("----���----");
		System.out.print("����� ���¹�ȣ: "); String accNum = Day08_5.scan.next();
		System.out.print("����� �ݾ� ����: "); int num = Day08_5.scan.nextInt();
		int i = 0;
		for(Account temp : Day08_5.account) {
			
			if (temp != null && temp.accountOwner.equals(id) && temp.accountNumber.equals(accNum)) {
				if(num < temp.amount) {
					Day08_5.account[i].amount -= num;
					System.out.println(num + "�� ���, �����ݾ�: " + temp.amount);
				}else System.out.println("�ܾ� ����");
			}
			i++;
		}
	}//��� ��
	public void transferAcc(String id) { // ��ü ����
		System.out.println("----��ü----");
		System.out.print("��ü��(���) ���¹�ȣ: "); String accNum = Day08_5.scan.next();
		System.out.print("�����(����) ���¹�ȣ: "); String accNum2 = Day08_5.scan.next();
		System.out.print("����� �ݾ� ����: "); int num = Day08_5.scan.nextInt();
		int i = 0;
		for(Account temp : Day08_5.account) {
			
			
			if (temp != null && temp.accountOwner.equals(id) && temp.accountNumber.equals(accNum2)) {
				if(num < temp.amount) {
					System.out.println("��ü�� ��ȣ�� " + accNum + "�� �½��ϱ�?");
					System.out.println("1. �� 2. �ƴϿ�");
					System.out.print(">>>>>>: "); int ch = Day08_5.scan.nextInt();
					if(ch == 1){
						Day08_5.account[i].amount -= num;
						System.out.println(accNum +"���� " +num + "�� �۱�, �����ݾ�: " + temp.amount);
						int j = 0;
						for(Account temp2 : Day08_5.account) {
							if(temp2 != null && temp2.accountNumber.equals(accNum)) {
								Day08_5.account[j].amount += num;
								break;
							}
							j++;
						}
					}else if(ch == 2) {
						System.err.println("����ϼ̽��ϴ�.");
					}
					
				}else System.out.println("�ܾ� ����");
			}
			i++;
		}
	}
	public void loanAcc(String id) {
		//Loan ����Ʈ ���
		//�ε��� ��ȣ ����
		//���¹�ȣ ġ��
		//�ű⿡ �ش� �ε����� �׼��� ����
		//�� �ε����� �̸��� ���¹�ȣ�� ���� �ε����� loanName �� ����.;
	}
	public void listAcc(String id) {
		int i = 0;
		for(Account temp : Day08_5.account) {
			
			if(temp != null && temp.accountOwner.equals(id)) {
				System.out.println(temp.accountNumber + ":\t " + temp.amount + "\t"+ temp.accountOwner);
			}
		}
	}

}