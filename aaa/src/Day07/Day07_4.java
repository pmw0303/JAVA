package Day07;

public class Day07_4 {

	public static void main(String[] args) {
		
		// 1. ��ü ����*****
		Car2 mycar = new Car2();
		
		// 2. �ڵ��� �õ� �ɱ�
		mycar.keyTurnOn();
		
		// 3. �ڵ��� ����
		mycar.run();
		
		// 4. �ӵ� Ȯ��
		int speed = mycar.getSpeed();
		System.out.println("���� �ӵ� : " + speed + "km/h");
		
	}
	
}
