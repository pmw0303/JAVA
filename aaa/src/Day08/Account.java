package Day08;

import Day07.Member;

public class Account {
	//1.필드
	String accountNumber;
	int amount;
	String accountOwner;
	String loanName;
	//2. 생성자
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
	//3. 메소드
	boolean createAcc(String id) {
		
		System.out.println("----계좌 생성----");
		System.out.print("계좌 번호 설정: "); String num = Day08_5.scan.next();
		
		for( Account temp : Day08_5.account ) {
			if( temp != null && temp.accountNumber.equals(num)) { // 만약에 공백이 아니면서 배열내 id와 입력받은 id와 동일하면 
				System.out.println(" 알림]] 현재 사용중인 계좌번호 입니다. ");
				return false; // 함수종료 ---> 아이디가 중복되었기 떄문에 false[가입실패]
			}
		}
		
		
		
		
		Account account = new Account(num, 0, id);
		int j = 0; // 반복횟수 [ 인덱스 ]
		for( Account temp : Day08_5.account ) {
			if( temp == null ) { // null 찾기
					Day08_5.account[j] = account;
					break; // 끝내기 
			}
			j++; // 인덱스 증가
		}
		return true;
		}
	public void depositAcc(String id) { // 입금 시작
		System.out.println("----입금----");
		System.out.print("입금할 계좌번호: "); String accNum = Day08_5.scan.next();
		System.out.print("입금할 금액 설정: "); int num = Day08_5.scan.nextInt();
		
		boolean depoCheck = false ;
		int j = 0;
		for(Account temp : Day08_5.account) {
			if (temp != null && temp.accountOwner.equals(id) && temp.accountNumber.equals(accNum)) {
				Day08_5.account[j].amount += num;
				depoCheck = true;
			}
			j++;
		}
		
		if(depoCheck) System.out.println("입금 성공");
		else System.out.println("입금 실패");
	}//입금 끝
	public void withdrawAcc(String id) {//출금 시작

		System.out.println("----출금----");
		System.out.print("출금할 계좌번호: "); String accNum = Day08_5.scan.next();
		System.out.print("출금할 금액 설정: "); int num = Day08_5.scan.nextInt();
		int i = 0;
		for(Account temp : Day08_5.account) {
			
			if (temp != null && temp.accountOwner.equals(id) && temp.accountNumber.equals(accNum)) {
				if(num < temp.amount) {
					Day08_5.account[i].amount -= num;
					System.out.println(num + "원 출금, 남은금액: " + temp.amount);
				}else System.out.println("잔액 부족");
			}
			i++;
		}
	}//출금 끝
	public void transferAcc(String id) { // 이체 시작
		System.out.println("----이체----");
		System.out.print("이체할(대상) 계좌번호: "); String accNum = Day08_5.scan.next();
		System.out.print("출금할(본인) 계좌번호: "); String accNum2 = Day08_5.scan.next();
		System.out.print("출금할 금액 설정: "); int num = Day08_5.scan.nextInt();
		int i = 0;
		for(Account temp : Day08_5.account) {
			
			
			if (temp != null && temp.accountOwner.equals(id) && temp.accountNumber.equals(accNum2)) {
				if(num < temp.amount) {
					System.out.println("이체할 번호가 " + accNum + "이 맞습니까?");
					System.out.println("1. 예 2. 아니오");
					System.out.print(">>>>>>: "); int ch = Day08_5.scan.nextInt();
					if(ch == 1){
						Day08_5.account[i].amount -= num;
						System.out.println(accNum +"으로 " +num + "원 송금, 남은금액: " + temp.amount);
						int j = 0;
						for(Account temp2 : Day08_5.account) {
							if(temp2 != null && temp2.accountNumber.equals(accNum)) {
								Day08_5.account[j].amount += num;
								break;
							}
							j++;
						}
					}else if(ch == 2) {
						System.err.println("취소하셨습니다.");
					}
					
				}else System.out.println("잔액 부족");
			}
			i++;
		}
	}
	public void loanAcc(String id) {
		//Loan 리스트 출력
		//인덱스 번호 고르면
		//계좌번호 치고
		//거기에 해당 인덱스의 액수가 들어가고
		//그 인덱스의 이름이 계좌번호랑 같은 인덱스의 loanName 에 들어가면.;
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