package Day08;

import java.util.Scanner;

public class Day08_5 {
	//모바일 뱅크 프로그램[2인과제]
	//회원 주요기능: 1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기
	//계좌 주요기능: 1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 계좌목록
		//회원이 계좌 만들어서 사용
	//관리자(은행원) 대출 상품을 등록해서 회원들이 선택해서 대출 사용
	//설계: 통장, 대출, 회원
	//대출탭. 상품이름 - 선택하면 자기 계좌 선택해서 들어오게.
	// 누가 어느거 선택했는지도.
	static Scanner scan = new Scanner(System.in);
	static Member[] members = new Member[100];
	static Account[] account = new Account[100];
	static Loan[] loan = new Loan[100];
	
	public static void main(String[] args) {
		Day08_5 application = new Day08_5();
		application.menu();
	}


	void menu() {
		while (true) {// 모바일 뱅크 시작
		System.out.println("-----모바일 뱅크------"); // 모바일 뱅크 시작
		System.out.println("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호 찾기");
		System.out.print(">>>>: "); int ch1 = scan.nextInt();
		Member member = new Member();
		if(ch1 == 1) {member.signIn();}
		else if(ch1 == 2) {
			String result = member.logIn();
			if( result == null ) { // 로그인실패 
				System.err.println(" 알림]] 동일한 회원정보가 없습니다.");
			}else if( result.equals("admin")) { // 관리자
				// 2. 관리자 메뉴 메소드 호출 
				System.out.println(" 알림]] 안녕하세요~ "+result+"님");
				accadmin(); // 내부 메소드 호출
			}else{ // 일반 
				// 1. 일반회원 메뉴 메소드 호출
				System.out.println(" 알림]] 안녕하세요~ "+result+"님");
				acc(result);
			}
		}
		
		else if(ch1 == 3) {member.findId();}
		else if(ch1 == 4) {member.findPw();}
		else {System.err.println("오류)) 알수없는 번호입니다.");}
		}
	}
	void accadmin() {
		while(true) {
			System.out.println(" --------------- 직원 메뉴 ------------------");
			System.out.println("1. 대출 상품 등록 2. 대출자 목록 3. 로그아웃");
			System.out.print(">>>>>>: "); int ch = scan.nextInt();
			Loan loan = new Loan(); 
			
			if(ch == 1) {
				System.out.println("대출 상품 등록-------------");
				System.out.println("상품 이름 : "); String loanName = scan.next();
				System.out.println("금액 : "); int loanAmount = scan.nextInt();
				System.out.println("이자 : "); double loanInterest = scan.nextDouble();
				
				boolean loanNcheck = true;
				for(Loan temp : Day08_5.loan) {
					if(temp != null && temp.loanName.equals(loanName)) {
						System.out.println("알림>> 이미 있는 대출 상품입니다");
						loanNcheck = false;
						break;
					}
				}
				Loan loan123 = new Loan(loanName, loanAmount, loanInterest);
				if(loanNcheck) {
					int i = 0 ; // 반복횟수 [ 인덱스체크 ]
					for( Loan temp : Day08_5.loan ) {
						if( temp == null ) { // 빈공간이면 
							Day08_5.loan[i] = loan123; // 빈 인덱스에 새로운 회원 대입
							 // 회원가입 메소드 종료 ~~~~~~~ [ 반환 : true ]
							break;
						}
						i++; // i증가 
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
			}else System.out.println("잘못된 번호입니다");
			
		}
		
	}
	void acc(String id) {//계좌 탭 시작
			while(true) {
				System.out.println(" --------------- 회원 메뉴 ------------------");
				System.out.println("1. 계좌생성 2. 입금 3. 출금 4. 이체 5. 대출 6. 계좌목록 7.로그아웃");
				System.out.print(">>>>>>: "); int ch = scan.nextInt();
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
				else if( ch == 5 ) 	{loan(id);}		//대출
				else if( ch == 6 ) 	{account.listAcc(id);}		//계좌 목록
				else if( ch == 7 ) 	{ return; } // 일반회원메뉴 메소드 종료 [ 로그아웃 ] 
				else { System.err.println(" 알림]] 알수 없는 번호입니다. "); }
			}	
		
	}
	
	void loan(String id) {
		while(true) {
			System.out.println(" --------------- 대출 메뉴 ------------------");
			System.out.println("1.상품 목록 2.대출 3.상환금 조회 4.상환 5.취소");
			System.out.print(">>>>>>>: "); int ch = scan.nextInt();
			Loan loan = new Loan();
			if(ch == 1) {loan.loanList(id);}
			else if(ch == 2) {loan.loanLoan(id);}
			else if(ch == 3) {loan.loanRepay(id);}
			else if(ch == 4) {loan.loanReB(id);}
			else if(ch == 5){return;}
			else {System.err.println("오류)) 알수없는 번호입니다");}
			
		}
		
	}
	
}