package Day07;

public class Car2 {

	// �ʵ�
	int speed;
	
	// ������
		// ������ ������ �⺻ ������ �߰�
	
	// �޼ҵ�
	// 1. ���� �ʵ尪 ��ȯ���ִ� �޼ҵ�
	int getSpeed() {
		return speed;
	}
	// 2. ��� �޼ҵ�
	void keyTurnOn() { // �μ� X, ��ȯ X
		System.out.println("Ű�� �����ϴ�.");
	}
	// 3. ���ǵ� ���� �޼ҵ� [ �ִ� 50���� 10�� ���� �ݺ� ]
	void run() { // �μ� X, ��ȯ X
		for(int i=10; i<=50 ; i+=10) {
			// i�� 10���� 50���� 10�� �����ϸ� �ݺ� -> 5ȸ
			speed = i;
			System.out.println("�޸��ϴ�.(�ü� : " + speed + "km/h)");
		}
	}
}
