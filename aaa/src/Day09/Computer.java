package Day09;

public class Computer extends Calculator {
	// ���� Ŭ���� extends ����Ŭ����
	// �ʵ�

	// ������

	// �޼ҵ�
	// **�������̵� [ �θ�Ŭ������ �޼ҵ� ������(����) ]
	// ctrl + space bar -> ����
	
	@Override // ��ӹ��� �θ� ������ �ִ� �޼ҵ� ȣ��
	double areaCircle(double r) {
		// TODO Auto-generated method stub
		System.out.println("Computer ��ü�� areaCircle");
		return Math.PI * r * r;
	}

}
