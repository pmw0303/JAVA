package Day06;

public class Day06_2 {

	
	public static void main(String[] args) {
		
//		1. Ŭ���� ���� -> ��ü ����
		Car myCar = new Car(); // ��ü ����
			
//			Car : ���ǵ� Ŭ������
//			myCar : ��ü�̸�[�ƹ��ų�]
//			new : �޸� �Ҵ� ������
//			Car() : ������
		
		System.out.println("���� ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ� �ӵ� : " + myCar.maxSpeed);
		System.out.println("���� �ӵ� : " + myCar.speed);
		
		
//		��ü �� �ʵ� �� ��� ����
		System.out.println("-------------------------------");
		myCar.speed = 70;
		System.out.println("���� �ӵ� : " + myCar.speed);
		
//		���ο� �� ��ü ����
		System.out.println("-------------------------------");
		Car yourcar = new Car();
		System.out.println("2�� �ڵ��� : " + yourcar.speed);
		
	}
}
