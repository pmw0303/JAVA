package Day09;

public class HankookTire extends Tire {

	// �ʵ�

	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// �޼ҵ�
	@Override // ����Ŭ������ �޼ҵ带 ������
	public boolean roll() {
		// TODO Auto-generated method stub
		accumulatedRotation++;
		if (accumulatedRotation < maxRotation) {
			System.out.println(location + "HankookTire ���� : " + (maxRotation - accumulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "HankookTire ��ũ***");
			return false;
		}
	}
}
