package Day08;

public class Loan {
	String loanName; 	// 상품명
	int loanAmount;		//액수
	double loanInterest;
	String loanPerson;
	boolean loanRe = true;

	//상품 (상품명,액수,"0")
	//빌려간사람(상품명, 액수, members.id)
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
		System.out.println("---------대출 상품 목록---------");
		System.out.println("인덱스\t상품명\t금액\t대출여부");
		int i = 0;
		for(Loan temp : Day08_5.loan) {
			if(temp != null) {
				System.out.println(i + "\t" + temp.loanName + "\t" + temp.loanAmount + "\t" + temp.loanRe);
			}
		} 
		
	}
	public void loanLoan(String id) {
		System.out.println("인덱스 번호 입력");
		System.out.print(">>>>>: "); int ch = Day08_5.scan.nextInt();
		
		boolean loanCheck = true;
		if(Day08_5.loan[ch].loanName != null) {
			System.out.println( Day08_5.loan[ch].loanName + "를 대출 하시겠습니까?");
			System.out.println("1. 대출 2.취소"); int ch2 = Day08_5.scan.nextInt();
			
			if(ch2 == 1) {
				System.out.println("계좌번호 입력: "); String ch3 = Day08_5.scan.next();
				int i = 0;
				for(Account temp : Day08_5.account) {
					if(temp != null && temp.accountOwner.equals(id) && temp.accountNumber.equals(ch3)) {
						Day08_5.loan[ch].loanPerson = id;
						Day08_5.loan[ch].loanRe = false;
						Day08_5.account[i].amount += Day08_5.loan[ch].loanAmount;
						Day08_5.account[i].loanName = Day08_5.loan[ch].loanName;
						System.err.println("알림)) 대출 완료되었습니다.");
					}
					i++;
				}
			}
			else if(ch2 == 2) {System.err.println("알림) 취소하였습니다.");}
			else {System.err.println("알림)) 알수 없는 번호입니다.");}
		}
	}
	public void loanRepay(String id) {
		for(Account temp : Day08_5.account) {
			if(temp != null && temp.accountOwner.equals(id)) {
				for(Loan temp2 : Day08_5.loan) {
					if(temp2 != null && temp2.loanName.equals(temp.loanName)) {
						System.out.printf("%s 상품의 상환금: %.2f",temp2.loanName, temp2.loanAmount * temp2.loanInterest);
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
						System.out.println("알림)) 상환 완료");
					}
					j++;
				}
			}
			i++;
		}
	}
	
	
}
