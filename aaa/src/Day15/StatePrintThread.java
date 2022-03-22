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
			// 스레드의 상태 얻기
			System.out.println("타겟 스레드 상태: " + state);
			
			if(state == Thread.State.NEW) { // NEW = 스레드 생성상태
				targetThread.start();
			} 
			if(state == Thread.State.TERMINATED) { // TER : 스레드 종료상태
				break;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
		}
	}
}
