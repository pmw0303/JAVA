package Day08;

import java.util.Scanner;




public class Bank {
	static Scanner sc = new Scanner(System.in);
	static Member[] member = new Member[1000]; // ��� Ŭ�������� ���Ǵ� �迭
	
	public static void main(String[] args) {
		
	Bank menu = new Bank();
	menu.menu();
	
	}
	
	void menu() {
		
		while(true) {
			System.out.println("---------------- ���� �뿩 ���α׷� --------------------");
			System.out.println("1. ȸ������ | 2. �α��� | 3. ���̵�ã�� | 4. ��й�ȣã��");
			Member member = new Member(); 
			
			int ch = sc.nextInt();
				if(ch==1) { // ȸ������
					boolean result = member.signIn(); // ȸ������ �޼ҵ� ȣ��
					if(result) {
						System.err.println("�˸�>> ȸ������ ����");
					}else {
						System.err.println("�˸�>> ȸ������ ����");
					}
					
				}else if(ch==2) { 
					
					// �α���
					String result = member.logIn();
					if(result == null) {
						// 2. ������ �޴� �޼ҵ� ȣ��
						System.err.println("�˸�>> ȸ�������� �����ϴ�");
					}else if(result.equals("admin")) {
						System.err.println("�˸�>> ������ �޴��Դϴ�");
						
					}else {
						System.out.println("�˸�>> " + result + "�� �ȳ��ϼ���");
					
					}
					
						// 1. �Ϲ�ȸ�� �޴� �޼ҵ� ȣ��
						
					
				
					
				}else if(ch==3) { // ���̵�ã��
					member.findId();
					
				}else if(ch==4) { // ��й�ȣã��
					member.findPw();
					
				}else {
					System.err.println("�˸�>> �� �� ���� ��ȣ�Դϴ�.");
				}
			}
	}
}
