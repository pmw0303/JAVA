package Day03;

public class Day04_4 {

	public static void main(String[] args) {

		// ���
		// 1. if�� 2. switch��
		// if : ���˻�( true , false )
		// >= <= > < == !=
		// switch : ������ �˻�
		// ����
		// switch( �˻��� ){
//			case '��' : ���๮;
//			case '��' : ���๮;
//			case '��' : ���๮;
//			default : ���๮;
		// }
		// break; ���� ����� switch Ȥ�� �ݺ��� Ż��[ ������ ]

		// ���� 90�� �̻� A, 80�� �̻� B, 70�� �̻� C, �� �� Ż��
//		int score = 80;
//		if (score == 90)
//			System.out.println("A");
//		else if (score == 80)
//			System.out.println("B");
//		else if (score == 70)
//			System.out.println("C");
//		else
//			System.out.println("Ż��");

//		switch (score) {
//		case 90:
//			System.out.println("A"); break;
//		case 80:
//			System.out.println("B"); break;
//		case 70:
//			System.out.println("C"); break;
//		default:
//			System.out.println("Ż��"); break;

//		int bt = 3;
//		switch (bt) {
//
//		case 1:
//			System.out.println("1�� �̵�");
//			break;
//		case 2:
//			System.out.println("2�� �̵�");
//			break;
//		case 3:
//			System.out.println("3�� �̵�");
//			break;
//		case 4:
//			System.out.println("4�� �̵�");
//			break;
//		default:
//			System.out.println("����");
//		}

		char cs = 'A';
		switch (cs) {
		case 'A':
		case 'B':
			System.out.println("��� ȸ��");
			break;
		case 'C':
		case 'D':
			System.out.println("�Ϲ� ȸ��");
			break;
		default:
			System.out.println("�մ�");
		}

	}
}
