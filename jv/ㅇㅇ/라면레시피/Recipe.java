package 라면레시피;

public class Recipe {
	
	// 필드
	
	String name; // 이름
	String water; // 물 양
	String time; // 시간
	String plus; // 추가재료
	
	// 생성자 
	
	public Recipe(String name, String water, String time, String plus) { // 입력받을 수 있는 생성자 생성
		super();
		this.name = name;
		this.water = water;
		this.time = time;
		this.plus = plus;
		// 구분 하기 위해 this로 선언
	}
	
	// 메소드
	
	
	
}
