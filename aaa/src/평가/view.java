package 평가;

import java.util.Scanner;

public class view {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("학생");
				// 점수출력

				System.out.println("1.등록 2.삭제");
				int ch = sc.nextInt();

				if (ch == 1) {

				} else if (ch == 2) {

				} else {

				}
			} catch (Exception e) {

			}
		}
	}
}
