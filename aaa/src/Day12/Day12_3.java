package Day12;

import java.io.IOException;

public class Day12_3 {
	
	public static void main(String[] args) throws IOException {
		
		// 도서 검색 프로그램
					// [조건]
					// 1. 입력받기 [ System.in.read() ]
					// 2. String 배열내 여러 도서가 저장 
						//		String[] 도서목록 = {	
						//			"된다! 네이버 블로그&포스트",
						//			"스프링 부트 실전 활용 마스터",
						//			"Tucker의 Go 언어 프로그래밍",
						//			"혼자 공부하는 C 언어"
						//};
					// 3. 검색기능 , 수정기능 
						// 검색기능 : 특정 문자를 입력받아 도서내 포함된 문자가 있으면 모두 출력 
							// '언어' 검색 ->  "Tucker의 Go 언어 프로그래밍" / "혼자 공부하는 C 언어"
						// 수정기능 : 수정할 도서명의 일부를 입력받아 출력된 도서명중 번호를 선택 
							// '수정' 수정 -> 선택된 도서명의 수정할 문자와 새로운 문자 입력받아 ->  수정 완료 
		
		String[] book = {"된다! 네이버 블로그&포스트", "스프링 부트 실전 활용 마스터", 
							"Tucker의 Go 언어 프로그래밍", "혼자 공부하는 C 언어"};
			
		while (true) {
			System.out.println("1.검색 | 2.수정");
			byte[] bytes = new byte[100]; // 키보드로부터 [스트림] 바이트를 읽어오기 / 일반 예외
			int count = System.in.read(bytes); // 바이트배열 --> 문자열 변환 [-2 = \n\r 제거]
			String ch = new String(bytes, 0, count - 2);

			if (ch.equals("1")) {
				System.out.println("제목 검색");
				count = System.in.read(bytes);
				String search = new String(bytes, 0, count - 2);

				System.out.println("검색 결과");
				for (String temp : book) {
					// 방법 1
//					if(temp.indexOf(search) != -1) {
//						// 동일한 단어가 없을 경우
//						System.out.println(temp); 
//					}
//				}				
					if (temp.contains(search)) {
						System.out.println(temp);

					}

				}

			} else if (ch.equals("2")) {
				System.out.println("수정할 책이름[일부]");
				count = System.in.read(bytes); // 키보드로부터 바이트 읽어서 배열 저장
				String bt = new String(bytes, 0, count - 2);
				// 0번인덱스 바이트부터 -2 제외한 인덱스까지
				int i = 0;
				for (String temp1 : book) {
					if (temp1.contains(bt)) {
						System.out.println(i + "번 책" + bt);
					}
					i++;
				}
				System.out.println("도서번호 입력");
				count = System.in.read(bytes);
				String ch2 = new String(bytes, 0, count - 2);
				int index = Integer.parseInt(ch2);
				System.out.println("기존문자");
				count = System.in.read(bytes);
				String oldStr = new String(bytes, 0, count - 2);

				// 수정할 내용 입력받기
				System.out.println("바꿀문자");
				count = System.in.read(bytes);
				String newStr = new String(bytes, 0, count - 2);

				book[index] = book[index].replace(oldStr, newStr);
				// ****** 저장을 다시 해줘야 변경된다
				System.out.println("변경완료");

			}
		}
	}
}
