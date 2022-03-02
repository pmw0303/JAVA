package Day01;

import java.util.Scanner;

public class Day01_4 { //cs
	public static void main(String[] args) { //ms
		// 예제 1 : 한 명의 이름, 1교시, 2교시, 3교시 출석여부를 입력받아 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1교시 출석 유무 : ");
		String enter1 = sc.next();
		System.out.print("2교시 출석 유무 : ");
		String enter2 = sc.next();
		System.out.print("3교시 출석 유무 : ");
		String enter3 = sc.next();
		
		System.out.println("\t[[출석현황]]");
		System.out.println("----------------------------");
		/*System.out.println("이름 : " + name);
		System.out.println("1교시 출결 유무 : " + enter1);
		System.out.println("2교시 출결 유무 : " + enter2);
		System.out.println("3교시 출결 유무 : " + enter3);*/
		System.out.println("이름\t1교시\t2교시\t3교시\t비고");
		//System.out.print(name + "\t" + enter1 + "\t" + enter2 + "\t" + enter3 + "\t");
		System.out.printf("%s\t%s\t%s\t%s",name,enter1,enter2,enter3);
		
	} //me

} //ce
