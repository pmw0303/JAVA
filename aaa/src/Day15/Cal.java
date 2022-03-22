package Day15;

public class Cal {

	private int memory;

	public int getMemory() {
		return memory;
	}

	// ������ : ������1�� 100�ְ� -> ������2�� 50 �ְ� [�� ����] -> 100��� X
	// �ذ� [synchronized : ����ȭ] 
		// ������1�� 100�ְ� -> ������2 ��� -> 100���
			// ������2�� ������1�� ����� �� ���� ���
	public synchronized void setMemory(int memory) {
		this.memory = memory;
		try {
			Thread.sleep(2000);
		} catch (Exception e) {			
		}
		System.out.println(Thread.currentThread().getName() + ": " + this.memory);
	}	
}
