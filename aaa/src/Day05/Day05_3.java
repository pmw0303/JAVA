package Day05;

import java.util.Scanner;

public class Day05_3 {

	public static void main(String[] args) {

		// p.181
		// 1.
		// 2.
		// 3. 2 : ��ü �񱳽� equals �޼ҵ� ���
		// 4. 2 : ���̰� ������� �� ���� �Ұ�
		// 5. 3 : boolean �ʱⰪ�� false
		// 6. 3 , 5
		// { 1�� } , { 2�� } , { 3�� } => 3
		// { 78 83 93 87 88 } => 5
		// 7.

//		int max = 0; // �ִ� �����ϴ� ����
//		int[] array = { 1, 5, 3, 8, 2 }; // ����+�ʱⰪ ����
//
//		for (int i = 0; i < array.length; i++) {
//			// *i�� 0 ���� �迭�Ǳ��� ���� 1������ ���� �ݺ�ó��
//			if (max < array[i])
//				max = array[i];
//			// * ���࿡ max���� i��° �ε����� ���� �� ũ�� max�� i��° �� ����
//		}
//		System.out.println(" max : " + max);

		// 8.
//		int[][] array2 = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };
//
//		int sum = 0; // �հ�
//		double avg = 0.0; // ���
//
//		// Ǯ��
//		int count = 0; // ������ ���� [ ĭ ���� ]
//		// 2���� �迭�� ��� ������ ȣ��
//		for (int �� = 0; �� < array2.length; ��++) { // * ���� 0���� �迭�� �����[3]�̸����� 1������
//			for (int �� = 0; �� < array2[��].length; ��++) { // *���� 0���� �迭�� ������[ 2 , 3 , 5 ] �̸����� 1������
//				sum += array2[��][��]; // �����հ�
//			}
//			count += array2[��].length; // �������� �����հ�
//		}
//
//		avg = (double) sum / count;
//
//		System.out.println(" sum : " + sum);
//		System.out.println(" avg : " + avg);

		// 9.
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {

			System.out.println("-------------------------------------------------");
			System.out.println("1. �л���|2. �����Է�|3. ��������Ʈ|4. �м�|5. ����");
			System.out.println("-------------------------------------------------");
			System.out.println("����> ");

			int selectNo = scanner.nextInt();

			if (selectNo == 1) {

				System.out.println("�л���> ");
				studentNum = scanner.nextInt();
				scores = new int[studentNum];

			} else if (selectNo == 2) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("scores[%d} : \n", i);
					scores[i] = scanner.nextInt();

				}

			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.printf("score[%d] : %d \n", i, scores[i]);

				}

			} else if (selectNo == 4) {
				
				int max = 0;
				int all =0;
				double avg = 0;
				
				for(int i=0 ; i<scores.length ; i++ ) {
					
					if(max < scores[i]) max =scores[i];
					
					all += scores[i];
				}
				
				avg = (double)all/scores.length;
				
				System.out.println("�ְ� ���� : " + max);
				System.out.println("��� ���� : " + avg);

			} else if (selectNo == 5) {
				run = false; // or break;
			}
		}

		System.out.println("���α׷� ����");
	}

}