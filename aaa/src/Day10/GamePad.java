package Day10;

public interface GamePad {

	// 1. 상수필드
	// 2. 추상 메소드
	public void Abtn(); 
	public void Bbtn();
	public void Cbtn();
			
	// 3. 디폴트 메소드
	default void GamePadEnd() {
		System.out.println("게임패드 종료");
	}
	static void Charge() {
		System.out.println("충전중");
	}
	// 4. 정적 메소드
}
