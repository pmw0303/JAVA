package Day07;

import java.util.Scanner;

public class Member {

	// �ʵ�

	int mno; // 
	String id;
	String pw;
	String name;
	String phone;

	// ������
		// 1. �� ������
		public Member() {
			
		}
		// 2. ��� �ʵ带 �޴� ������ 
		public Member(int mno, String id, String pw, String name, String phone) {
			super();
			this.mno = mno;
			this.id = id;
			this.pw = pw;
			this.name = name;
			this.phone = phone;
		}

	// �޼ҵ�

		// 1. ȸ������ [�μ� X ��ȯ O]
	boolean ȸ������() {		
		System.out.println("------------------ȸ������ ������------------------");
		System.out.print("���̵� : "); String id = Day07_5_BookApplication.sc.next();
		System.out.print("��й�ȣ : "); String pw = Day07_5_BookApplication.sc.next();
		System.out.print("�̸� : "); String name = Day07_5_BookApplication.sc.next();
		System.out.print("����ó : "); String phone = Day07_5_BookApplication.sc.next();
														// Ŭ������.�ʵ��.�Լ���()

		// ���̵� �ߺ� üũ
		
		for(Member temp : Day07_5_BookApplication.member) {
			if(temp != null && temp.id.equals(id)) {
				// ���� ���� �ƴϸ鼭 �Է¹��� ���̵�� ����
				System.err.println("�˸�>> ���� ������� ���̵��Դϴ�");
				return false; // ���̵� �ߺ��Ǿ��� ������ false
			}
		}
		
		// ȸ����ȣ �ڵ����� [ ���� �ֱ� ������ ȸ���� ��ȣ + 1 ]
		
		int bno = 0;
		int j = 0;
		for (Member temp : Day07_5_BookApplication.member) {
			if (temp == null) {
				if (j == 0) { // ù��° �ε����� null -> ùȸ��
					bno = 1;
					break;
				} else {
					bno = Day07_5_BookApplication.member[j - 1].mno + 1;
					break;
				}

			}
			j++;
		}
		
		// 2. 4�� ���� -> ��üȭ -> 1��
		Member member = new Member(bno, id, pw, name, phone); // ��� �ʵ� �޴� �����ڷ� ��ü ����
		// 3. �迭 �� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ�
		// for(int i = 0 ; i < Day07_5_BookApplication.member.length ; i++) 
		int i = 0; 
		for( Member temp : Day07_5_BookApplication.member)	{
			 if(temp == null) { // ��������� �� �ε����� ����
				 Day07_5_BookApplication.member[i] = member; 
				 return true; // ȸ������ �޼ҵ� ���� / ��ȯ = true
			 }
		 } i++;
		 // 4. ���� ���� �� true ��ȯ ���н� false
		return false; // ȸ������ ����				
	}
	
		
	// 2. �α��� [�μ� X ��ȯ O]
	String �α���() {
		System.out.println("------------------�α��� ������------------------");
		System.out.print("���̵� : "); String id = Day07_5_BookApplication.sc.next();
		System.out.print("��й�ȣ : "); String pw = Day07_5_BookApplication.sc.next();
		
		for(Member temp : Day07_5_BookApplication.member) {
			
			if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
				return temp.id;
				// ���� �� �Է��� id ��ȯ
			}
		}
		// ���� �� null ��ȯ
		return null;
	}
	 
		// 3. ���̵�ã�� [ �μ� X ��ȯ X ]
	void ���̵�ã��() {
		System.out.println("-------------���̵� ã��------------");
		System.out.println("�̸� �Է� : "); String name = Day07_5_BookApplication.sc.next();
		System.out.println("��ȭ��ȣ �Է� : "); String phone = Day07_5_BookApplication.sc.next();
		
		for(Member temp : Day07_5_BookApplication.member) {
			
			if(temp.name != null && temp.name.equals(name) && temp.id.equals(phone)) {
				System.out.println(temp.name + "�� Ȯ�εǾ����ϴ�");
				System.out.println("���̵�� " + temp.id + "�Դϴ�");
				return;
			} 
				
		} 
		System.err.println("�˸�>> ȸ�������� �����ϴ�");
		
	}
	
		// 4. ��й�ȣã�� [ �μ� X ��ȯ X ]
		void ��й�ȣã��() {
			System.out.println("-------------��й�ȣ ã��------------");
			System.out.println("���̵� �Է� : ");
			String id = Day07_5_BookApplication.sc.next();
			
			System.out.println("��ȭ��ȣ �Է� : ");
			String phone = Day07_5_BookApplication.sc.next();

			for (Member temp : Day07_5_BookApplication.member) {

				if (temp.id != null && temp.name.equals(id) && temp.id.equals(phone)) {
					System.out.println(temp.id + "�� Ȯ�εǾ����ϴ�");
					System.out.println("��й�ȣ�� " + temp.pw + "�Դϴ�");
					return;
				}

			}
			System.err.println("�˸�>> ȸ�������� �����ϴ�");
		}

		// 5. ȸ��Ż��(����)
	
		// 6. ȸ������(����)

}
