package Day14;

public class Sound extends Thread{

	static boolean stop = true; // ���࿩�� �Ǵ� [true ���� / false ����]
	
	public void soundstop(boolean stop) {
		this.stop = stop;
		if(this.stop) {
			System.out.println("�Ҹ� ����");
		}else {
			System.out.println("�Ҹ� ����");
		}
	}
	
	@Override
	public void run() {
		while(this.stop) { // stop������ true �̸� ���ѷ���
					// [��������] stop ������ false
			System.out.println("�Ҹ� ��� ��");
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
			
			}
		}
	}
	
}
