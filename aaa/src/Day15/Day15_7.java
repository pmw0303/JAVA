package Day15;

import java.awt.Toolkit;

public class Day15_7 {
	
	public static void main(String[] args) throws Exception{
		
		// p601 
			// 1. sleep() : �־��� �ð����� �Ͻ� ����
				// �ð����� : �и��� - 1000���� 1��
				// �Ϲ� ���� �߻� : �Ͻ����� ���¿��� �־��� �ð��� �Ǳ����� ������
			// 2. Thread.yield() : �ٸ� �����忡�� ���� �纸
			// 3. Thread.join() : �ٸ� �������� ���Ḧ ��ٸ�
			
		// p602 sleep ����
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
//		for(int i=0 ; i<2 ; i++) {
//			toolkit.beep(); // �Ҹ����� [�Ҹ� 1�� ���õ��� for�� ����]
//			System.out.println("�Ҹ�");
//			Thread.sleep(3000); // �и������� ���� => 3��
//		}
//		
//		ThreadA threadA = new ThreadA();
//		ThreadB threadB = new ThreadB();
//		// ������ ����
//		threadA.start();
//		threadB.start();
//		// 3�ʰ� �Ͻ� ����
//		try {Thread.sleep(3000); } catch(Exception e) {}
//		threadA.work = false;
//		// ������ A�� work �� ���� : A -> B -> A,B ���� �ϴٰ� ����
//		try {Thread.sleep(3000); } catch(Exception e) {}
//		threadA.work = true;
//		
//		try {Thread.sleep(3000);} catch(Exception e) {}
//		threadA.stop = true;
//		threadB.stop = true;
		
		// p607 join
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();
		} catch (Exception e) {
			
		}
		System.out.println("1~100 ������ �� : " + sumThread.getSum());
		// join ���� ��� : 0
			// sumThread�� ���ϱ⸦ ������ ���� main������ ���
		// join ���� ��� : 5050
			// 
	}

}
