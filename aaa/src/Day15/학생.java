package Day15;

public class 학생 extends 사람{
	
	// 필드
	String name;
	
	// 생성자
	public 학생(String name) {
		super(name);
		this.name = name;
	}
	
	// 메소드
	@Override // 부모클래스 내 동일한 메소드 이름 
	public void 이름호출() {
		System.out.println("자식 : " + this.name + "[this]");
		// 상속 받으면 현클래스에 없는 필드가
		// 부모클래스에 존재하면 사용가능
		System.out.println("자식 : " + super.name + "[super]");
	}

}
