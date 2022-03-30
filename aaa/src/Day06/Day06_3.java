package Day06;

import java.util.Scanner;

public class Day06_3 {

//	ȸ���� ���α׷�[Ŭ����]
//	
//	0. ȸ�� ���� -> ȸ�� Ŭ���� �����
//		1) �ʵ� - ���̵�, ��й�ȣ, �̸�, ��ȭ��ȣ
//		
//	
//	1. �ʱ�޴� - 1. ȸ������ , 2. �α��� , 3. ���̵�ã�� , 4. ��й�ȣ��
//		1) ȸ�����Խ� �Է¹޾� ����
//		2) �α��ν� ���̵�� ��й�ȣ�� �����ϸ� �α���
//		3) ���̵�ã��� �̸��� ��ȭ��ȣ�� �����ϸ� ���̵� ���
//		4) ��й�ȣã��� ���̵�� ��ȭ��ȣ�� �����ϸ� ��й�ȣ ���

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Member[] memberlist = new Member[100];
		// Member Ŭ������ ������� ��ü 100���� ������ �� �ִ� �迭 ����

		while (true) { // ���α׷� ���� while [ �������� X ]

			System.out.println("------------ȸ��--------------");
			System.out.println("1. ȸ������ | 2. �α��� | 3. ���̵�ã�� | 4. ��й�ȣã��");
			System.out.println("����>> ");
			int ch = sc.nextInt();

			if (ch == 1) { // ȸ������

				// id, pw, name, phone �Է¹ޱ�
				System.out.println("���̵� �Է� : ");
				String id = sc.next();
				System.out.println("��й�ȣ �Է� : ");
				String pw = sc.next();
				System.out.println("�̸� �Է� : ");
				String name = sc.next();
				System.out.println("��ȭ��ȣ �Է� : ");
				String phone = sc.next();

				// ��ü ����
				Member member = new Member();
				// �Է¹��� ���� 4���� ��ü �� �ʵ忡 ����
				member.id = id;
				member.pw = pw;
				member.name = name;
				member.phone = phone;

				boolean idcheck = false;
				for (Member temp : memberlist) { // ���̵� �ߺ� üũ

					if (temp != null && temp.id.equals(id)) {
						System.err.println("�˸�>> �ߺ��� ���̵��Դϴ�");
						idcheck = true;
						break;
					}
				}

				if (idcheck == false) {

					// ������ ��ü�� �����ϴ� �迭�� ����
					// ���� �ε��� ã�� / ������ �ƴϸ� ����ȸ�� ����
					int i = 0; // �ε��� ��ġ ����
					for (Member temp : memberlist) {
						// memberlist �迭�� member ��ü �ϳ��� temp ���� �ݺ�
						// ���� �ε����� ��ü ����

						if (temp == null) {// �ش� ��ü�� null -> ��ü�� ����
							memberlist[i] = member;
							System.err.println("�˸�>> ȸ������ �Ϸ�");
							break;
						} // ȸ�� ���� for end
						i++; // �ε��� ����
					}
				}
			} else if (ch == 2) { // �α���
				System.out.println("--------�α���----------");
				System.out.println("���̵� : ");
				String loginid = sc.next();
				System.out.println("��й�ȣ : ");
				String loginpw = sc.next();

				// ���� �迭[ ȸ������Ʈ ] �� �Է¹��� ���� ��
				boolean logincheck = false;
				for (Member temp : memberlist) {
					// memberlist �� 0�� �ε������� �� �ε������� �ϳ��� temp ����
					if (temp != null && temp.id.equals(loginid) && temp.pw.equals(loginpw)) {
						System.err.println("�˸�>> �α��� ����");
						logincheck = true;
					}
				}
				// �α��� ���� ����
				if (logincheck == false) {
					System.err.println("�˸�>> ȸ�� ������ �����ϴ�");
				}
			} else if (ch == 3) { // ���̵� ã��
//				1. �̸��� ����ó �Է¹ޱ�
//				2. �迭�� ������ �̸��� ����ó ���� Ȯ��
//				3. ������ ��ü�� ������ �ش� ���̵� ���
//				4. ������ ���ٰ� ���
				System.out.println("----------���̵� ã��------------");
				System.out.println("�̸� �Է� : ");
				String name = sc.next();
				System.out.println("��ȭ��ȣ �Է� : ");
				String phone = sc.next();
				// 1��

				boolean findcheck = false;
				for (Member temp : memberlist) { // 2��

					if (temp != null && temp.name.equals(name) && temp.phone.equals(phone)) {
						System.err.println("�˸�>> ���̵� ã�� ����");
						System.out.println("���̵� : " + temp.id);
						findcheck = true;
						break; // 3��
					}
				} // 4��
				if (findcheck == false) {
					System.err.println("�˸�>> ȸ�������� �������� �ʽ��ϴ�");

				}

			} else if (ch == 4) { // ��й�ȣ ã��

				System.out.println("���̵� : ");
				String id = sc.next();
				System.out.println("��ȭ��ȣ : ");
				String phone = sc.next();

				boolean findcheck = false;
				for (Member temp : memberlist) {
					if (temp != null && temp.id.equals(id) && temp.phone.equals(phone)) {
						System.err.println("�˸�>> ��й�ȣ ã�� ����");
						System.err.println("��й�ȣ : " + temp.pw);
						findcheck = true;
						break;
					}
				}

				if (findcheck == false) {
					System.err.println("�˸�>> ȸ�������� �������� �ʽ��ϴ�");
				}

			} else {
				System.err.println("�˸�>> �� �� ���� ��ȣ�Դϴ�");
			}

		} // ���α׷� ���� while end

	}
}
