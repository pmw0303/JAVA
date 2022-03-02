package Day01;

import java.util.Scanner;

public class Day01_6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("순번 : ");
		String no = sc.next();
		System.out.print("작성자 : ");
		String name = sc.next();
		System.out.print("내용 : ");
		String word = sc.next();
		System.out.print("날짜 : ");
		String day = sc.next();
		
		System.out.println("---------------방문록--------------");
		System.out.println("|순번\t|작성자\t|내용\t|날짜\t|");
		System.out.printf("|%s\t|%s\t|%s\t|%s\t|",no,name,word,day);
	
	}
}
