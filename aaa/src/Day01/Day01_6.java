package Day01;

import java.util.Scanner;

public class Day01_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		String no = sc.next();
		System.out.print("�ۼ��� : ");
		String name = sc.next();
		System.out.print("���� : ");
		String word = sc.next();
		System.out.print("��¥ : ");
		String day = sc.next();
		
		System.out.println("---------------�湮��--------------");
		System.out.println("|����\t|�ۼ���\t|����\t|��¥\t|");
		System.out.printf("|%s\t|%s\t|%s\t|%s\t|",no,name,word,day);
	
	}
}
