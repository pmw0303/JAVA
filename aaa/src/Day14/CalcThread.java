package Day14;

public class CalcThread extends Thread{
	
	public CalcThread(String name) {
		setName(name); // �μ��� ���� �����ͷ� �������̸� ���ϱ�
		
	}
	
	// ��Ƽ������ ����
	@Override
	public void run() {
		for(int i=0 ; i<200000000 ; i++) {
			
		}
		System.out.println("������ �̸� : " + getName());
	}
}
