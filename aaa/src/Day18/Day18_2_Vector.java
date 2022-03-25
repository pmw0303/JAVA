package Day18;

import java.util.Vector;

public class Day18_2_Vector {

	public static void main(String[] args) {
		
		// p730
			
		// 1. Vector 리스트객체 선언
		Vector<Board> list = new Vector<>();
		// 2. 리스트 객체 내 추가
			// 1번 사용법
		list.add(new Board("제목", "내용", "작성자"));
			// 2번 사용법
		Board board = new Board("제목2", "내용2", "작성자2");
		list.add(board);
		list.add(new Board("제목3", "내용3", "작성자3"));
		list.add(new Board("제목4", "내용4", "작성자4"));
		list.add(new Board("제목5", "내용5", "작성자5"));
		list.add(new Board("제목6", "내용6", "작성자6"));
		
		System.out.println(list);
		
		// 3. 검색 contains
		System.out.println("검색 : " + list.contains(board));
		System.out.println("위치 : " + list.indexOf(board));
		
		// 4. 삭제 remove
		list.remove(2);
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		
		// 반복문 이용한 모든 객체 출력
		for(int i=0 ; i < list.size() ; i++) {
			Board temp = list.get(i); // i 번째 객체 출력
			System.out.println(temp.제목 + "\t" + temp.내용 + "\t" + temp.작성자);					
		}
		
		// 반복문2
		System.out.println("==========================");
		for (Board temp : list) {
			System.out.println(temp.제목 + "\t" + temp.내용 + "\t" + temp.작성자);
		}
					
		
		
	}
}
