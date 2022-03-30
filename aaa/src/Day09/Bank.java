package Day09;

public class Bank {

	// 1. 필드
		// 계좌번호[중복X = 식별], 비밀번호, 계좌주, 예금액
	
	// 2. 생성자
		// 1. 빈 생서자 2. 모든필드 생성자 
	
	// 3. 메소드
		// 1. 계좌생성 2. 입금 3. 출금 4. 이체 
		// 5. 내 계좌목록 6. 대출 7. get,set [필드가 private 인 경우]
	
	private	String accNo;
	private String pw;
	private String name;
	private int money;
	
	public Bank(){
		
	}

	public Bank(String accNo, String pw, String name, int money) {
		super();
		this.accNo = accNo;
		this.pw = pw;
		this.name = name;
		this.money = money;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
