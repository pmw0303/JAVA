package Day15;

public class 채팅 implements Runnable{
	public void run() {
		while(true) {
			System.out.println("채팅중");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
	}
}


