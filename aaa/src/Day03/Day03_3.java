package Day03;

import java.util.Scanner;

public class Day03_3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// ������ �Է¹޾� ������ 90�� �̻��̸� �հ� �ƴϸ� ���հ� ���
//		System.out.println("���� �Է� : ");
//		int score = scanner.nextInt();
//
//		if (score > 90) {
//			System.out.println("�հ�");
//		}else {
//			System.out.println("���հ�");
//		}

		// ����7
		// ������ �Է¹޾� ������ 90�� �̻��̸� A���
		// ������ 80�� �̻��̸� B���
		// ������ 70�� �̻��̸� C���
		// �׿� �����

//		System.out.println("���� �Է� : ");
//		int score = scanner.nextInt();
//		
//		if(score >= 90) {
//			System.out.println("A���");
//		}else if(score>=80) {
//			System.out.println("B���");
//		}else if(score >=70) {
//			System.out.println("C���");
//		}else 
//			System.out.println("�����");
//		

		// ����8 �α���������
		// [ �Է� ] : ���̵�� ��й�ȣ�� �Է¹ޱ�
		// [ ���� ] : ȸ�����̵� admin �̰�
		// ��й�ȣ�� 1234 �� ��쿡��
		// �α��� ���� �ƴϸ� �α��� ���� ���

//		System.out.print("���̵� �Է� : ");
//		String id = scanner.next();
//		System.out.print("��й�ȣ �Է� : ");
//		int pw = scanner.nextInt();

		// �ڷ��� ����ϴ� ������ ������ ��� ����
		// Ŭ���� ����ϴ� ��ü�� ������ ��� �Ұ� -> �޼ҵ� equals ���

//		Boolean login = false;
//		if (id.equals("admin")) {
//			// id�� admin
//
//			if (pw==1234) {
//				// pw�� 1234
//
//				System.out.println("�α��� ����");
//				login = true;
//			} else {
//				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�. ");
//			}
//		} else {
//			System.out.println("���̵� Ʋ�Ƚ��ϴ�. ");
//		}
//		if (login == false)
//			System.out.println("�α��� ����");

		// ����9
		// [ �Է� ] : ����, ����, ���� �Է¹ޱ�
		// [ ���� ] : ����� 90�� �̻��̸鼭
		// �������� 100���̸� '������' ���
		// �������� 100���̸� '������' ���
		// �������� 100���̸� '���п��' ���

		System.out.println("�������� �Է� : ");
		int score1 = scanner.nextInt();
		System.out.println("�������� �Է� : ");
		int score2 = scanner.nextInt();
		System.out.println("�������� �Է� : ");
		int score3 = scanner.nextInt();

		int avg = (score1 + score2 + score3) / 3;

		if (avg >= 90 && avg <= 100) {
			if(score1 == 100) {
				System.out.println("������");
			}if(score2 == 100) {
				System.out.println("������");
			}if(score3 == 100) {
				System.out.println("���п��");
			}
					
		}else if(avg >=80 && avg < 90 ) {
			if(score1 >= 90) {
				System.out.println("�������");
			}if(score2 >= 90) {
				System.out.println("�������");
			}if(score3 >= 90) {
				System.out.println("�������");
			}
		}else System.out.println("�����");

	}
}
