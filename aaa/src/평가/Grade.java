package ��;

import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[100];

		String[] name = new String[student.length];
		int[] kor = new int[student.length];
		int[] eng = new int[student.length];
		int[] mat = new int[student.length];
		int[] tot = new int[student.length];
		double[] avg = new double[student.length];
		String[] grade = new String[student.length];
		int[] rank = new int[student.length];

		System.out.println("�޴� : 1. �л����� ��� 2. �л����� ����");
		int ch = sc.nextInt();

		while (true) {
			if (ch == 1) {
				for (int i = 0; i < student.length; i++) {
					System.out.print("�л� �̸� �Է� : ");
					name[i] = sc.next();

					System.out.print("���� ���� �Է� : ");
					kor[i] = sc.nextInt();

					System.out.print("���� ���� �Է� : ");
					eng[i] = sc.nextInt();

					System.out.print("���� ���� �Է� : ");
					mat[i] = sc.nextInt();

					tot[i] = kor[i] + eng[i] + mat[i];
					avg[i] = tot[i] / 3.00;

					rank[i] = 1;
				}
				for (int i = 0; i < rank.length; i++) {
					for (int j = 0; j < rank.length; j++) {
						if (tot[i] < tot[j]) {
							// ������ ���� ������� ������ �� ����� 1++
							rank[i]++;
						}
					}
				}
			}

		}

	}

}
