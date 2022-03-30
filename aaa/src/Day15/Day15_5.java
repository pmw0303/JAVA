package Day15;

public class Day15_5 {

	public static void main(String[] args) {
		
		// p591 동기화
			// 멀티스레드 사용시 동기화 선택
			// 여러개 스레드 동일한 메소드 호출
			// 동시다발적으로 하나의 메소드 호출
		
		Cal 계산기 = new Cal();
		
		User1 user1 = new User1();
		user1.setCal(계산기);
		user1.start();
		
		User2 user2 = new User2();
		user2.setCal(계산기);
		user2.start();
	}
}
