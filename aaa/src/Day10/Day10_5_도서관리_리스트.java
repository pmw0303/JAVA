package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_도서관리_리스트 {
	
	public static void main(String[] args) {
		
		// 리스트[객체] 생성
		ArrayList<Book> booklist = new ArrayList<>();
		// 리스트클래스< 리스트안에 저장할 클래스>
			// <클래스> : 해당 클래스의 여러 객체를 리스트에 저장
			// 길이(가변) : 기본 10
		
		
		while(true) {
			System.out.println("1. 등록|2. 목록|3. 삭제|4. 수정|");
			Scanner scanner = new Scanner(System.in);
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				// 입력받기
				System.out.println("도서명 : ");
				String 도서명 = scanner.next();
				System.out.println("작가 : ");
				String 작가 = scanner.next();
				// 객체화 [여러개 변수 -> 1개 객체]
				Book book = new Book(도서명, 작가);
				// 배열저장
				booklist.add(book);			
				
			}else if(ch == 2) {
				// 배열 [null 제외] vs 리스트 
				System.out.println("제목\t작가");
				for(Book book : booklist) {	
					System.out.println(book.get도서명() + "\t" + book.get작가());					
				}
			}else if(ch == 3) {
				// 리스트는 배열과 다르게 자동으로 땡겨짐
				System.out.println("삭제할 도서명 : ");
				String 도서명 = scanner.next();
				
				for(Book book : booklist) {
					if(book.get도서명().equals(도서명)) {
						booklist.remove(book);
						break;
					}
				}
				
			}else if(ch == 4) {
				System.out.println("수정할 도서명 : ");
				String 도서명 = scanner.next();
				
				for(Book book : booklist) {
					if(book.get도서명().equals(도서명)) {
						System.out.println("수정할 작가 이름 : ");
						String 작가 = scanner.next();
						book.set작가(작가);
					}
				}
				
			}
			
		}
	}

}
