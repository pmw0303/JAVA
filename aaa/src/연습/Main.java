package ����;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		
		// �迭 
		Student[] student = new Student[100];
		Scanner sc = new Scanner(System.in);
		int count = 0;
		
		while( true ) {
			try {
				System.out.println("-----------------------------------------------------------------");
				System.out.println("\t\t\t��\t��\tǥ");
				System.out.println("-----------------------------------------------------------------");
				System.out.println("\t��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
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
				System.out.print(" 1. �л���� 2.�л����� ");
				int ch = sc.nextInt();
				if( ch==1 ) { 
					
					System.out.println("�̸��Է�"); String name = sc.next();
					System.out.println("���� ���� �Է�"); int kor = sc.nextInt();
					System.out.println("���� ���� �Է�"); int eng = sc.nextInt();
					System.out.println("���� ���� �Է�"); int mat = sc.nextInt();
					
					Student students = new Student(name, kor, eng, mat);
					int j = 0;
					for(Student temp : student) {
						if(temp == null) {
							student[j] = students;
							break;
						}j ++;
					}count ++;						
				} // �л� ��� 
				else if( ch== 2 ) { 
					System.out.println("������ �л� �̸� �Է�"); String name = sc.next();
					
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
					
				} // �л� ���� 
				else {  
					System.out.println("�߸��� ��ȣ");
				}
			}
			catch( Exception e ) {   
				System.out.println("�߸��� �Է�");
			}
		}
	}
}
