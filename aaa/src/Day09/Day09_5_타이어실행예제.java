package Day09;

public class Day09_5_Ÿ�̾���࿹�� {

	public static void main(String[] args) {
		
		Car mycar = new Car();
		
		for(int i = 1 ; i <= 7 ; i++) {
			int problemLocation = mycar.run(); // �ڵ��� ȸ�� �޼ҵ� 5ȸ
		
			switch(problemLocation) {
			
			case 1:
				System.out.println("�տ��� �ѱ�Ÿ�̾� ��ü");
				mycar.frontLeftTire = new HankookTire("�տ���", 15);
				break; // switch Ż��
				
			case 2:
				System.out.println("�տ����� ��ȣŸ�̾� ��ü");
				mycar.frontRightTire = new KumhoTire("�տ�����", 13);
				break;
				
			case 3:
				System.out.println("�ڿ��� �ѱ�Ÿ�̾� ��ü");
				mycar.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
				
			case 4:
				System.out.println("�ڿ����� ��ȣŸ�̾� ��ü");
				mycar.backRightTire = new KumhoTire("�ڿ�����", 17);
				break;
			}
		
			System.out.println("-------------");
			
		
		}
	}
}
