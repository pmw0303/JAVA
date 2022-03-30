package Day10;

public class Book {

	//필드
	private String 도서명;
	private String 작가;
	
	//생성자
	public Book() {	
	}

	public Book(String 도서명, String 작가) {
		super();
		this.도서명 = 도서명;
		this.작가 = 작가;
	}

	//메소드

	public String get도서명() {
		return 도서명;
	}

	public void set도서명(String 도서명) {
		this.도서명 = 도서명;
	}

	public String get작가() {
		return 작가;
	}

	public void set작가(String 작가) {
		this.작가 = 작가;
	}
	
}
