package Day09;

import java.util.Scanner;

public class Day09_6_����������α׷� {

	// ����������α׷� [ ��� ]
			// ���� -> ����Ŭ����
			// ��������, ��������, �ϳ����� -> ����Ŭ����
			// �� ��� - 1. ���»��� 2. �Ա� 3. ��� 4. ��ü 
			// 			5. �����¸�� 6. ����
			
	//  ��� Ŭ�������� ����ϱ� ���� static �迭 ����
	public static Bank[] accList = new Bank[100];
			
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("-------���� ���α׷�---------");
			System.out.println("1. ���»���|2. �Ա�|3. ���|4. ��ü|5. ���¸��|6. ����");
			System.out.print("����>> "); int ch = sc.nextInt();
			
			Controller con = new Controller();
			
			if(ch ==1 ) {
				System.out.println("+++���� ����+++");
				System.out.println("��й�ȣ : ");
				String pw = sc.next();
				System.out.println("������ : ");
				String name = sc.next();
				System.out.println("���༱�� < 1. ����|2. ����|3. �ϳ�| >");
				int bankNo = sc.nextInt();
				
				// ��Ʈ�ѷ� ����
				String accNo = con.���»���(pw, name, bankNo); // �޼ҵ� ȣ�� [�μ�3��]/
				// �޼ҵ� ��ȯ ���� = ���¹�ȣ Ȥ�� null
				// �޼ҵ� ���� �� �޽��� ���
				if(accNo != null) {
					System.out.println("+++ ���� ���� +++");
					System.out.println("������ ���¹�ȣ : " + accNo);
				}else {
					System.out.println("�˸�>> ���µ�� ����");
				}
				
			}else if(ch ==2) {
				System.out.println("+++ �� �� +++");
				System.out.println("���¹�ȣ �Է� : ");
				String accNo = sc.next();
				System.out.println("�Աݾ� : ");
				int input = sc.nextInt();
				
				boolean result = con.�Ա�(accNo, input);
				con.�Ա�(accNo, input);
				if(result) {
					System.out.println("�˸�>> �Ա� ����");
					
				}else {
					System.out.println("�˸�>> �Ա� ����");
				}
				
			}else if(ch ==3) {
				System.out.println("+++ �� �� +++");
				System.out.println("���¹�ȣ �Է� : ");
				String accNo = sc.next();
				System.out.println("��й�ȣ �Է� : ");
				String pw = sc.next();
				System.out.println("��ݾ� : ");
				int output = sc.nextInt();
				
				int result = con.���(accNo, pw, output);
				con.���(accNo, pw, output);
				
				if(result == 1) {
					System.out.println("�˸�>> �ܾ� ����");
				}else if(result == 2) {
					System.out.println("�˸�>> ��� ����");
					
				}else if(result == 3) {
					System.out.println("�˸�>> ������ �ùٸ��� �ʽ��ϴ�");
				}
				
			}else if(ch ==4) {
				System.out.println("+++ �� ü +++");
				System.out.println("���¹�ȣ : ");
				String accNo = sc.next();
				System.out.println("��й�ȣ : ");
				String pw = sc.next();
				System.out.println("��ü�ݾ� : ");
				int ��ü�ݾ� = sc.nextInt();
				System.out.println("�޴°��� : ");
				String �޴°��� = sc.next();
				
				int result = con.��ü(accNo, pw, ��ü�ݾ�, �޴°���);
				if(result ==1) {
					System.out.println("�ܾ׺���");
				}else if(result ==2) {
					System.out.println("��ü����");
				}else if(result ==3) {
					System.out.println("�޴� ���� X");
				}else if(result ==4) {
					System.out.println("������ ���� X");
				}
				
			}else if(ch ==5) {
				System.out.println("+++���� ���+++");
				System.out.println("������ �Է� : ");
				String name = sc.next();
				Bank[] myAcc = con.���¸��(name);
								
				System.out.printf("*** %s���� ���� ��� ***\n", name);
				int i = 1;
				for(Bank temp : myAcc) {
					if(temp != null)
					System.out.println(i + "�� ���¹�ȣ : " + temp.getAccNo());	
					i++;
				}
								
			}else if(ch ==6) {
				System.out.println("+++ �� �� +++");
			}else {
				System.out.println("�˸�>> �߸��� ��ȣ�Դϴ�");
			}
		} // while end
	
	} // main end
} // class end
