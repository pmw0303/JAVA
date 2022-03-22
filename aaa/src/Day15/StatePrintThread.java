package Day15;

public class StatePrintThread extends Thread{
	
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); 
			// �������� ���� ���
			System.out.println("Ÿ�� ������ ����: " + state);
			
			if(state == Thread.State.NEW) { // NEW = ������ ��������
				targetThread.start();
			} 
			if(state == Thread.State.TERMINATED) { // TER : ������ �������
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}
