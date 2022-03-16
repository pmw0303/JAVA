package Day11;


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Board {

	// 필드
	private String title;
	private String content;
	private String pw;
	private String writer;
	private int viewcount;
	private String date;
	private ArrayList<Reply> replylist = new ArrayList<>();
	
	// 생성자
		// 빈생성자
	public Board() {
	}
		// 게시물 등록 시 사용되는 생성자 [날짜 자동주입]
	public Board(String title, String content, String pw, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.pw = pw;
		Date date = new Date(); // 날짜 객체 생성         y-년 M-월 d-일 h-시 m-분 s-초
		SimpleDateFormat format = new SimpleDateFormat("MM-dd");
		this.date = format.format(date);
					// 객체명.포맷(날짜) -> 해당 날짜가 format 설정한 패턴으로 문자형 변환
	}
	
	// 풀생성자
	public Board(String title, String content, String pw, String writer, int viewcount, String date,
			ArrayList<Reply> replylist) {
		super();
		this.title = title;
		this.content = content;
		this.pw = pw;
		this.writer = writer;
		this.viewcount = viewcount;
		this.date = date;
		this.replylist = replylist;
	}
		
	// 메소드
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public int getViewcount() {
		return viewcount;
	}
	public void setViewcount(int viewcount) {
		this.viewcount = viewcount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public ArrayList<Reply> getReplylist() {
		return replylist;
	}
	public void setReplylist(ArrayList<Reply> replylist) {
		this.replylist = replylist;
	}
	
}
