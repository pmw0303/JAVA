package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.xml.transform.Templates;



public class Controller {
	
	// 게시물 리스트
	public static ArrayList<Board> boadlist =
			new ArrayList<>();
	
	// 모든 메소드는 static

	// 1. 목록
	public static void boardlist() {

	}
	// 2. 쓰기
	public static void write(String title, String content, String pw, String writer) {
		// 객체화 -> 변수가 4개 / 1개 객체 [관리쉬움]
		Board board = new Board(title, content, pw, writer);
		// 리스트에 저장
		boadlist.add(board);
		// 파일에 저장
		save();
	}
	
	// 4. 수정
	public static boolean update(int index, String pw, String title, String content) {
		if(pw.equals(boadlist.get(index).getPw())) {
			boadlist.get(index).setTitle(title);
			boadlist.get(index).setContent(content);
			save();
			return true;
		}else {
			return false;
		}
	}
	// 5. 삭제
	public static boolean delete(int index, String pw) {
		if(pw.equals(boadlist.get(index).getPw())) {
			// 입력받은 패스워드와 해당 게시물 인덱스 번호가 같으면
			boadlist.remove(index); // add() : 추가 / get() : 호출 / remove() : 삭제
			save();
			return true;
		}else return false;
		
	}
	// 6. 댓글쓰기
	public static void replywrite() {

	}
	// 7. 게시물 저장
	public static void save() { // 리스트 내에 모든 게시물을 파일에 저장
		try {
			// 파일 출력 클래스
			FileOutputStream outputStream = new FileOutputStream("D:/java/게시물파일.txt");
			// 파일에 작성할 내용 [한줄씩] / 게시물 1개 = 객체 1개
			for(Board board : boadlist) {
				String 작성내용 = board.getTitle() + "," + board.getContent() + "," + 
								board.getPw() + "," + board.getWriter() + "," +
								board.getViewcount() + "," + board.getDate() + "\n";
				
				// 내용 [문자열] -> 바이트열 변환
				// 내보내기
				outputStream.write(작성내용.getBytes());
			}		
		}
		catch(Exception e) {
			System.err.println("알림>> 파일 저장 실패");
		}
	}
	// 8. 게시물 불러오기 / 프로그램 시작 : 파일 -> 리스트
	public static void load() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/java/게시물파일.txt"); // 1. 파일입력클래스 
			byte[] bytes = new byte[1000]; // 2. 바이트배열 선언
			inputStream.read( bytes ); // 3. 모든 바이트 읽어와서 바이트에 저장 
			String file = new String( bytes ); // 4. 바이트 -> 문자열 변환 
			String[] boards = file.split("\n"); // 5. 문자열 자르기 [ 한줄씩 [ \n ] -> 1개객체 ] 
			
			int i=0;
			for( String temp : boards ) { // 배열내 문자열 하나씩 꺼내기 			
				if( i+1 == boards.length) break;
				String[] field = temp.split(","); // 6. 문자열 자르기 [ 한줄 [,] -> 각필드 ] 
				Board board = new Board( field[0], field[1],
						field[2], field[3], Integer.parseInt(field[4]),field[5], null);  // 7. 객체화 
										// 조회수는 필드는 정수형이므로 정수형으로 형변환 [ Integer.parseInt( 문자열 ) ]
				boadlist.add(board);// 8. 리스트 담기 
				i++;
			}
		} catch (Exception e) {
			System.err.println("알림>> 파일 로드 실패"); // \n 으로 나누기 때문에 오류나옴 / 마지막에 공백
		}
	}
	// 9. 댓글저장
	

	// 10. 댓글 불러오기
	

}
