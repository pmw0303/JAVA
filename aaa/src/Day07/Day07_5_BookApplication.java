package Day07;

import java.util.Scanner;

public class Day07_5_BookApplication {
	
	// BookApplication 클래스 : 입출력 관련코드
		// Book 클래스 : 도서 관련 코드 
		// Member 클래스 : 회원 관련 코드 
		
		// * 도서 대여 console 프로그램[ 클래스버전 ]
			// 1. 클래스 설계 
				// 1. book
					// 필드 : ISBN(도서번호) , 도서명 , 작가 , 도서대여여부 , 대여회원
					// 메소드 : 1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.도서등록 6.도서삭제
				// 2. member
					// 필드 : 번호,아이디,비밀번호,이름,연락처
					// 메소드 : 1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			// 2. 화면 설계 
				// 1. 초기 메뉴 [ 1.회원가입 , 2.로그인 , 3.아이디찾기 , 4.비밀번호찾기  ]
				// 2. 일반회원메뉴 [ 1.도서검색 2.도서목록 3.도서대여 4.도서반납 5.로그아웃 ]
				// 3. 관리자메뉴  [ 1.도서등록 2.도서목록 3.도서삭제 4.순위(도전) 5.로그아웃
	
	// ** main 밖에 변수를 선언하는 이유 : 모든 메소드에서 사용하기 위함
		// 지역변수 : { 변수 선언 } 괄호 내에서 변수는 { } 밖을 못나감
			// 서로 다른 { } 내에서 사용시 -> 전역변수
		// static : 프로그램 시작시 메모리 할당 / 프로그램 종료 시 메모리 초기화
			// 프로그램 전반적으로 모든 곳에 사용되는 메모리 [변수]
		
	static Scanner sc = new Scanner(System.in);
	static Member[] member = new Member[1000]; // 모든 클래스에서 사용되는 배열
	static Book[] books = new Book[1000];

	
	public static void main(String[] args) {
				// 메소드 호출
					// menu();
					// static : 메모리 우선 할당 이기 때문에 static 외 메소드, 필드 못읽음
					// main 메소드 static 메소드 이기 때문에 static 메소드만 내부호출 가능
		
		Day07_5_BookApplication application = new Day07_5_BookApplication();
		application.menu();
		
	}
	
	// 1. 초기 메뉴 메소드
	 void menu() {
		
		while(true) {
		System.out.println("---------------- 도서 대여 프로그램 --------------------");
		System.out.println("1. 회원가입 | 2. 로그인 | 3. 아이디찾기 | 4. 비밀번호찾기");
		Member member = new Member(); 
		
		int ch = sc.nextInt();
			if(ch==1) { // 회원가입
				boolean result = member.회원가입(); // 회원가입 메소드 호출
				if(result) {
					System.err.println("알림>> 회원가입 성공");
				}else {
					System.err.println("알림>> 회원가입 실패");
				}
				
			}else if(ch==2) { 
				
				// 로그인
				String result = member.로그인();
				if(result == null) {
					// 2. 관리자 메뉴 메소드 호출
					System.err.println("알림>> 회원정보가 없습니다");
				}else if(result.equals("admin")) {
					System.err.println("알림>> 관리자 메뉴입니다");
					adminmenu();
				}else {
					System.out.println("알림>> " + result + "님 안녕하세요");
					membermenu(result);
				}
				
					// 1. 일반회원 메뉴 메소드 호출
					
				
			
				
			}else if(ch==3) { // 아이디찾기
				member.아이디찾기();
				
			}else if(ch==4) { // 비밀번호찾기
				member.비밀번호찾기();
				
			}else {
				System.err.println("알림>> 알 수 없는 번호입니다.");
			}
		}
	}
	// 2. 일반회원 메뉴 메소드
	void membermenu(String loginid) {
		 System.out.println("-------------회원 메뉴-----------------");
		 System.out.println("1. 도서검색 2. 도서목록 3. 도서대여 4. 도서반납 5. 로그아웃");
		 System.out.print("번호 선택 : "); 
		 
		 Book book = new Book();

			while (true) {
				int ch = sc.nextInt();
				if (ch == 1) {
					book.도서검색();
				} else if (ch == 2) {
					book.도서목록();
				} else if (ch == 3) {
					book.도서대여(loginid);
				} else if (ch == 4) {
					book.도서반납(loginid);
				} else if (ch == 5) {
					return;
				}
			}
		}
	// 3. 관리자 메뉴 메소드
	void adminmenu() {
		System.out.println("-------------관리자 메뉴-----------------");
		System.out.println("1. 도서등록 2. 도서목록 3. 도서삭제 4. 로그아웃");
		 System.out.print("번호 선택 : "); 
		 
		 Book book = new Book();

			while (true) {
				int ch = sc.nextInt();
				if (ch == 1) {
					book.도서등록();
				} else if (ch == 2) {
					book.도서목록();
				} else if (ch == 3) {
					book.도서삭제();
				} else if (ch == 4) {
					return;
				}

			}
		}
}
