package Day09;

import java.util.Scanner;

public class Day09_6_은행계좌프로그램 {

	// 은행계좌프로그램 [ 상속 ]
			// 은행 -> 슈퍼클래스
			// 국민은행, 신한은행, 하나은행 -> 서브클래스
			// 주 기능 - 1. 계좌생성 2. 입금 3. 출금 4. 이체 
			// 			5. 내계좌목록 6. 대출
			
	//  모든 클래스에서 사용하기 위해 static 배열 선언
	public static Bank[] accList = new Bank[100];
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("-------계좌 프로그램---------");
			System.out.println("1. 계좌생성|2. 입금|3. 출금|4. 이체|5. 계좌목록|6. 대출");
			System.out.print("선택>> "); int ch = sc.nextInt();
			
			Controller con = new Controller();
			
			if(ch ==1 ) {
				System.out.println("+++계좌 생성+++");
				System.out.println("비밀번호 : ");
				String pw = sc.next();
				System.out.println("계좌주 : ");
				String name = sc.next();
				System.out.println("은행선택 < 1. 국민|2. 신한|3. 하나| >");
				int bankNo = sc.nextInt();
				
				// 컨트롤러 연결
				String accNo = con.계좌생성(pw, name, bankNo); // 메소드 호출 [인수3개]/
				// 메소드 반환 저장 = 계좌번호 혹은 null
				// 메소드 실행 후 메시지 출력
				if(accNo != null) {
					System.out.println("+++ 계좌 생성 +++");
					System.out.println("고객님의 계좌번호 : " + accNo);
				}else {
					System.out.println("알림>> 계좌등록 실패");
				}
				
			}else if(ch ==2) {
				System.out.println("+++ 입 금 +++");
				System.out.println("계좌번호 입력 : ");
				String accNo = sc.next();
				System.out.println("입금액 : ");
				int input = sc.nextInt();
				
				boolean result = con.입금(accNo, input);
				con.입금(accNo, input);
				if(result) {
					System.out.println("알림>> 입금 성공");
					
				}else {
					System.out.println("알림>> 입금 실패");
				}
				
			}else if(ch ==3) {
				System.out.println("+++ 출 금 +++");
				System.out.println("계좌번호 입력 : ");
				String accNo = sc.next();
				System.out.println("비밀번호 입력 : ");
				String pw = sc.next();
				System.out.println("출금액 : ");
				int output = sc.nextInt();
				
				int result = con.출금(accNo, pw, output);
				con.출금(accNo, pw, output);
				
				if(result == 1) {
					System.out.println("알림>> 잔액 부족");
				}else if(result == 2) {
					System.out.println("알림>> 출금 성공");
					
				}else if(result == 3) {
					System.out.println("알림>> 정보가 올바르지 않습니다");
				}
				
			}else if(ch ==4) {
				System.out.println("+++ 이 체 +++");
				System.out.println("계좌번호 : ");
				String accNo = sc.next();
				System.out.println("비밀번호 : ");
				String pw = sc.next();
				System.out.println("이체금액 : ");
				int 이체금액 = sc.nextInt();
				System.out.println("받는계좌 : ");
				String 받는계좌 = sc.next();
				
				int result = con.이체(accNo, pw, 이체금액, 받는계좌);
				if(result ==1) {
					System.out.println("잔액부족");
				}else if(result ==2) {
					System.out.println("이체성공");
				}else if(result ==3) {
					System.out.println("받는 계좌 X");
				}else if(result ==4) {
					System.out.println("보내는 계좌 X");
				}
				
			}else if(ch ==5) {
				System.out.println("+++계좌 목록+++");
				System.out.println("계좌주 입력 : ");
				String name = sc.next();
				Bank[] myAcc = con.계좌목록(name);
								
				System.out.printf("*** %s님의 계좌 목록 ***\n", name);
				int i = 1;
				for(Bank temp : myAcc) {
					if(temp != null)
					System.out.println(i + "번 계좌번호 : " + temp.getAccNo());	
					i++;
				}
								
			}else if(ch ==6) {
				System.out.println("+++ 대 출 +++");
			}else {
				System.out.println("알림>> 잘못된 번호입니다");
			}
		} // while end
	
	} // main end
} // class end
