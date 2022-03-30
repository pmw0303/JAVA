package Day10;

public interface RemoteControl {
	
	
	// 멤버
//		1. 상수필드 : 고정데이터
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
//		2. 추상메소드 : 선언O 구현X
	public void turnOn();
	public void turnOff();
	public abstract void setVolume(int volume);
//		3. 디폴트메소드 : 선언O 구현O
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음");
		}else {
			System.out.println("무음 해제");
		}
	}
//		4. 정적메소드 : 선언O 구현O [객체없이 가능]
	static void changeBattery() {
		System.out.println("건전지 교환");
	}
	
}
