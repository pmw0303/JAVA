package Day11;

public class Day11_1 {

	// p386
	// 1. 3
	// 2. 4
	// 3.

	private static void printSound(Soundable soundable) {
		// ���������� ���� ��ȯŸ�� �޼ҵ��(�μ�[����, �迭, ��ü, �������̽�])
		System.out.println(soundable.sound());
	}

		public static void dbWork(DAO dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
		
	}
		


	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());

		// 4. Dao Dto
		
		dbWork(new Oracle());
		dbWork(new MySql());
		
		// 5. �͸�ü
		
		Action action = new Action() {
			
			public void work() {
				System.out.println("���縦�մϴ�");
			}
		};
		
	action.work();
	
	

}
}
