package Day07;

public class Book {
	// 필드
	String ISBN;
	String bname;
	String bwriter;
	boolean brent;
	String mid;

	// 생성자

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String iSBN, String bname, String bwriter, Boolean brent, String mid) {
		super();
		ISBN = iSBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brent = brent;
		this.mid = mid;
	}
	
	
	
	// 메소드
	
	// 1. 도서검색
	void 도서검색() {
		
		System.out.println("검색할 도서 제목 입력 : ");
		String bname = Day07_5_BookApplication.sc.next();
		
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.bname.equals(bname)) {
				System.out.println("검색한 책 " + bname +" 이(가) 있습니다");
				return;
			}
		}
		System.out.println("책이 존재하지 않습니다");
		
	}
	
	// 2. 도서목록
	void 도서목록() {
		
		System.out.println("--------도서 목록 페이지---------");
		System.out.println("ISBN\t도서명\t작가\t대여여부");
		
		for (Book temp : Day07_5_BookApplication.books) {
			if (temp != null) { // 도서가 존재하면 **
				if (temp.brent) { // 대여가 가능
					System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "대여가능");
				} else // 대여가 불가
					System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "대여중");
			}
		}
	}
	
	// 3. 도서대여
	void 도서대여(String loginid) {
		
		System.out.println("--------도서 대여 페이지---------");
		System.out.println("대여할 책 ISBN 입력 : ");
		
		String isbn = Day07_5_BookApplication.sc.next();
		
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(isbn)  ) {
										// true
				if (temp.brent) {
					System.err.println("알림>> 해당 대여되었습니다");
					temp.brent = false;
					temp.mid = loginid;
					return;
				} else {
					System.err.println("알림>> 대여가 불가능합니다");
					return;
				}
			}
		}
		System.out.println("알림>> 해당 도서가 존재하지 않습니다.");
	}
	
	// 4. 반납
	void 도서반납(String loginid) {
		System.out.println("--------도서 반납 페이지---------");
		도서대여목록(loginid);
		System.out.println("도서 ISBN "); String isbn = Day07_5_BookApplication.sc.next();
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(isbn)) {
				if(temp.mid.equals(loginid)) {
					if(temp.brent) {
						System.out.println("알림>> 현재 도서가 대여중이 아닙니다");
					}else {
						System.out.println("알림>> 반납 완료");
						temp.brent = true;
						temp.mid = null;
						return;
					}
				}else {
					System.out.println("알림>> 회원님이 대여한 도서가 아닙니다");
				}
			}
		}
		System.out.println("알림>> 동일한 도서ISBN이 없습니다");
	}
	
	
	void 도서대여목록(String loginid) {
		System.out.println("--------도서 목록 페이지---------");
		System.out.println("ISBN\t도서명\t작가\t대여여부");
		
		for (Book temp : Day07_5_BookApplication.books) {
			if (temp != null && temp.mid.equals(loginid)) { // 도서가 존재하면 **
			// 도서가 존재하면서 대여 id 와 현재 로그인된 id와 같으면
				System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "대여중");

			}
		}
	}
	
	// 5. 등록
	void 도서등록() {
		
		System.out.println("--------도서 등록 페이지---------");
		// 1. 입력받기
		System.out.println("ISBN : "); String isbn = Day07_5_BookApplication.sc.next();
		System.out.println("도서명 : "); String bname = Day07_5_BookApplication.sc.next();
		System.out.println("작가 : "); String bwriter = Day07_5_BookApplication.sc.next();
		
		// 중복체크 ISBN
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(isbn)) {
				System.err.println("알림>> 이미 존재합니다 [ 등록실패 ] ");
				return;
			}
		}
		
		
		// 2. 객체화 [ 대여여부 = true, 대여회원id = null ]
		Book book = new Book(isbn, bname, bwriter, true, null);
		
		// 3. 배열 대입[ 넣기 ]
		int i = 0;
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp == null) {
				Day07_5_BookApplication.books[i] = book;
				System.err.println("알림>> 도서가 등록되었습니다");
				return;
			}
			i++;
		}
	}
	
	// 6. 삭제
	void 도서삭제() {
		
	}
	
}
