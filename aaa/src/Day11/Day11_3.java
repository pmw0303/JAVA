package Day11;

public class Day11_3 {

	// p422 예외 던지기
		// 목적 : 모든 메소드에서 try-catch 사용시 코드 복잡 -> 한곳으로 이동
	
	// p448
		// 1. 4
		// 2. 3
		// 3. 4
		// 4. 2
		// 5. 3
		// 6. 10-숫자로변환할수없음-10-인덱스를초과했음-10
		
	
	public static void main(String[] args) {
		
				
		try{
			findclass();
		}catch(Exception e) {}

	
		try {
			withdraw(30000);
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
		public static void findclass() throws Exception {
			
		Class clazz = Class.forName("java.lang.String2");
		
			
//		try { // 예외가 발생할 것 같은 코드(실행예외) / 일반예외(무조건)
//			Class clazz = Class.forName("java.lang.String2");
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		}
	

	public static void withdraw(int money) throws Exception{
		if(20000 < money) {
			throw new Exception("잔고부족");
		}
	}
}	