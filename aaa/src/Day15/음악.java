package Day15;

public class ���� extends Thread {

	@Override
	public void run() {
		// ����ó�� �ڵ� ����
		while(true) {
			System.out.println("���� ������");		
			try{
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
		}
	}
}
