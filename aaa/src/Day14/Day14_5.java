package Day14;

public class Day14_5 {
	
	public static void main(String[] args) {
		
		// ������, �����, ȣ���� �Ҹ� 
		// ������� -> Thread
		// 1. Thread Ŭ�����κζ� extends 
			// ���ٶ��̵� -> ������
		// 2. Runnable �������̽��κ��� implements
			// �������̵� -> ���� 
		
		// main �����尡 ���� ������ ������ ȣ��
		// Thread Ŭ�����κ��� ��ӹ��� �ڽ�Ŭ���� ȣ��
		�������Ҹ� ������ = new �������Ҹ�();
		������.start();
		����̼Ҹ� ����� = new ����̼Ҹ�();
		�����.start();
		ȣ���̼Ҹ� ȣ���� = new ȣ���̼Ҹ�();
		ȣ����.start();
	}

}
