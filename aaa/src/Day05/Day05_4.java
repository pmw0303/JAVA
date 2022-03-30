package Day05; //패키지명 [ 소스파일들의 폴더 ]

import java.util.Scanner;

public class Day05_4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String[][] member = new String[100][2];
		String[][] book = new String[100][3];

		book[0][0] = "자바책";
		book[0][1] = "대여중X";
		book[0][2] = "aa";

		book[1][0] = "자바책1";
		book[1][1] = "";
		book[1][2] = "aa";

		member[0][0] = "admin";
		member[0][1] = "0000";

		while (true) { // 맨 처음 while

			System.out.println("도서대여 프로그램");
			System.out.println("1. 회원가입 | 2. 로그인 ");
			System.out.println("선택> ");
			int ch = scanner.nextInt();

			if (ch == 1) { // if 회원가입

				System.out.println("----------회원가입-----------");
				System.out.println("ID 입력 : ");
				String id = scanner.next();
				System.out.println("PW 입력 : ");
				String pw = scanner.next();

				boolean idcheck = true;
				for (int i = 0; i < member.length; i++) {
					if (member[i][0] != null && member[i][0].equals(id)) {
						// ==null : 회원X . !=null : 회원O.
						System.err.println(" 알림]] 동일한 아이디가 존재합니다.");
						idcheck = false; // 회원가입 불가능하게 idcheck 변수를 false 변경
						break;
					}
				}

				// 저장부분
				if (idcheck) { // idcheck 가 true 인 경우에만 회원가입처리
					for (int i = 0; i < member.length; i++) {
						if (member[i][0] == null) { // i번째 행 에 id가 없으면 = 빈공간
							member[i][0] = id;
							member[i][1] = pw;

							System.err.println(" 알림]] 회원가입이 되었습니다.");
							break; // 저장했으면 끝 [ 1번만 저장 ]
						}
					}
				}

			} // if 회원가입 end
			else if (ch == 2) { // else if 로그인
				System.out.println("---------로그인---------");
				System.out.print(" MEMBER ID : ");
				String id = scanner.next();
				System.out.print(" MEMBER PASSWORD : ");
				String pw = scanner.next();

				boolean logincheck = false; // 로그인 성공 초기값

				for (int i = 0; i < member.length; i++) { // for

					 if (member[i][0] != null && member[i][0].equals(id) && member[i][1].equals(pw)) { // if 로그인
																												// 확인
																												// 시작

						System.err.println("알림>> 로그인 성공");
						logincheck = true;

						while (true) { // 로그인 후 while

							System.out.println("1. 도서검색 |2. 도서목록 |3. 도서대여 |4. 도서반납 |5. 로그아웃");

							int ch1 = scanner.nextInt(); // ch1 - 로그인 후 번호 선택
							if (ch1 == 1) { // 도서검색

								System.out.println("검색할 도서 입력 : ");
								String search = scanner.next();

								for (int j = 0; j < book.length; j++) {

									if (book[j][0].equals(search)) {
										System.out.printf("%s %s\n", book[j][0], book[j][1]);

									} else {
										System.out.println("존재하지 않습니다");
									}

								}

							} else if (ch1 == 2) { // 도서목록

								for (int j = 0; j < book.length; j++) {

									if (book[j][0] != null) {
										System.out.printf("%s  ", book[j][0]);
									}
								}
								System.out.println();

							} else if (ch1 == 3) { // 도서대여

								System.out.println("대여할 도서 제목 : ");
								String name = scanner.next();
								for (int j = 0; j < book.length; j++) {
									if (name.equals(book[j][0])) {
										if (book[j][1].equals("대여중X")) {

											System.out.println("대여 하시겠습니까?");
											System.out.println("1. 예 | 2. 아니요");
											int ch3 = scanner.nextInt();

											if (ch3 == 1) {
												book[j][1] = "대여중(" + id + ")";
												break;
											}

										} else {
											System.out.println("대여중입니다");
										}

									}
								}

							} else if (ch1 == 4) { // 도서반납

								System.out.println("반납할 도서 제목 : ");
								String name1 = scanner.next();

								for (int j = 0; j < book.length; j++) {
									if (name1.equals(book[j][0])) {
										if (book[j][1].equals("대여중(" + id + ")")) {
											System.out.println("반납하시겠습니까?");
											System.out.println("1. 반납 | 2. 반납X");
											int ch_4 = scanner.nextInt();

											if (ch_4 == 1) {

												book[j][1] = "대여중X";
												break;
											} else {
												break;
											}

										}

									} else {
										System.out.println("당신이 대여한 도서가 아닙니다");
										break;
									}
								}

							} else if (ch1 == 5) { // 로그아웃

								break;

							} else { // 다른 번호 입력
								System.err.println("알림>> 알수 없는 번호입니다");
							}

						} // 로그인 후 while end

					} // if 로그인 확인 시작 end

				} // for end

				if (logincheck == false)
					System.err.println(" 알림]] 회원정보가 없거나 다릅니다.");

			} // ch==2 if 로그인 end
			else {
				System.err.println(" 알림]] 알수 없는 번호입니다.!!");
			} // 맨 처음 while end

		}
	}
}





//if (member[0][0].equals("admin") && member[0][1].equals("0000")) {
//
//	System.out.println("관리자 모드");
//	System.out.println("1. 도서등록 | 2. 도서목록 | 3. 도서삭제 | 4. 로그아웃");
//	System.out.println("선택>> ");
//
//	int ch_2_1 = scanner.nextInt();
//
//	if (ch_2_1 == 1) { // 도서등록
//
//		System.out.println("도서를 등록 하시겠습니까?");
//		System.out.println("1. 등록 | 2. 등록X ");
//		int ch2_1_1 = scanner.nextInt();
//		if (ch2_1_1 == 1) {
//
//			for (int j = 0; j < book.length; j++) {
//
//				System.out.println("등록할 책 이름 : ");
//				String e_book = scanner.next();
//
//				if (e_book.equals(book[j][0])) {
//
//					System.err.println("이미 등록되어 있습니다");
//					break;
//				} else {
//
//					if (e_book != book[j][0]) {
//
//						book[j][0] = e_book;
//						System.out.println("등록되었습니다");
//						break;
//					}
//
//				}
//			}
//		}
//
//	} else if (ch_2_1 == 2) { // 도서목록
//
//		for (int j = 0; j < book.length; j++) {
//
//			if (book[j][0] != null) {
//				System.out.printf("%s  ", book[j][0]);
//			}
//		}
//		System.out.println();
//
//	} else if (ch_2_1 == 3) { // 도서삭제
//
//		System.out.println("도서를 삭제하시겠습니까?");
//		System.out.println("1. 삭제 | 2. 삭제X ");
//		int ch_2_1_1 = scanner.nextInt();
//
//		if (ch_2_1_1 == 1) {
//
//			for (int j = 0; j < book.length; j++) {
//
//				System.out.println("삭제할 책 이름 : ");
//				String d_book = scanner.next();
//
//				if (d_book.equals(book[j][0])) {
//
//					book[j][0] = null;
//					System.err.println("삭제되었습니다");
//					break;
//				}
//				System.err.println("책이 존재하지 않습니다");
//			}
//		}
//
//	} else if (ch_2_1 == 4) { // 로그아웃
//		break;
//	}
//} else
