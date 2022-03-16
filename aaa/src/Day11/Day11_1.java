package Day11;

public class Day11_1 {

	// p386
	// 1. 3
	// 2. 4
	// 3.

	private static void printSound(Soundable soundable) {
		// 접근제한자 정적 반환타입 메소드명(인수[변수, 배열, 객체, 인터페이스])
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
		
		// 5. 익명객체
		
		Action action = new Action() {
			
			public void work() {
				System.out.println("복사를합니다");
			}
		};
		
	action.work();
	
	

}
}
