package ��;

import java.util.Scanner;

public class view {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[100];
		
		while (true) {
			try {
				System.out.printf("�л�");
				// ������� - ��� �迭
				int i =0;
				

				System.out.println("1.��� 2.����");
				int ch = sc.nextInt();

				if (ch == 1) {
					System.out.println("�л� �̸� : "); String name = sc.next();
					System.out.println("���� ���� : "); int kor = sc.nextInt();
					System.out.println("���� ���� : "); int eng = sc.nextInt();
					System.out.println("���� ���� : "); int mat = sc.nextInt();
					Controller.insert(name, kor, eng, mat);
					
				} else if (ch == 2) {
					System.out.println("������ �л� �̸� : ");
					String name = sc.next();
					
					Controller.delete();
				} else {

				}
			} catch (Exception e) {

			}
		}
	}
}
