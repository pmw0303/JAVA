package Day11;

public class Reply {
	
	// �ʵ�
	private String content;
	private String pw;
	private String writer;
	private String Date;
		
	// ������
		// �������
	public Reply() {
		
	}
		// Ǯ������

	public Reply(String content, String pw, String writer, String date) {
		super();
		this.content = content;
		this.pw = pw;
		this.writer = writer;
		Date = date;
	}
	
		// ��� ��� �� ���Ǵ� ������
	public Reply(String content, String pw, String writer) {
		super();
		this.content = content;
		this.pw = pw;
		this.writer = writer;
	}

	
	// �޼ҵ�
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

	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	

}
