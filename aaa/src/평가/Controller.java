package ��;

import java.util.Scanner;

public class Controller {
	
	public static Student student = new Student();

	public static void insert(String name, int kor, int eng, int mat) {
		Student student = new Student(name, kor, eng, mat);
		student.setName(name);
		student.setKor(kor);
		student.setEng(eng);
		student.setMat(mat);
	}
	
	public static void delete() {
		if(student.name.equals(name)) {
			System.out.println("�����Ϸ�");
			student.se
		}else {
			System.out.println("��������");
		}
	}
}
