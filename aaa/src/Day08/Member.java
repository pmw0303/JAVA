package Day08;


public class Member {

	String id;
	String pw;
	String name;
	String phone;
	
	public Member() {
		
	}
	// 2. ��� �ʵ带 �޴� ������ 
	public Member(String id, String pw, String name, String phone) {
		super();
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	
	// 1. ȸ������ [�μ� X ��ȯ O]
		boolean signIn() {		
			System.out.println("------------------ȸ������ ������------------------");
			System.out.print("���̵� : "); String id = Bank.sc.next();
			System.out.print("��й�ȣ : "); String pw = Bank.sc.next();
			System.out.print("�̸� : "); String name = Bank.sc.next();
			System.out.print("����ó : "); String phone = Bank.sc.next();
															// Ŭ������.�ʵ��.�Լ���()

			// ���̵� �ߺ� üũ
			
			for(Member temp : Bank.member) {
				if(temp != null && temp.id.equals(id)) {
					// ���� ���� �ƴϸ鼭 �Է¹��� ���̵�� ����
					System.err.println("�˸�>> ���� ������� ���̵��Դϴ�");
					return false; // ���̵� �ߺ��Ǿ��� ������ false
				}
			}
			
			
			
			// 2. 4�� ���� -> ��üȭ -> 1��
			Member member = new Member(id, pw, name, phone); // ��� �ʵ� �޴� �����ڷ� ��ü ����
			// 3. �迭 �� �� ������ ã�Ƽ� ���ο� ȸ��[��ü] �ֱ�
			// for(int i = 0 ; i < Day07_5_BookApplication.member.length ; i++) 
			int i = 0; 
			for( Member temp : Bank.member)	{
				 if(temp == null) { // ��������� �� �ε����� ����
					 Bank.member[i] = member; 
					 return true; // ȸ������ �޼ҵ� ���� / ��ȯ = true
				 }
			 } i++;
			 // 4. ���� ���� �� true ��ȯ ���н� false
			return false; // ȸ������ ����				
		}
		// 2. �α��� [�μ� X ��ȯ O]
		String logIn() {
			System.out.println("------------------�α��� ������------------------");
			System.out.print("���̵� : "); String id = Bank.sc.next();
			System.out.print("��й�ȣ : "); String pw = Bank.sc.next();
			
			for(Member temp : Bank.member) {
				
				if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
					return temp.id;
					// ���� �� �Է��� id ��ȯ
				}
			}
			// ���� �� null ��ȯ
			return null;
		}
		 
			// 3. ���̵�ã�� [ �μ� X ��ȯ X ]
		void findId() {
			System.out.println("-------------���̵� ã��------------");
			System.out.println("�̸� �Է� : "); String name = Bank.sc.next();
			System.out.println("��ȭ��ȣ �Է� : "); String phone = Bank.sc.next();
			
			for(Member temp : Bank.member) {
				
				if(temp.name != null && temp.name.equals(name) && temp.id.equals(phone)) {
					System.out.println(temp.name + "�� Ȯ�εǾ����ϴ�");
					System.out.println("���̵�� " + temp.id + "�Դϴ�");
					return;
				} 
					
			} 
			System.err.println("�˸�>> ȸ�������� �����ϴ�");
			
		}
		
			// 4. ��й�ȣã�� [ �μ� X ��ȯ X ]
			void findPw() {
				System.out.println("-------------��й�ȣ ã��------------");
				System.out.println("���̵� �Է� : ");
				String id = Bank.sc.next();
				
				System.out.println("��ȭ��ȣ �Է� : ");
				String phone = Bank.sc.next();

				for (Member temp : Bank.member) {

					if (temp.id != null && temp.name.equals(id) && temp.id.equals(phone)) {
						System.out.println(temp.id + "�� Ȯ�εǾ����ϴ�");
						System.out.println("��й�ȣ�� " + temp.pw + "�Դϴ�");
						return;
					}

				}
				System.err.println("�˸�>> ȸ�������� �����ϴ�");
			}

}
