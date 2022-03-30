package Day06;

import java.util.Scanner;

public class Day06_3 {

//	회원제 프로그램[클래스]
//	
//	0. 회원 설계 -> 회원 클래스 만들기
//		1) 필드 - 아이디, 비밀번호, 이름, 전화번호
//		
//	
//	1. 초기메뉴 - 1. 회원가입 , 2. 로그인 , 3. 아이디찾기 , 4. 비밀번호기
//		1) 회원가입시 입력받아 저장
//		2) 로그인시 아이디와 비밀번호가 동일하면 로그인
//		3) 아이디찾기는 이름과 전화번호가 동일하면 아이디 출력
//		4) 비밀번호찾기는 아이디와 전화번호가 동일하면 비밀번호 출력

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member[] memberlist = new Member[100];
		// Member 클래스로 만들어진 객체 100개를 저장할 수 있는 배열 선언

		while (true) { // 프로그램 실행 while [ 종료조건 X ]

			System.out.println("------------회원--------------");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 아이디찾기 | 4. 비밀번호찾기");
			System.out.println("선택>> ");
			int ch = sc.nextInt();

			if (ch == 1) { // 회원가입

				// id, pw, name, phone 입력받기
				System.out.println("아이디 입력 : ");
				String id = sc.next();
				System.out.println("비밀번호 입력 : ");
				String pw = sc.next();
				System.out.println("이름 입력 : ");
				String name = sc.next();
				System.out.println("전화번호 입력 : ");
				String phone = sc.next();

				// 객체 생성
				Member member = new Member();
				// 입력받은 변수 4개를 객체 내 필드에 저장
				member.id = id;
				member.pw = pw;
				member.name = name;
				member.phone = phone;

				boolean idcheck = false;
				for (Member temp : memberlist) { // 아이디 중복 체크

					if (temp != null && temp.id.equals(id)) {
						System.err.println("알림>> 중복된 아이디입니다");
						idcheck = true;
						break;
					}
				}

				if (idcheck == false) {

					// 여러개 객체를 저장하는 배열에 저장
					// 공백 인덱스 찾기 / 공백이 아니면 기존회원 존재
					int i = 0; // 인덱스 위치 변수
					for (Member temp : memberlist) {
						// memberlist 배열에 member 객체 하나씩 temp 저장 반복
						// 공백 인덱스에 객체 저장

						if (temp == null) {// 해당 객체가 null -> 객체에 저장
							memberlist[i] = member;
							System.err.println("알림>> 회원가입 완료");
							break;
						} // 회원 저장 for end
						i++; // 인덱스 증가
					}
				}
			} else if (ch == 2) { // 로그인
				System.out.println("--------로그인----------");
				System.out.println("아이디 : ");
				String loginid = sc.next();
				System.out.println("비밀번호 : ");
				String loginpw = sc.next();

				// 기존 배열[ 회원리스트 ] 내 입력받은 값과 비교
				boolean logincheck = false;
				for (Member temp : memberlist) {
					// memberlist 내 0번 인덱스부터 끝 인덱스까지 하나씩 temp 대입
					if (temp != null && temp.id.equals(loginid) && temp.pw.equals(loginpw)) {
						System.err.println("알림>> 로그인 성공");
						logincheck = true;
					}
				}
				// 로그인 성공 여부
				if (logincheck == false) {
					System.err.println("알림>> 회원 정보가 없습니다");
				}
			} else if (ch == 3) { // 아이디 찾기
//				1. 이름과 연락처 입력받기
//				2. 배열내 동일한 이름과 연락처 유무 확인
//				3. 동일한 객체가 있으면 해당 아이디 출력
//				4. 없으면 없다고 출력
				System.out.println("----------아이디 찾기------------");
				System.out.println("이름 입력 : ");
				String name = sc.next();
				System.out.println("전화번호 입력 : ");
				String phone = sc.next();
				// 1번

				boolean findcheck = false;
				for (Member temp : memberlist) { // 2번

					if (temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
						System.err.println("알림>> 아이디 찾기 성공");
						System.out.println("아이디 : " + temp.id);
						findcheck = true;
						break; // 3번
					}
				} // 4번
				if (findcheck == false) {
					System.err.println("알림>> 회원정보가 존재하지 않습니다");

				}

			} else if (ch == 4) { // 비밀번호 찾기

				System.out.println("아이디 : ");
				String id = sc.next();
				System.out.println("전화번호 : ");
				String phone = sc.next();

				boolean findcheck = false;
				for (Member temp : memberlist) {
					if (temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
						System.err.println("알림>> 비밀번호 찾기 성공");
						System.err.println("비밀번호 : " + temp.pw);
						findcheck = true;
						break;
					}
				}

				if (findcheck == false) {
					System.err.println("알림>> 회원정보가 존재하지 않습니다");
				}

			} else {
				System.err.println("알림>> 알 수 없는 번호입니다");
			}

		} // 프로그램 실행 while end

	}
}
