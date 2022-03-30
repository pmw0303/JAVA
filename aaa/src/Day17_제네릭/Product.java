package Day17_제네릭;

public class Product<타입1, 타입2> {
				// 외부로부터 받을 자료형
	// 필드
	private 타입1 kind;
	private 타입2 model;
	
	public static <타입1> Box<타입1> boxing(타입1 kind){
		// 메소드 선언
		// 접근제한자 정적  반환타입 = <타입1> Box<타입1> boxing(타입)
		
		Box<타입1> box = new Box<>();
		box.set(kind);
		
		return box;
	}
	
	// get, set
	public 타입1 getKind() {
		return kind;
	}
	public void setKind(타입1 kind) {
		this.kind = kind;
	}
	public 타입2 getModel() {
		return model;
	}
	public void setModel(타입2 model) {
		this.model = model;
	}
	
	

}
