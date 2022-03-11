package Day08;

public class Loan {
	String loanName; 	// ��ǰ��
	int loanAmount;		//�׼�
	double loanInterest;
	String loanPerson;
	boolean loanRe = true;

	//��ǰ (��ǰ��,�׼�,"0")
	//���������(��ǰ��, �׼�, members.id)
	public Loan(){};
	public Loan(String loanName, int loanAmount,double loanInterest) {
		this.loanAmount = loanAmount;
		this.loanName = loanName;
		this.loanInterest = loanInterest;
	}
	public Loan(String loanName, int loanAmount,double loanInterest, String loanPerson, boolean loanRe) {
		this.loanAmount = loanAmount;
		this.loanName = loanName;
		this.loanInterest = loanInterest;
		this.loanPerson = loanPerson;
		this.loanRe = loanRe;
	}
	
	
	
	public void loanList(String id) {
		System.out.println("---------���� ��ǰ ���---------");
		System.out.println("�ε���\t��ǰ��\t�ݾ�\t���⿩��");
		int i = 0;
		for(Loan temp : Day08_5.loan) {
			if(temp != null) {
				System.out.println(i + "\t" + temp.loanName + "\t" + temp.loanAmount + "\t" + temp.loanRe);
			}
		} 
		
	}
	public void loanLoan(String id) {
		System.out.println("�ε��� ��ȣ �Է�");
		System.out.print(">>>>>: "); int ch = Day08_5.scan.nextInt();
		
		boolean loanCheck = true;
		if(Day08_5.loan[ch].loanName != null) {
			System.out.println( Day08_5.loan[ch].loanName + "�� ���� �Ͻðڽ��ϱ�?");
			System.out.println("1. ���� 2.���"); int ch2 = Day08_5.scan.nextInt();
			
			if(ch2 == 1) {
				System.out.println("���¹�ȣ �Է�: "); String ch3 = Day08_5.scan.next();
				int i = 0;
				for(Account temp : Day08_5.account) {
					if(temp != null && temp.accountOwner.equals(id) && temp.accountNumber.equals(ch3)) {
						Day08_5.loan[ch].loanPerson = id;
						Day08_5.loan[ch].loanRe = false;
						Day08_5.account[i].amount += Day08_5.loan[ch].loanAmount;
						Day08_5.account[i].loanName = Day08_5.loan[ch].loanName;
						System.err.println("�˸�)) ���� �Ϸ�Ǿ����ϴ�.");
					}
					i++;
				}
			}
			else if(ch2 == 2) {System.err.println("�˸�) ����Ͽ����ϴ�.");}
			else {System.err.println("�˸�)) �˼� ���� ��ȣ�Դϴ�.");}
		}
	}
	public void loanRepay(String id) {
		for(Account temp : Day08_5.account) {
			if(temp != null && temp.accountOwner.equals(id)) {
				for(Loan temp2 : Day08_5.loan) {
					if(temp2 != null && temp2.loanName.equals(temp.loanName)) {
						System.out.printf("%s ��ǰ�� ��ȯ��: %.2f",temp2.loanName, temp2.loanAmount * temp2.loanInterest);
					}
				}
			}
		}
	}
	public void loanReB(String id) {
		int i = 0;
		for(Account temp : Day08_5.account) {
			if(temp != null && temp.accountOwner.equals(id)) {
				int j = 0;
				for(Loan temp2 : Day08_5.loan) {
					if(temp2 != null && temp2.loanName.equals(temp.loanName)) {
						Day08_5.account[i].amount -= (Day08_5.loan[j].loanAmount * Day08_5.loan[j].loanInterest);
						Day08_5.loan[j].loanRe = true;
						Day08_5.loan[j].loanPerson = null;
						Day08_5.account[i].loanName = null;
						System.out.println("�˸�)) ��ȯ �Ϸ�");
					}
					j++;
				}
			}
			i++;
		}
	}
	
	
}
