package Day01;

import java.util.Scanner;

public class Day01_5 {
	
	public static void main(String[] args) {
		//�Է� -> ���� -> ���
		//1. �Է� ��ü ����
		Scanner sc = new Scanner(System.in);
		//2. �Է��� ��� �ȳ� / 3. �Է¹��� ������ �ٸ����� ����
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("���̵� : ");
		String id = sc.next();
		System.out.print("��й�ȣ : ");
		String password = sc.next();
		System.out.print("�̸��� : ");
		String email = sc.next();
		
		System.out.println(">>>>>>> ȸ������ �Ϸ�. ������ Ȯ�����ּ���. <<<<<<<< ");
		System.out.println("�̸�\t���̵�\t��й�ȣ\t�̸���");
		System.out.printf("%s\t%s\t%s\t%s",name,id,password,email);
		
	}
}
