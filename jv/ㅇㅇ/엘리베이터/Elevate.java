package ����������;

import java.util.Scanner;


public class Elevate {

	Scanner sc = new Scanner(System.in);
	
	int maxFloor = 10; // �ְ���
	int minFloor = 1; // �ּ���
	int curFloor = 1; // �ֱ���
	int desFloor = 0; // ������

	

	void up() {
		while (curFloor < desFloor) {
			System.out.println("�ö󰩴ϴ�. ���� ���� : " + curFloor);
			curFloor++;
		}
	}

	void down() {
		while (curFloor > desFloor) {
			System.out.println("�������ϴ�. ���� ���� : " + curFloor);
			curFloor--;
		}
	}
	
	void ask() {
		System.out.println("�� ���� �Է� : ");
		desFloor = sc.nextInt();
		if(desFloor < minFloor || desFloor > maxFloor || desFloor == curFloor) {
			System.out.println("�����Դϴ�");
			System.out.println("���� �ٽ� �Է��� �ּ��� : ");
		}else {
			System.out.println("���� �ݽ��ϴ�");
			if(desFloor < curFloor) {
				down();
			}else if(desFloor > curFloor) {
				up();
			}
		}System.out.println("���� �����ϴ�");
		ask();
	}
}
