package Day11;

import java.util.Scanner;

import Day08.C;

public class Day11_4_BoardApp {

//	비회원 게시판/댓글 프로그램 [예외처리, 파일처리, 리스트]
//		m - 게시물 클래스
	// 제목, 내용, 비밀번호, 작성자, 작성일, 조회수, 댓글리스트
//		m - 댓글 클래스
	// 내용, 비밀번호, 작성자, 작성일
//		c - 컨트롤러 클래스
	// 1. 목록 2. 쓰기 3. 보기 4. 수정 5. 삭제 6. 댓글쓰기
	// 7. 게시물저장 8. 게시물불러오기 9. 댓글저장 10. 댓글불러오기
//		v - Day11_4_BoardApp
	// 컨트롤러 메소드 호출

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Controller.load(); // 파일 [모든 게시물] 불러오기
		
		while (true) {
			try { // 예외 발생 : 사용자 문자 입력 시 예외발생 -> catch 이동
				
				// 모든 게시물 출력 
				System.out.printf("%s\t%s\t%s\t%s\t%s\t \n", 
						"번호", "제목", "작성자", "작성일", "조회수" );
				int i=0;
				for(Board board : Controller.boadlist) {
					System.out.printf("%d\t%s\t%s\t%s\t%s\t \n", 
							i, board.getTitle(), board.getWriter(), board.getDate(), board.getViewcount() );
					i++;
				}
				
				System.out.println("1.쓰기 2.보기 선택");
				int ch = sc.nextInt();
				if (ch == 1) {
					System.out.println(" *** 게시물 등록 ***"); 
						// nextLine() : 공백 포함 가능 but 앞에 next가 있으면 하나취급
						// 해결 : 일반 next 와 nextLine 사이에 nextLine()
					sc.nextLine();
					System.out.println(" 제목 : "); 
					String 제목 = sc.nextLine();
					System.out.println(" 내용 : ");
					String 내용 = sc.nextLine();
					System.out.println(" 작성자 : ");
					String 작성자 = sc.next();
					System.out.println(" 비밀번호[수정/삭제시] : ");
					String 비밀번호 = sc.next();
					Controller.write(제목 , 내용 , 작성자 , 비밀번호);

				} else if (ch == 2) {
					// 해당 게시물 번호[인덱스] 를 입력받아 게시물정보 모두 출력
					System.out.println("게시물 번호 : ");
					int index = sc.nextInt();
					Board temp = Controller.boadlist.get(index); // 해당 인덱스 객체를 임시 객체
					System.out.println("*** 게시물 보기 ***");
					System.out.println("제목 : " + temp.getTitle());
					System.out.println("작성자 : " + temp.getWriter());
					System.out.println("내용 : " + temp.getContent());					
					
					// 메뉴
					System.out.println("1.뒤로가기 2.수정 3.삭제 4.댓글쓰기 선택");
					int ch2 = sc.nextInt();
					if(ch2==1) {			
					}else if(ch2==2) {
						System.out.println("게시물 비밀번호 : "); String pw = sc.next();
						sc.nextLine();
						System.out.println("변경 제목 : "); String title = sc.nextLine();
						System.out.println("변경 내용 : "); String content = sc.nextLine();		
						Controller.update(index, pw, title, content);
						boolean result = Controller.update(index, pw, title, content);
						if(result) {
							System.out.println("알림>> 수정 성공");
						}else System.out.println("알림>> 수정 실패");
						
					}else if(ch2==3) {
						System.out.println("비밀번호 입력 : ");
						String pw = sc.next();
						boolean result = Controller.delete(index, pw);
						if(result) {
							System.out.println("삭제성공");
						}else System.out.println("삭제실패");
						Controller.delete(index, pw); // 삭제할 인덱스번호, 패스워드 -> 인수					
					}else if(ch2==4) {
						Controller.replywrite(); // 인덱스번호, 댓글내용, 댓글비밀번호, 댓글작성자 -> 인수
					}else { }
					
					
					

				} else {
					
				}
			} catch (Exception e) {
				System.err.println("알림>> 다시 입력하세요");
				sc = new Scanner(System.in); // 다시 메모리 할당
			}
		}
	}

}
