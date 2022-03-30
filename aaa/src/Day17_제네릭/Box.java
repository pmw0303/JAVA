package Day17_제네릭;

public class Box<T> {
			// 제네릭 타입
	
	private T t;
	// 변수명 처럼 아무거나
	
	public T get() {
		return t;
	}
	
	public void set(T t) {
		this.t = t;
	}
}
