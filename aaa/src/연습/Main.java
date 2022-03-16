package 연습;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		// 배열 
		Student[] student = new Student[100];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while( true ) {
			try {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("\t\t\t성\t적\t표");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("\t번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("-----------------------------------------------------------------");
				
				int i = 0;
				for(Student temp : student) {
					if(temp != null) {
					System.out.printf("\t"+ (i+1) + "\t");
					System.out.printf(student[i].getName() + "\t");
					System.out.printf(student[i].getKor() + "\t");
					System.out.printf(student[i].getEng() + "\t");
					System.out.printf(student[i].getMat() + "\t");
					System.out.printf(student[i].getSum() + "\t");
					System.out.printf("%.2f",(double)student[i].getSum()/3 + "\t");
					i++;
					}
				}
				System.out.println("-----------------------------------------------------------------");
				System.out.print(" 1. 학생등록 2.학생삭제 ");
				int ch = sc.nextInt();
				if( ch==1 ) { 
					
					System.out.println("이름입력"); String name = sc.next();
					System.out.println("국어 점수 입력"); int kor = sc.nextInt();
					System.out.println("영어 점수 입력"); int eng = sc.nextInt();
					System.out.println("수학 점수 입력"); int mat = sc.nextInt();
					
					Student students = new Student(name, kor, eng, mat);
					int j = 0;
					for(Student temp : student) {
						if(temp == null) {
							student[j] = students;
							break;
						}j ++;
					}count ++;						
				} // 학생 등록 
				else if( ch== 2 ) { 
					System.out.println("삭제할 학생 이름 입력"); String name = sc.next();
					
					for(int j = 0; j < count; j++){
						boolean a = student[j].name.equals(name);
						if(a) {
							Student[] students = new Student[100];
							for(int k=0; k< students.length ; k++) {
								if(k<j) {
									students[k] = student[k];
								}else if(k > j) {
									students[k-1] = student[k];
								}
							}
							student = students;
							count--;
						}
					}
					
				} // 학생 삭제 
				else {  
					System.out.println("잘못된 번호");
				}
			}
			catch( Exception e ) {   
				System.out.println("잘못된 입력");
			}
		}
	}
}
