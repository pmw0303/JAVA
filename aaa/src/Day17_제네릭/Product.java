package Day17_���׸�;

public class Product<Ÿ��1, Ÿ��2> {
				// �ܺηκ��� ���� �ڷ���
	// �ʵ�
	private Ÿ��1 kind;
	private Ÿ��2 model;
	
	public static <Ÿ��1> Box<Ÿ��1> boxing(Ÿ��1 kind){
		// �޼ҵ� ����
		// ���������� ����  ��ȯŸ�� = <Ÿ��1> Box<Ÿ��1> boxing(Ÿ��)
		
		Box<Ÿ��1> box = new Box<>();
		box.set(kind);
		
		return box;
	}
	
	// get, set
	public Ÿ��1 getKind() {
		return kind;
	}
	public void setKind(Ÿ��1 kind) {
		this.kind = kind;
	}
	public Ÿ��2 getModel() {
		return model;
	}
	public void setModel(Ÿ��2 model) {
		this.model = model;
	}
	
	

}
