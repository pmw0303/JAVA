package Day01;

import java.util.Scanner;

public class Day01_4 { //cs
	public static void main(String[] args) { //ms
		// ���� 1 : �� ���� �̸�, 1����, 2����, 3���� �⼮���θ� �Է¹޾� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = sc.next();
		System.out.print("1���� �⼮ ���� : ");
		String enter1 = sc.next();
		System.out.print("2���� �⼮ ���� : ");
		String enter2 = sc.next();
		System.out.print("3���� �⼮ ���� : ");
		String enter3 = sc.next();
		
		System.out.println("\t[[�⼮��Ȳ]]");
		System.out.println("----------------------------");
		/*System.out.println("�̸� : " + name);
		System.out.println("1���� ��� ���� : " + enter1);
		System.out.println("2���� ��� ���� : " + enter2);
		System.out.println("3���� ��� ���� : " + enter3);*/
		System.out.println("�̸�\t1����\t2����\t3����\t���");
		//System.out.print(name + "\t" + enter1 + "\t" + enter2 + "\t" + enter3 + "\t");
		System.out.printf("%s\t%s\t%s\t%s",name,enter1,enter2,enter3);
		
	} //me

} //ce
