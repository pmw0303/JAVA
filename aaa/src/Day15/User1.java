package Day15;

public class User1 extends Thread{
	
	private Cal cal;
	
	public void setCal(Cal cal) {
		this.setName("user1");
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory(100);
	}

}
