package Day07;

public class Day07_2 {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		mycar.setGas(5);
		
		// �޼ҵ� ȣ�� [ �μ�X ��ȯ=ture Ȥ�� false
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("����մϴ�.");
			mycar.run();
		}
		
		if(mycar.isLeftGas()) { 
			System.out.println("gas�� ������ �ʿ䰡 �����ϴ�");
		}else {
			System.out.println("gas�� �����ϼ���.");
		}
		
	}
}
