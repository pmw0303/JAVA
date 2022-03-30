package Day16_제네릭;

public class Box {

	private Object object; // 슈퍼클래스
	
	public void set(Object object) {
		this.object = object;
	}
	public Object get() {
		return object;
	}
	
}
