package Day07;

public class Calculator {
	
	// Ŭ���� ����
	
	// 1. �ʵ�
	
	// 2. ������

	// 3. �޼ҵ�
	
	void powerOn() {
		System.out.println("���� ����");
	}
	// 1. void : ����Ÿ��
		// 
	// 2. powerOn : �޼ҵ� �̸�[�ƹ��ų�]
	// 3. (�Ű�����[�μ�]) : �Լ��� ������ ������
	// 4. { } : �Լ� �����
	
	
	int plus(int x, int y) {
		int result = x+y;
		return result;
		
	}
	// 1. int : ����Ÿ�� [ �Լ��� ����Ǹ鼭 int�� �����Ͱ� ��ȯ]
	// 2. plus : �޼ҵ��̸�[ �ƹ��ų� ]
	// 3. ( int x, int y) : int�� 2�� �Ű����� �ޱ�
		// �Լ� ȣ��� �Լ��� ������ x ��  y �� int ������ �ޱ�
	// 4. ����� {}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	
}


