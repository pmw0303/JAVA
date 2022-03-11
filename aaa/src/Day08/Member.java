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
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	
	// 1. ȸ������ [�μ� X ��ȯ O]
		void signIn() {		
			System.out.println("------------------ȸ������ ������------------------");
			System.out.print("���̵� : "); String id = Day08_5.scan.next();
			System.out.print("��й�ȣ : "); String pw = Day08_5.scan.next();
			System.out.print("�̸� : "); String name = Day08_5.scan.next();
			System.out.print("����ó : "); String phone = Day08_5.scan.next();
															// Ŭ������.�ʵ��.�Լ���()

			// ���̵� �ߺ� üũ
			boolean idcheck = true;
			for(Member temp : Day08_5.members) {
				if(temp != null && temp.id.equals(id)) {
					// ���� ���� �ƴϸ鼭 �Է¹��� ���̵�� ����
					System.err.println("�˸�>> ���� ������� ���̵��Դϴ�");
					idcheck = false;
					break;
					// ���̵� �ߺ��Ǿ��� ������ false
				}
			}
			
			
			
			// 2. 4�� ���� -> ��üȭ -> 1��
			Member member = new Member(id, pw, name, phone); // ��� �ʵ� �޴� �����ڷ� ��ü ����
			 
			int i = 0 ; // �ݺ�Ƚ�� [ �ε���üũ ]
			for( Member temp : Day08_5.members ) {
				if( temp == null ) { // ������̸� 
					Day08_5.members[i] = member; // �� �ε����� ���ο� ȸ�� ����
					 // ȸ������ �޼ҵ� ���� ~~~~~~~ [ ��ȯ : true ]
					break;
				}
				i++; // i���� 
			}
			 if(idcheck) {
				 System.out.println("ȸ������ ����");
			 }
		}
		// 2. �α��� [�μ� X ��ȯ O]
		String logIn() {
			System.out.println("------------------�α��� ������------------------");
			System.out.print("���̵� : "); String id = Day08_5.scan.next();
			System.out.print("��й�ȣ : "); String pw = Day08_5.scan.next();
			
			for(Member temp : Day08_5.members) {
				
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
			System.out.println("�̸� �Է� : "); String name = Day08_5.scan.next();
			System.out.println("��ȭ��ȣ �Է� : "); String phone = Day08_5.scan.next();
			
			for(Member temp : Day08_5.members) {
				
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
				String id = Day08_5.scan.next();
				
				System.out.println("��ȭ��ȣ �Է� : ");
				String phone = Day08_5.scan.next();

				for (Member temp : Day08_5.members) {

					if (temp.id != null && temp.name.equals(id) && temp.id.equals(phone)) {
						System.out.println(temp.id + "�� Ȯ�εǾ����ϴ�");
						System.out.println("��й�ȣ�� " + temp.pw + "�Դϴ�");
						return;
					}

				}
				System.err.println("�˸�>> ȸ�������� �����ϴ�");
			}

}
