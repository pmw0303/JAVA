package Day03;

import java.util.Scanner;

public class Day03_5 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		// �ݺ��� : 1. for 2. while 3. do~while (x)
//		for :
//			��𼭺��� ������ �� ���� ����/���� �ϸ鼭 �ݺ�ó��
//			ex) 1���� 10���� 1�� �����ϸ鼭 �ݺ�ó�� -> 10�� ����
//			1. �ʱⰪ 2. ���ǽ� 3. ������
//			for( �ʱⰪ ; ���ǽ� ; ������ ) {
//				�ݺ� ���๮;
//			}

//		for (int i = 1; i <= 10; i++) {
////			int i = 1 : �ʱⰪ ���� [i�� �ݺ�����]
////			i <= 10 : ���ǽ� [ i�� 10���ϸ� ���� �ƴϸ� ����Ұ�]
////			i++ : ������ [ ���๮ ���� �� ���� Ȥ�� ���� ����]
//			System.out.println(i + " ");
//			i = 1 �� �� i<=10 [true] ���๮  -> ������ i = 2
//			i = 2 �� �� i<=10 [true] ���๮  -> ������ i = 3
//			...
//			i = 10 �� �� i<=10 [true] ���๮ -> �򰨽� i = 10
//			i = 11 �� �� i<=11 [false] �ݺ��� ����

		// 1~100 ���� ��
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//
//		}
//		System.out.println("��� : " + sum);

		// 1���� 100���� 7����� ��
//		int sum = 0;
//		for(int i = 0; i<=100; i+=7) {
//			sum += i;
//			
//		}
//		System.out.println("��� : " + sum);
//		
//		
//		int sum = 0;
//		for(int i = 0; i<=100; i++) {
//			if(i%7 == 0) sum += i;
//			
//		}
//		System.out.println("��� : " + sum);

		// 2�� ������ �����

		for (int i = 0; i <= 9; i++) {

			System.out.printf("2 * %d = %d\n", i, 2 * i);
		}

		
		// 2��~9�� ������ �����
//		�� : 2���� 9���� 1������
//		�� : 1���� 9���� 1�� ����
//		�� : 1�� ���� �� �� ���� �� 9�� ����
		
		
		for(int i=2; i<=9; i++) {
			System.out.printf("%d��-------\n",i);
			for(int j=1; j<=9; j++)
			{
				System.out.printf("%d * %d = %d\n",i,j,i*j);
			}
		}
		
		
		
		
		
		
		
	}

}
