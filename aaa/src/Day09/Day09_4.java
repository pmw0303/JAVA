package Day09;

public class Day09_4 {
	public static void main(String[] args) {

		// 296 ~ 297
		// @override : ������
		// ������ �μ��� ������ �޼ҵ� �� �Ұ���
		// ���� : ������ �޼ҵ带 ������[����]
		
		int r = 10;
		
		Calculator cal = new Calculator();
		System.out.println("�� ���� : " + cal.areaCircle(r));
		System.out.println();
		
		Computer com = new Computer();
		System.out.println("�� ���� : " + com.areaCircle(r));
		System.out.println();
		
	}
}

