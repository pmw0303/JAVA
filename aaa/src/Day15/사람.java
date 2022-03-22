package Day15;

public class 사람 extends 직업{

	// 필드
	String name;
	
	// 생성자
	public 사람(String name) {
		this.name = name;
	}
	
	// 메소드
	public void 이름호출() {
		System.out.println("부모 : " + this.name);
	}
}
