package 콘솔;

public class TimeCheck extends Thread {
	
	@Override
	public synchronized void run() {
		
		while(true) {
			long 현재시간 = System.currentTimeMillis();
			long 시간차이 = (현재시간-Drink.시작시간)/1000;
			Drink.시간차이=((int)시간차이/5)+1;
		}
	}

}