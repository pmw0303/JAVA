package Day15;

public class User2 extends Thread{
	
	private Cal cal;
	
	public void setCal(Cal cal) {
		this.setName("user2");
		this.cal = cal;
	}
	
	@Override
	public void run() {
		cal.setMemory(50);
	}

}
