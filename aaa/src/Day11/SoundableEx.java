package Day11;

public class SoundableEx {

	private static void printSound(Soundable soundable) {
	// 접근제한자 정적 반환타입 메소드명(인수[변수, 배열, 객체, 인터페이스])
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
