package �ܼ�;

public class TimeCheck extends Thread {
	
	@Override
	public synchronized void run() {
		
		while(true) {
			long ����ð� = System.currentTimeMillis();
			long �ð����� = (����ð�-Drink.���۽ð�)/1000;
			Drink.�ð�����=((int)�ð�����/5)+1;
		}
	}

}