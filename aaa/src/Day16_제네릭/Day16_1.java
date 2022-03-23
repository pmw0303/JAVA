package Day16_제네릭;

public class Day16_1 {

	public static void main(String[] args) {
		
		// 제네릭
		
		// p656 비 제네릭 예1
		
		// 1. Box 객체 생성
		Box box = new Box();
		// 2. 객체내 메소드 호출
		box.set("홍길동");
		// 3. 객체내 메소드 호출
		String name = (String)box.get(); // String -> Object 가능 
		// but 지금은 Object를 String 하려고함 따라서 강제 형변환 해줘야함
		// box.get() -> (String)box.get()

		// 4. 
		box.set(new Apple()); // Apple을 넘기는건 가능 
		Apple apple =(Apple) box.get(); // but box를 Apple에 넣는 것은 안됨 *형변환
		// box.get() -> (Apple) box.get()
	}
	
}
