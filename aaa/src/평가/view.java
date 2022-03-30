package 평가;

import java.util.Scanner;

public class view {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[100];
		int count =0;
	
		while(true) {
			try {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("\t\t\t성\t적\t표");
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("\t번호\t이름\t국어\t영어\t수학\t총점\t평균\t석차");
				System.out.println("--------------------------------------------------------------------------");
				int i = 0 ;
				for(Student temp : student) {
					if(temp != null) {
						System.out.printf("\t"+(i+1)+"\t"+student[i].getName()+
								"\t"+student[i].getKor()+"\t"+student[i].getEng()+"\t"+student[i].getMat()+
								"\t"+student[i].getSum()+"\t"+"%.2f"+"\t"+ student[i].getRank() +"\n",(double)student[i].getSum()/3);
						i++;
					}
				}
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("1. 학생등록 2. 학생삭제 ");
				System.out.print("선택 : "); int ch = sc.nextInt();
				if (ch==1) {
					System.out.print("이름을 입력하세요 : "); String name = sc.next();
					System.out.print("국어점수를 입력하세요 : "); int kor = sc.nextInt(); // 1~100 외 점수 막아야함
					System.out.print("영어점수를 입력하세요 : "); int eng = sc.nextInt(); // 1~100 외 점수 막아야함
					System.out.print("수학점수를 입력하세요 : "); int mat = sc.nextInt(); // 1~100 외 점수 막아야함
					Student students = new Student(name, kor, eng, mat);
					int j = 0 ;
					for ( Student temp : student ) {
						if( temp == null ) {
							student[j] = students ;
							break;
						}
						j++;
					}count++;
					
					if (count == 1) {
						student[count - 1].rank = 1;
					} else {
						for (int k = 0; k < count-1 ; k++) {
							for (int e=0; e < count-1-k ; e++) {
								if (student[e].getSum() < student[e + 1].getSum()) {
									Student temp = student[e];
									student[e] = student[e+1];
									student[e+1] = temp;
								}
							}
						}
						for (int k = 0; k < count; k++) {
							student[k].rank = k + 1;
						}
					}
														
				} // 학생 등록
				else if(ch==2) {
					System.out.println("이름을 입력하세요 : "); String name = sc.next();
					
					for(int j=0 ; j<count ; j++ ) {
						boolean status = student[j].name.equals(name);
						if(status) {
							Student[] students = new Student[100];
							for(int k=0 ; k<students.length ; k++) {
								if(k<j) {
									students[k] = student[k];
								}else if(k > j) {
									students[k-1] = student[k];
								}
							}
							student = students;
							count --;
						}
					}
					
					if (count == 1) {
						student[count - 1].rank = 1;
					} else {
						for (int k = 0; k < count-1 ; k++) {
							for (int e=0; e < count-1-k ; e++) {
								if (student[e].getSum() < student[e + 1].getSum()) {
									Student temp = student[e];
									student[e] = student[e+1];
									student[e+1] = temp;
								}
							}
						}
						for (int k = 0; k < count; k++) {
							student[k].rank = k + 1;
						}
					}
				} // 학생 삭제
				else {
					System.out.println("알림]] 잘못된 번호입니다.");
				}
			}
			catch(Exception e) {
				System.err.println("알림]] 잘못된 입력입니다.");	
				
			}
		}
		
	}
}
