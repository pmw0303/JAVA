package Day08;

import java.util.Scanner;

public class Bank {
	static Scanner sc = new Scanner(System.in);
	static Member[] member = new Member[100]; // 모든 클래스에서 사용되는 배열
	static Account[] account = new Account[100];
	static Loan[] loan = new Loan[100];

	public static void main(String[] args) {

		Bank menu = new Bank();
		menu.menu();

	}

	void menu() {

		while (true) {
			System.out.println("---------------- 모바일 뱅크 --------------------");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 아이디찾기 | 4. 비밀번호찾기");
			Member member = new Member();

			int ch = sc.nextInt();
			if (ch == 1) { // 회원가입
				boolean result = member.signIn(); // 회원가입 메소드 호출
				if (result) {
					System.err.println("알림>> 회원가입 성공");
				} else {
					System.err.println("알림>> 회원가입 실패");
				}

			} else if (ch == 2) {

				// 로그인
				String result = member.logIn();
				if (result == null) {
					// 2. 관리자 메뉴 메소드 호출
					System.err.println("알림>> 회원정보가 없습니다");

				} else if (result.equals("admin")) {
					System.err.println("알림>> 관리자 메뉴입니다");

				} else {
					System.out.println("알림>> " + result + "님 안녕하세요");
					acc(result);
				}

				// 1. 일반회원 메뉴 메소드 호출

			} else if (ch == 3) { // 아이디찾기
				member.findId();

			} else if (ch == 4) { // 비밀번호찾기
				member.findPw();

			} else {
				System.err.println("알림>> 알 수 없는 번호입니다.");
			}
		}
	}
	
	void acc(String id) {//계좌 탭 시작
		while(true) {
			System.out.println(" --------------- 회원 메뉴 ------------------");
			System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 계좌목록 7.로그아웃");
			System.out.print(">>>>>>: "); int ch = sc.nextInt();
			Account account = new Account(); // 빈생성자로 객체 => 메소드 호출용
			if( ch == 1 ) 		{
				boolean result = account.createAcc(id);
				if( result ) 
					System.err.println(" 알림]] 계좌생성 성공 ");
				else 
					System.err.println(" 알림]] 계좌생성 실패");
				
			} 	//계좌 생성
			else if( ch ==2 ) 	{account.depositAcc(id);}		//입금
			else if( ch == 3 ) 	{account.withdrawAcc(id);}	//출금
			else if( ch == 4 ) 	{account.transferAcc(id);}	//이체
			else if( ch == 5 ) 	{account.loanAcc(id);}		//대출
			else if( ch == 6 ) 	{account.listAcc(id);}		//계좌 목록
			else if( ch == 7 ) 	{ return; } // 일반회원메뉴 메소드 종료 [ 로그아웃 ] 
			else { System.err.println(" 알림]] 알수 없는 번호입니다. "); }
		}	
	
} 

}
