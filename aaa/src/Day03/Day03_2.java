package Day03;

import java.util.Scanner;

public class Day03_2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

//		System.out.println("���� �Է� : ");
//		int no1 = scanner.nextInt();
//		System.out.println("���� �Է� : ");
//		int no2 = scanner.nextInt();
//		
//
//		if (no1 > no2)
//			System.out.println("�� ū�� : " + no1);
//		else if (no1 > no2)
//			System.out.println("�� ū�� : " + no2);
//		else
//			System.out.println("����");

//		System.out.println("���� �Է� : ");
//		int n1 = scanner.nextInt();
//		System.out.println("���� �Է� : ");
//		int n2 = scanner.nextInt();
//		System.out.println("���� �Է� : ");
//		int n3 = scanner.nextInt();
//
//		int max = n1;
//
//		if (max < n2) {
//			max = n2;
//		}
//		if (max < n3) {
//			max = n3;
//		}System.out.println("���� ū �� : " + max);

//		System.out.println("���� �Է� : ");
//		int n1 = scanner.nextInt();
//		System.out.println("���� �Է� : ");
//		int n2 = scanner.nextInt();
//		System.out.println("���� �Է� : ");
//		int n3 = scanner.nextInt();
//		System.out.println("���� �Է� : ");
//		int n4 = scanner.nextInt();
//		
//		int max = n1;
//		if(max < n2) {max = n2;}
//		if(max < n3) {max = n3;}
//		if(max < n4) {max = n4;}
//		System.out.println("���� ū �� : " + max);

		// ���� 3�� �Է� �޾� ��������
//		System.out.println("���� �Է� :");
//		int n1 = scanner.nextInt();
//		System.out.println("���� �Է� :");
//		int n2 = scanner.nextInt();
//		System.out.println("���� �Է� :");
//		int n3 = scanner.nextInt();
//
//		if (n1 > n2) { // ��ü [ ���� = �� ������ ������ ��ȯ ��� ] �ε�ȣ �ݴ� -> ��������
//			int temp = n1;
//			n1 = n2;
//			n2 = temp;
//		}
//		if (n1 > n3) {
//			int temp = n1;
//			n1 = n3;
//			n2 = temp;
//		}
//		if (n2 > n3) {
//			int temp = n2;
//			n2 = n3;
//			n3 = temp;
//		}
//		System.out.printf(" �Է��� �� �������� : %d %d %d", n1,n2,n3);

		// ���� 4�� �Է¹޾� �������� / ��������

		System.out.println("���� �Է� :");
		int n1 = scanner.nextInt();
		System.out.println("���� �Է� :");
		int n2 = scanner.nextInt();
		System.out.println("���� �Է� :");
		int n3 = scanner.nextInt();
		System.out.println("���� �Է� :");
		int n4 = scanner.nextInt();

		if (n1 > n2) { // ��ü [ ���� = �� ������ ������ ��ȯ ��� ] �ε�ȣ �ݴ� -> ��������
			int temp = n1;
			n1 = n2;
			n2 = temp;
		}
		if (n1 > n3) {
			int temp = n1;
			n1 = n3;
			n3 = temp;
		}
		if (n1 > n4) {
			int temp = n1;
			n1 = n4;
			n4 = temp;
		}
		if (n2 > n3) {
			int temp = n2;
			n2 = n3;
			n3 = temp;
		}
		if (n2 > n4) {
			int temp = n2;
			n2 = n4;
			n4 = temp;
		}
		if (n3 > n4) {
			int temp = n3;
			n3 = n4;
			n4 = temp;
		}

		System.out.printf(" �Է��� �� �������� : %d %d %d %d", n1, n2, n3, n4);

	}
}
