package �ܼ�;

import java.util.Random;

public class Buy extends Thread {
	
	String �����̸�;
	
	public Buy(String �����̸�) {
		this.�����̸� = �����̸�;
	}
	
	@Override
	public synchronized void run() {
		
		
		// ����ó�� ����
		try {Thread.sleep(5000);}catch(Exception e) {} // ��ǻ�� ����Ȱ�� 3������ ����
		while(true) {
			if(Drink.���Ƚ��>=4) {
				break;
			}
			if(�����̸�=="�ݶ�") {
				Random random = new Random();			
				int buy = random.nextInt(2)+1;
				if (Drink.�ݶ� < buy) {
					Drink.���Ƚ�� += 1;
					Drink.�޽���.add(0,"���) �ݶ� �����Ͽ� �Ǹ����� ���߽��ϴ�");
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				else {
					Drink.�ݶ� -= buy;
					Drink.�ڱ� += buy*400 ;
					Drink.�޽���.add(0,"�ݶ� " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*400 + "��");
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
					try {Thread.sleep(2000-Drink.�ð�����*10);}catch(Exception e) {}
			}
			else if(�����̸�=="ȯŸ") {	
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Drink.ȯŸ < buy) {
					Drink.���Ƚ�� += 1;
					Drink.�޽���.add(0,"���) ȯŸ�� �����Ͽ� �Ǹ����� ���߽��ϴ�");
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				else {
					Drink.ȯŸ -= buy;
					Drink.�ڱ� += buy*300 ;
					Drink.�޽���.add(0,"ȯŸ " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*300 + "��");
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				try {Thread.sleep(2000-Drink.�ð�����*10);}catch(Exception e) {}
			}
			else if(�����̸�=="���̴�") {	
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Drink.���̴� < buy) {
					Drink.���Ƚ�� += 1;
					Drink.�޽���.add(0,"���) ���̴ٰ� �����Ͽ� �Ǹ����� ���߽��ϴ�");
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				else {
					Drink.���̴� -= buy;
					Drink.�ڱ� += buy*200 ;
					Drink.�޽���.add(0,"���̴� " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*200 + "��");
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				try {Thread.sleep(2000-Drink.�ð�����*10);}catch(Exception e) {}
			}
			else if(�����̸�=="�����") {	
				Random random = new Random();
				int buy = random.nextInt(2)+1;
				if (Drink.����� < buy) {
					Drink.���Ƚ�� += 1;
					Drink.�޽���.add(0,"���) ������� �����Ͽ� �Ǹ����� ���߽��ϴ�");
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				else {
					Drink.����� -= buy;
					Drink.�ڱ� += buy*1500 ;
					Drink.�޽���.add(0,"����� " + buy + " �� �ǸŵǾ����ϴ�. + " + buy*1500 + "��");
					if(Drink.�޽���.size()>=8) {
						Drink.�޽���.remove(5);
					}
				}
				try {Thread.sleep(2000-Drink.�ð�����*10);}catch(Exception e) {}
			}
		}
			
	}

}

