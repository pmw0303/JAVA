package Day07;

public class Book {
	// �ʵ�
	String ISBN;
	String bname;
	String bwriter;
	boolean brent;
	String mid;

	// ������

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String iSBN, String bname, String bwriter, Boolean brent, String mid) {
		super();
		ISBN = iSBN;
		this.bname = bname;
		this.bwriter = bwriter;
		this.brent = brent;
		this.mid = mid;
	}
	
	
	
	// �޼ҵ�
	
	// 1. �����˻�
	void �����˻�() {
		
		System.out.println("�˻��� ���� ���� �Է� : ");
		String bname = Day07_5_BookApplication.sc.next();
		
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.bname.equals(bname)) {
				System.out.println("�˻��� å " + bname +" ��(��) �ֽ��ϴ�");
				return;
			}
		}
		System.out.println("å�� �������� �ʽ��ϴ�");
		
	}
	
	// 2. �������
	void �������() {
		
		System.out.println("--------���� ��� ������---------");
		System.out.println("ISBN\t������\t�۰�\t�뿩����");
		
		for (Book temp : Day07_5_BookApplication.books) {
			if (temp != null) { // ������ �����ϸ� **
				if (temp.brent) { // �뿩�� ����
					System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "�뿩����");
				} else // �뿩�� �Ұ�
					System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "�뿩��");
			}
		}
	}
	
	// 3. �����뿩
	void �����뿩(String loginid) {
		
		System.out.println("--------���� �뿩 ������---------");
		System.out.println("�뿩�� å ISBN �Է� : ");
		
		String isbn = Day07_5_BookApplication.sc.next();
		
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(isbn)  ) {
										// true
				if (temp.brent) {
					System.err.println("�˸�>> �ش� �뿩�Ǿ����ϴ�");
					temp.brent = false;
					temp.mid = loginid;
					return;
				} else {
					System.err.println("�˸�>> �뿩�� �Ұ����մϴ�");
					return;
				}
			}
		}
		System.out.println("�˸�>> �ش� ������ �������� �ʽ��ϴ�.");
	}
	
	// 4. �ݳ�
	void �����ݳ�(String loginid) {
		System.out.println("--------���� �ݳ� ������---------");
		�����뿩���(loginid);
		System.out.println("���� ISBN "); String isbn = Day07_5_BookApplication.sc.next();
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(isbn)) {
				if(temp.mid.equals(loginid)) {
					if(temp.brent) {
						System.out.println("�˸�>> ���� ������ �뿩���� �ƴմϴ�");
					}else {
						System.out.println("�˸�>> �ݳ� �Ϸ�");
						temp.brent = true;
						temp.mid = null;
						return;
					}
				}else {
					System.out.println("�˸�>> ȸ������ �뿩�� ������ �ƴմϴ�");
				}
			}
		}
		System.out.println("�˸�>> ������ ����ISBN�� �����ϴ�");
	}
	
	
	void �����뿩���(String loginid) {
		System.out.println("--------���� ��� ������---------");
		System.out.println("ISBN\t������\t�۰�\t�뿩����");
		
		for (Book temp : Day07_5_BookApplication.books) {
			if (temp != null && temp.mid.equals(loginid)) { // ������ �����ϸ� **
			// ������ �����ϸ鼭 �뿩 id �� ���� �α��ε� id�� ������
				System.out.println(temp.ISBN + "\t" + temp.bname + "\t" + temp.bwriter + "\t" + "�뿩��");

			}
		}
	}
	
	// 5. ���
	void �������() {
		
		System.out.println("--------���� ��� ������---------");
		// 1. �Է¹ޱ�
		System.out.println("ISBN : "); String isbn = Day07_5_BookApplication.sc.next();
		System.out.println("������ : "); String bname = Day07_5_BookApplication.sc.next();
		System.out.println("�۰� : "); String bwriter = Day07_5_BookApplication.sc.next();
		
		// �ߺ�üũ ISBN
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp != null && temp.ISBN.equals(isbn)) {
				System.err.println("�˸�>> �̹� �����մϴ� [ ��Ͻ��� ] ");
				return;
			}
		}
		
		
		// 2. ��üȭ [ �뿩���� = true, �뿩ȸ��id = null ]
		Book book = new Book(isbn, bname, bwriter, true, null);
		
		// 3. �迭 ����[ �ֱ� ]
		int i = 0;
		for(Book temp : Day07_5_BookApplication.books) {
			if(temp == null) {
				Day07_5_BookApplication.books[i] = book;
				System.err.println("�˸�>> ������ ��ϵǾ����ϴ�");
				return;
			}
			i++;
		}
	}
	
	// 6. ����
	void ��������() {
		
	}
	
}
