package zzzz;

import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] student = new Student[100];
		int count =0;
	
		while(true) {
			try {
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("\t\t\t��\t��\tǥ");
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("\t��ȣ\t�̸�\t����\t����\t����\t����\t���\t����");
				System.out.println("--------------------------------------------------------------------------");
				int i = 0 ;
				for(Student temp : student) {
					if(temp != null) {
						System.out.printf("\t"+(i+1)+"\t"+student[i].getName()+
								"\t"+student[i].getKor()+"\t"+student[i].getEng()+"\t"+student[i].getMat()+
								"\t"+student[i].getSum()+"\t"+"%.2f"+"\t"+ "\n",(double)student[i].getSum()/3);
						i++;
					}
				}
				System.out.println("--------------------------------------------------------------------------");
				System.out.println("1. �л���� 2. �л����� ");
				System.out.print("���� : "); int ch = sc.nextInt();
				if (ch==1) {
					System.out.print("�̸��� �Է��ϼ��� : "); String name = sc.next();
					System.out.print("���������� �Է��ϼ��� : "); int kor = sc.nextInt(); // 1~100 �� ���� ���ƾ���
					System.out.print("���������� �Է��ϼ��� : "); int eng = sc.nextInt(); // 1~100 �� ���� ���ƾ���
					System.out.print("���������� �Է��ϼ��� : "); int mat = sc.nextInt(); // 1~100 �� ���� ���ƾ���
					Student students = new Student(name, kor, eng, mat);
					int j = 0 ;
					for ( Student temp : student ) {
						if( temp == null ) {
							student[j] = students ;
							break;
						}
						j++;
					}count++;
					
					
														
				} // �л� ���
				else if(ch==2) {
					System.out.println("�̸��� �Է��ϼ��� : "); String name = sc.next();
					
					for(int j=0 ; j<count ; j++ ) {
						boolean del = student[j].name.equals(name);
						if(del) {
							Student[] students = new Student[100];
							for(int k=0; k<students.length ; k++) {
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
					
					
				} // �л� ����
				else {
					System.out.println("�˸�]] �߸��� ��ȣ�Դϴ�.");
				}
			}
			catch(Exception e) {
				System.err.println("�˸�]] �߸��� �Է��Դϴ�.");	
				
			}
		}
		
	}
}
