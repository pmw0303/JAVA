package Day05;

import java.util.Scanner;

public class Day05_2 {

//	회원제 방문록 프로그램 (2차원 배열)
//		1. 초기메뉴 [1. 회원가입 2.로그인]
//					1. 회원가입 - 아이디, 비밀번호, 이름
//					2. 로그인 - 아이디, 비밀번호 동일 -> 로그인
//		2. 로그인 메뉴 [1. 방문록 2. 로그아웃]
//					1. 방문록 - 제목, 내용, 작성자(아이디)
//					2. 로그아웃 - 초기메뉴로 돌아가기

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// 회원 100명[id, password, name]

		String[][] member = new String[100][3]; // 100행 3열 -> 회원당 1행
		// 방문록 100개[ title, contents, writer ] 저장하는 배열

		String[][] boardlist = new String[100][3]; // 개시물당 1행

		while (true) { // 종료조건 X

			System.out.println("-------회원제 방문록-------");
			System.out.println("-----------------------");
			System.out.println("1. 회원가입   //   2. 로그인");
			int ch = scanner.nextInt();

			if (ch == 1) {
				System.out.println("------회원가입 페이지------");
				System.out.println("ID 입력 : ");
				String id = scanner.next();
				System.out.println("PASSWORD 입력 : ");
				String pw = scanner.next();
				System.out.println("NAME 입력 : ");
				String name = scanner.next();

//				3개 변수를 입력받아 member 2차원 배열 저장
//					1. 빈 공간을 찾아서 저장[ 만약 빈 공간이 없으면 회원 ]
//					2. 아이디 중복체크

				boolean idcheck = true;
				for (int i = 0; i < member.length; i++) { // ID 중복체크
					if (member[i][0] != null && member[i][0].equals(id)) {
						System.err.println("ID가 중복입니다");
						idcheck = false;
						break;

					}

				}

				if (idcheck) { // idcheck 가 true 인 경우에만 회원가입
					for (int i = 0; i < member.length; i++) { // 저장
						if (member[i][0] == null) {

							member[i][0] = id;
							member[i][1] = pw;
							member[i][2] = name;
							System.err.println("알림>> 회원가입 완료");
							break;

						}
					}
				}

			} else if (ch == 2) {
				System.out.println("-------로그인 페이지-------");
				System.out.println("ID 입력 : ");
				String id = scanner.next();
				System.out.println("PASSWORD 입력 : ");
				String pw = scanner.next();

				boolean logincheck = false;

				for (int i = 0; i < member.length; i++) {
					if (member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) {

						System.err.println("알림>> 로그인 성공");
					}
					logincheck = true;
//////////////////////////////////////////////////////////////
					while (true) {
						System.out.println("----------------------");
						System.out.println("---------방문록---------");
						System.out.println("번호\t작성자\t제목\t내용");

						// 모든 방문 출력
						for (int j = 0; j < boardlist.length; j++) {
							if (boardlist[j][0] != null) {
								System.out.printf("%d\t%s\t%s\t%s \n", j, boardlist[j][2], boardlist[j][0],
										boardlist[j][1]);

							}

						}

						System.out.println("----------------------");
						System.out.println("--------방문록----------");
						System.out.println("1. 방문록 쓰기   2. 로그아웃");
						int ch2 = scanner.nextInt();

						if (ch2 == 1) {

							System.out.println("-------------글쓰기----------");
							System.out.println("TITLE : ");
							String title = scanner.next(); // 제목
							System.out.println("CONTENT : ");
							String content = scanner.next(); // 내용
							// 배열내 공백 찾아서 저장 *****

							for (int j = 0; j < member.length; j++) {
								if (boardlist[j][0] == null) { // **** 공백 찾아서 넣기 ****
									boardlist[j][0] = title;
									boardlist[j][1] = content;
									boardlist[j][2] = id; // 로그인 시에 사용된 ID 대입
									break;

								}
							}

						} else if (ch == 2) {
							System.err.println("알림>> 로그아웃");
							break;
						} else {
							System.out.println("알림>> 알수없는 번호입니다");
						}
					}
/////////////////////////////////////////////////////////////////////
				} // for
				if (logincheck == false)
					System.err.println("알림>> 회원정보가 없거나 다릅니다 ");

			} else {
				System.err.println("알림>> 잘못된 번호입니다 ");
			}

		} // while1

	}
}
