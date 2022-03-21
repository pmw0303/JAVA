package Day14;

import java.awt.Toolkit;

public class Day14_4 {
	
	public static void main(String[] args) {
		
		// p576 ��Ƽ������
			// ���μ��� : �ü������ ���� ���� �ϳ��� ���ø����̼�
			// �ü���� ���μ��� �ʿ��� �޸� �Ҵ� [�ڹٿ��� �޸� ����X �ü��O]
			// �̱� ������ : �ڵ� �о��ִ� �帧 1 ��
			// ��Ƽ ������ : �ڵ� �о��ִ� �帧 ���� ��
			// ���� : ����� �����帧������ �����尡 �ϳ��� ó��(�켱������ �ü���� �Ҵ�)	
			// Thread Ŭ����
				// 1. ���� Ŭ������ extends Thread
				// 2. run() �޼ҵ� �������̵�[������]
				// 3. ��ü ����	
				// 4. ��ü.start()
					// start() �޼ҵ� ȣ�� �� run �޼ҵ� ����
			// Runnable Ŭ����
				// 1. ����Ŭ������ implements Runnable
				// 2. run �޼ҵ� ����
				// 3. �ܺο��� ������ü ����
				// 4. Thread Ŭ���� ��ü ���� �� �����ڿ� ������ü �־���
				// 5. Thread Ŭ���� ��ü �� start() �޼ҵ� ����
				// ** .start() �޼ҵ�� run() �޼ҵ� ȣ��
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0 ; i<5 ; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
				
			} catch (Exception e) {
				// TODO: handle exception
			}
							
		}
			
		for(int i=0 ; i<5 ; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("----------�̱۽�����----------------");	
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();
		
		for(int i=0 ; i<5 ; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
			
		// p584
		
		Thread thread2 = new BeepThread();
		thread2.start();
		
		for(int i=0 ; i<5 ; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		System.out.println("-----------��Ƽ������---------------");		
		
		// �������̽� 
			// 1. Ŭ�������� implements �� �Ŀ� ���� -> ���� ��ü
			// 2. �������̽��� new �����ڸ� ���� �߻�޼ҵ� ���� -> �͸� ��ü
		
		
		// �͸� ������
		Runnable runnable = new Runnable() {
			// �������̽��� new 
			// �޸� �Ҵ��ϱ� ���� �߻�޼ҵ� ���� ����
			// �߻�޼ҵ带 ���� ���ϸ� �͸�ü ���� �Ұ�
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=0 ; i<5 ; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
				}
				Thread thread3 = new Thread();
				thread3.start();
				
			}
		};
		for(int i=0 ; i<5 ; i++) {
			System.out.println("��");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		System.out.println("-----------��Ƽ������ �͸�ü---------------");	
		
		System.out.println("MAIN�޼ҵ� �ȿ� �ִ� ������ �̸� : " + Thread.currentThread().getName());
			// Thread.currentThread() : �� �ڵ带 �о��ִ� ������ ȣ��
				// .getName() : ������ �̸� ȣ�� // setName() : ������ �̸� ����
		System.out.println("�۾� ������ �̸� : " + thread.getName());
		System.out.println("�۾� ������ �̸� : " + thread2.getName());
	
		
		
		
	}

}
