package Day09;

public class Bank {

	// 1. �ʵ�
		// ���¹�ȣ[�ߺ�X = �ĺ�], ��й�ȣ, ������, ���ݾ�
	
	// 2. ������
		// 1. �� ������ 2. ����ʵ� ������ 
	
	// 3. �޼ҵ�
		// 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 
		// 5. �� ���¸�� 6. ���� 7. get,set [�ʵ尡 private �� ���]
	
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
