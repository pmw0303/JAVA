package Day18;

public class Board {
	
	String 제목;
	String 내용;
	String 작성자;
	
	public Board(String 제목, String 내용, String 작성자) {
		super();
		this.제목 = 제목;
		this.내용 = 내용;
		this.작성자 = 작성자;
	}
	
	public String get제목() {
		return 제목;
	}
	public void set제목(String 제목) {
		this.제목 = 제목;
	}
	public String get내용() {
		return 내용;
	}
	public void set내용(String 내용) {
		this.내용 = 내용;
	}
	public String get작성자() {
		return 작성자;
	}
	public void set작성자(String 작성자) {
		this.작성자 = 작성자;
	}
	
	
}
