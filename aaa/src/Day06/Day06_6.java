package Day06;

import java.util.Scanner;

public class Day06_6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Board[] boardlist = new Board[100]; // board 객체 100개 생성

		while (true) { // 프로그램 실행 while [ 종료조건 X ]

			System.out.println("------------커뮤니티--------------");
			//////////////////// 모든 게시물 조회
			System.out.println("번호\t작성자\t제목");
			// 배열 내 모든 객체(게시물) 출력 반복문
			int index = 0;
			// 인덱스 변수 [ 배열 내 객체 수 체크 ]
			for (Board board : boardlist) {
				if (board != null) {
					System.out.printf("%d\t%s\t%s\n", index, board.writer, board.title);

				}
				index++;
			}
			//////////////////// 모든 게시물 조회

			System.out.println("1.글쓰기 | 2. 글보기");

			int ch = sc.nextInt();
			if (ch == 1) { // 글쓰기
				// 1. 4개 변수를 입력받는다
				System.out.println("----------글쓰기 페이지------------");
				System.out.print("제목 : ");
				String title = sc.next();
				System.out.print("내용 : ");
				String content = sc.next();
				System.out.print("글쓴이 : ");
				String writer = sc.next();
				System.out.print("비밀번호 : ");
				String password = sc.next();
				// 2. 4개 변수를 객체화
				Board board = new Board(title, content, writer, password);

				// 3. 배열 내 빈 공간을 찾아서 객체 대입
				int i = 0;
				for (Board temp : boardlist) {
					if (temp == null) {
						boardlist[i] = board;
						break;
					}
					i++;
				}
			} else if (ch == 2) { // 글보기

				System.out.println(" 게시물 번호 선택 : ");
				int bno = sc.nextInt();

				// 반복문 필요 X -> 출력할위치[ 인덱스 ] 입력 받아서 -> 인덱스 위치에 객체 불러오기
				System.out.printf("작성자 : %s 제목 : %s ", boardlist[bno].writer, boardlist[bno].title);
				System.out.printf("내용 : %s", boardlist[bno].content);
				System.out.println();
				System.out.println("------------------------------------------");
				System.out.println("1. 목록보기(뒤로가기) | 2. 글삭제 | 3. 수정하기");

				int ch2 = sc.nextInt();
				if (ch2 == 1) {

				} else if (ch2 == 2) { // ----- 삭 제 ------ 시작

					System.out.println("알림>> 현 게시물 비밀번호 : ");
					String pw = sc.next();

					if (boardlist[bno].password.equals(pw)) { // 게시물 객체 내 비밀번호 = 입력한 비밀번호

						System.out.println("알림>> 삭제 완료");
						boardlist[bno] = null; // 해당 게시물 null 변경 / 삭제처리

						// 삭제 후에 삭제된 인덱스 디로 한칸씩 앞으로 이동
						// ??? 만약 해당 코드가 없을 경우 배열 내 사이사이 공백 발생
						for (int i = bno; i < boardlist.length; i++) {

							if (i == boardlist.length - 1)
								boardlist[boardlist.length - 1] = null;
							else
								boardlist[i] = boardlist[i + 1];

						}

					} else {
						System.out.println("알림>> 삭제 실패");
					}

					// ----- 삭 제 ------ 끝
				} else if (ch2 == 3) { // -------- 수 정 ---------
					
					System.out.println("알림>> 현 게시물 비밀번호 : ");
					String password = sc.next();
					// 2. bno : 현게시물(보고있는 게시물)의 인덱스 객체 비밀번호가 입력받은 비밀번호와 동일하면
					if(boardlist[bno].password.equals(password)){
						// 해당 게시물의 제목과 내용을 새로 입력받아 대입
						System.out.println("수정할 제목 : "); boardlist[bno].title = sc.next();
						System.out.println("수정할 내용 : "); boardlist[bno].content = sc.next();
						
						System.out.println("알림>> 내용이 수정되었습니다 ");
						
					}else {
						System.out.println("알림>> 비밀번호가 다릅니다 [ 수정 실패 ] ");
					}
					
										// -------- 수 정 ---------끝
				} else {

				}

			} else {
				System.err.println("알림>> 알 수 없는 번호입니다");
			}

		} // 프로그램 실행 while end

	}
}


//for(int i=0;i<rank.length;i++) {
//	rank[i]=1;
//}
//for(int i=0;i>rank.length;i++) {
//	for(int j=0;j>rank.length;j++) {
//		if(sum[i] < sum[j]) {
//			rank[i] = rank[i]+1;
//		}
//	}
//}



