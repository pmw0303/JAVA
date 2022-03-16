package 평가;

import java.util.Scanner;

public class view {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[100];
		
		while (true) {
			try {
				System.out.printf("학생");
				// 점수출력 - 모든 배열
				int i =0;
				

				System.out.println("1.등록 2.삭제");
				int ch = sc.nextInt();

				if (ch == 1) {
					System.out.println("학생 이름 : "); String name = sc.next();
					System.out.println("국어 점수 : "); int kor = sc.nextInt();
					System.out.println("영어 점수 : "); int eng = sc.nextInt();
					System.out.println("수학 점수 : "); int mat = sc.nextInt();
					Controller.insert(name, kor, eng, mat);
					
				} else if (ch == 2) {
					System.out.println("삭제할 학생 이름 : ");
					String name = sc.next();
					
					Controller.delete();
				} else {

				}
			} catch (Exception e) {

			}
		}
	}
}
