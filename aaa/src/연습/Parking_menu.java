package ����;

import java.util.Scanner;

public class Parking_menu {
		
		final static int MAX = 12;
		String[] box = new String[MAX];
		Parking_state state = new Parking_state();
		Parking_In in = new Parking_In();
		Parking_exit exit = new Parking_exit();
//		Tower_money money = new Tower_money();
		
		public void info(Scanner temp) {
			System.out.println("======== ���� ���α׷� ==========");
			System.out.println();
			state.create(MAX);
			state.print_state();
			select(temp);
		}
		
		public void select(Scanner temp) {
			int ch = 1;
			System.out.println("---------------------");
			try {
				while(true) {
					System.out.println("1.���� 2.���� 3.���� 4.����");
					ch=temp.nextInt();
					if(ch==1) {
						System.out.println(" ���� �޴� ����");
						in.in(state, temp);
					}else if(ch==2) {
						System.out.println(" ���� �޴� ����");
						exit.out(state, temp);
					}else if(ch==3) {
						System.out.println(" ���� ");
					}else if(ch==4) {
						System.out.println(" ���� ");
						break;
					}else {
						System.out.println(" �߸��� �Է�");
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	
	

}
