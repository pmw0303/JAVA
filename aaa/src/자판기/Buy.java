package ���Ǳ�;

import java.util.Random;

public class Buy extends Thread {
	
	String �����̸�;
	private boolean stop;
	
	public void setStop (boolean stop) { // ���ᱸ�� ������ ����޼ҵ�
		this.stop = stop ;
	}
	
	public Buy(String �����̸�) { // ������ ��ü ������ �����ڰ��� ���� �ٸ� �۾��� ����ǵ��� ����
		this.�����̸� = �����̸�;
	}
	
	@Override
	public synchronized void run() { // ���ν������ ���� ����� ������
		try {Thread.sleep(5000);}catch(Exception e) {} // ��ǻ�� ����Ȱ�� 5������ ����
		while(!stop) { // ������ ���� ���� ��� ���� stop ���
			Music ���� = new Music("����.mp3",false); // ���ǰ�ü ����(��ǻ�Ͱ� ���ſ� ������ ���)
			if(Controller.���Ƚ��>=4) { // ���Ƚ�� 4ȸ �̻�� ������ �����Ŵ
				break;
			}
			if(�����̸�=="�ݶ�") { // Buy ��ü ������ �����ڿ� ���� ��������
				Random random = new Random(); // ������ü ����	
				int buy = random.nextInt(2)+1; // ��ǻ�Ͱ� ������ ���� �������� ����
				if (Controller.�ݶ� < buy) { // ������ ������ ����� �������
					Controller.���Ƚ�� += 1; // ��� 1ȸ ����
					Controller.�޽���.add(0,"���) �ݶ� �����Ͽ� �Ǹ����� ���߽��ϴ�"); // ���޽��� �޽��� ����Ʈ�� ����
					if(Controller.�޽���.size()>=8) { // ����Ʈ�� ���ڿ� ���� ���� ������ ���� �ε����� ��ü ����(ȭ������� 0~4�ε��������� ����)
						Controller.�޽���.remove(5);//�ε����� ��ü�� ���� ���������� ��ǻ�Ͱ� ���� �޼����� ���� �Ҷ����� ����� 
					}
				}
				else { // �������� ������ ���Ű����� ����� ������� (���ż��������ϰ��)
					Controller.�ݶ� -= buy; // �ݶ� ��� ����
					Controller.�ڱ� += buy*400 ; // �����ȸ�ŭ �ڱ� ����
					Controller.�޽���.add(0,"�ݶ� " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*400 + "��"); // ������ ���ڿ� �ݾ� �޽��� ����Ʈ�� ����
					����.start(); // ���� �������� ���
					if(Controller.�޽���.size()>=8) { // ����Ʈ�� ���ڿ� ���� ���� ������ ���� �ε����� ��ü ����(ȭ������� 0~4�ε��������� ����)
						Controller.�޽���.remove(5); //�ε����� ��ü�� ���� ���������� ��ǻ�Ͱ� ���� �޼����� ���� �Ҷ����� ����� 
					}
				}
					try {Thread.sleep(2000-Controller.�ð�����*50);}catch(Exception e) {} // �ð����� ������ ���� �ӵ�����
											//int�ð�����=5�ʰ���� 1����
			}
			else if(�����̸�=="ȯŸ") { // ȯŸ ���� ������ (�ݶ�� ������ ����)
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Controller.ȯŸ < buy) {
					Controller.���Ƚ�� += 1;
					Controller.�޽���.add(0,"���) ȯŸ�� �����Ͽ� �Ǹ����� ���߽��ϴ�");
					if(Controller.�޽���.size()>=8) {
						Controller.�޽���.remove(5);
					}
				}
				else {
					Controller.ȯŸ -= buy;
					Controller.�ڱ� += buy*300 ;
					Controller.�޽���.add(0,"ȯŸ " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*300 + "��");
					����.start();
					if(Controller.�޽���.size()>=8) {
						Controller.�޽���.remove(5);
					}
				}
				try {Thread.sleep(2000-Controller.�ð�����*50);}catch(Exception e) {}
			}
			else if(�����̸�=="���̴�") { // ���̴� ���� ������ (�ݶ�� ������ ����)
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Controller.���̴� < buy) {
					Controller.���Ƚ�� += 1;
					Controller.�޽���.add(0,"���) ���̴ٰ� �����Ͽ� �Ǹ����� ���߽��ϴ�");
					
					if(Controller.�޽���.size()>=8) {
						Controller.�޽���.remove(5);
					}
				}
				else {
					Controller.���̴� -= buy;
					Controller.�ڱ� += buy*200 ;
					Controller.�޽���.add(0,"���̴� " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*200 + "��");
					����.start();
					if(Controller.�޽���.size()>=8) {
						Controller.�޽���.remove(5);
					}
				}
				try {Thread.sleep(2000-Controller.�ð�����*50);}catch(Exception e) {}
			}
			else if(�����̸�=="�����") { // ����� ���� ������ (�ݶ�� ������ ����)	
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Controller.����� < buy) {
					Controller.���Ƚ�� += 1;
					Controller.�޽���.add(0,"���) ������� �����Ͽ� �Ǹ����� ���߽��ϴ�");
					
					if(Controller.�޽���.size()>=8) {
						Controller.�޽���.remove(5);
					}
				}
				else {
					Controller.����� -= buy;
					Controller.�ڱ� += buy*1500 ;
					Controller.�޽���.add(0,"����� " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*1500 + "��");
					����.start();
					if(Controller.�޽���.size()>=8) {
						Controller.�޽���.remove(5);
					}
				}
				try {Thread.sleep(2000-Controller.�ð�����*50);}catch(Exception e) {}
			}
		}
			
	}

}

