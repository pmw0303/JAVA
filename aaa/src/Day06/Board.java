package Day06;

public class Board {

	String title;
	String content;
	String writer;
	String password;
	
	Board(){
		
	}
	
	Board(String title){
		this.title = title;
	}
	
	Board(String title, String content){
		this.title = title;
		this.content = content;
	}
	
	Board(String title, String content, String writer){
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
	
	Board(String title, String content, String writer, String password){
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.password = password;
	}

	
	
	
}
