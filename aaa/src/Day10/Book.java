package Day10;

public class Book {

	//�ʵ�
	private String ������;
	private String �۰�;
	
	//������
	public Book() {	
	}

	public Book(String ������, String �۰�) {
		super();
		this.������ = ������;
		this.�۰� = �۰�;
	}

	//�޼ҵ�

	public String get������() {
		return ������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public String get�۰�() {
		return �۰�;
	}

	public void set�۰�(String �۰�) {
		this.�۰� = �۰�;
	}
	
}
