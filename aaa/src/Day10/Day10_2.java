package Day10;

public class Day10_2 {
	public static void main(String[] args) {
		
		// �������̽� 
			// ���� : ������ �����Ͽ� ������ ����� ����
		
		// 1. �������̽� ��ü ����
		RemoteControl rc;
		
		// 2. �������̽��� �ڷ����� Ŭ���� �޸� �Ҵ�
		rc = new Television();
		// 3. �������̽� ����
		rc.turnOn(); // tv����
		rc.turnOff(); // tv����
		rc.setVolume(10);
		
		RemoteControl rc1;
		
		rc1 = new Audio();
		
		rc1.turnOn();
		rc1.turnOff();
		rc1.setVolume(5);
		
		
		// *** Ŭ���� ���� �߻� �޼ҵ� ���� *** �͸�����ü
		RemoteControl rc2 = new RemoteControl() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("������ �մϴ�");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("������ ���ϴ�");
			}
			
			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				System.out.println("���� ���� : " + volume);
			}
		};
		
		rc2.turnOn();
		rc2.turnOff();
		rc2.setVolume(3);
		
		rc2.setMute(true);
		
		// ���� �޼ҵ� ȣ��
		RemoteControl.changeBattery();
		
		// �޸� �Ҵ� �ޱ� -> �ܺ� Ŭ����, �������̽��� �ʵ�, �޼ҵ� ���� 
			// 1. new ������
			// 2. static ������
		
	}

}
