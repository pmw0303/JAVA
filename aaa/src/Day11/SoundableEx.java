package Day11;

public class SoundableEx {

	private static void printSound(Soundable soundable) {
	// ���������� ���� ��ȯŸ�� �޼ҵ��(�μ�[����, �迭, ��ü, �������̽�])
		System.out.println(soundable.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
