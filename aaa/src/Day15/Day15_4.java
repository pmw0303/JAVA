package Day15;

public class Day15_4 {

	// 12�� : ������ - �ڵ� �о��ִ� ����
		// �ڵ� -> ���� -> ���μ���
		// ���� : ����ó��
			// main�޼ҵ忡 main������ ����
		// �����
			// 1. Thread Ŭ����
			// 2. Runnable Ŭ����
		// run �޼ҵ� : ��Ƽ�������� �����ڵ�
	
	public static void main(String[] args) {
		// ex1) Thread Ŭ������ �̿��� ����ó�� ��ü �����
		���� m1 = new ����();
		m1.start(); // run�޼ҵ� ����
		// ex2) Runnable �������̽��� �̿��� ����ó�� ��ü
		ä�� c1 = new ä��();
		// c1.start(); - �������̽��� start() �޼ҵ带 ������ ���� ����
		Thread thread = new Thread(c1);
		thread.start();
		
		while(true) {
			System.out.println("���α׷� �۵���");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
		
	}
}
