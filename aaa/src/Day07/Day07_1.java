package Day07;

public class Day07_1 {
	public static void main(String[] args) {
		
		// �޼ҵ� ȣ�� ���
			// 1. �޼ҵ尡 �����ϴ� Ŭ������ ��ü �ʿ�
			// 2. ��ü��.�޼ҵ��()
				// . : ���ٿ�����( �ʵ峪 �޼ҵ� ȣ�� �� )
		
		// 1. ��ü ����
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int return1 = myCalc.plus(3, 5);
		
		System.out.println("return1 : " + return1);
		
		
		double return2 = myCalc.divide(7, 4);
		
		System.out.println("return2 : " + return2);
	}

}
