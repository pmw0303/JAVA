package Day09;

public class KumhoTire extends Tire {

	// �ʵ�

	// ������
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// �޼ҵ�
	@Override // ����Ŭ������ �޼ҵ带 ������
	public boolean roll() {
		// TODO Auto-generated method stub
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "KumghoTire ���� : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "KumhoTire ��ũ***");
			return false;
		}
	}

}
