package Day08;

public class Loan {
	String loanName; 	// ��ǰ��
	int loanAmount;		//�׼�
	double loanInterest;
	String loanPerson;
	boolean loanRe;

	//��ǰ (��ǰ��,�׼�,"0")
	//���������(��ǰ��, �׼�, members.id)
	
	// ���
	public Loan(){};
	public Loan(String loanName, int loanAmount,double loanInterest) {
		this.loanAmount = loanAmount;
		this.loanName = loanName;
		this.loanInterest = loanInterest;
	}
	
	// ������
	public Loan(String loanName, int loanAmount,double loanInterest, String loanPerson, boolean loanRe) {
		this.loanAmount = loanAmount;
		this.loanName = loanName;
		this.loanInterest = loanInterest;
		this.loanPerson = loanPerson;
		this.loanRe = loanRe;
	}
	
	
}
