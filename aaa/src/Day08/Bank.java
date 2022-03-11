package Day08;

import java.util.Scanner;




public class Bank {
	static Scanner sc = new Scanner(System.in);
	static Member[] member = new Member[1000]; // 모든 클래스에서 사용되는 배열
	
	public static void main(String[] args) {
		
	Bank menu = new Bank();
	menu.menu();
	
	}
	
	void menu() {
		
		while(true) {
			System.out.println("---------------- 도서 대여 프로그램 --------------------");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 아이디찾기 | 4. 비밀번호찾기");
			Member member = new Member(); 
			
			int ch = sc.nextInt();
				if(ch==1) { // 회원가입
					boolean result = member.signIn(); // 회원가입 메소드 호출
					if(result) {
						System.err.println("알림>> 회원가입 성공");
					}else {
						System.err.println("알림>> 회원가입 실패");
					}
					
				}else if(ch==2) { 
					
					// 로그인
					String result = member.logIn();
					if(result == null) {
						// 2. 관리자 메뉴 메소드 호출
						System.err.println("알림>> 회원정보가 없습니다");
					}else if(result.equals("admin")) {
						System.err.println("알림>> 관리자 메뉴입니다");
						
					}else {
						System.out.println("알림>> " + result + "님 안녕하세요");
					
					}
					
						// 1. 일반회원 메뉴 메소드 호출
						
					
				
					
				}else if(ch==3) { // 아이디찾기
					member.findId();
					
				}else if(ch==4) { // 비밀번호찾기
					member.findPw();
					
				}else {
					System.err.println("알림>> 알 수 없는 번호입니다.");
				}
			}
	}
}
