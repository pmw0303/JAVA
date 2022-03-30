package Day19;

import java.util.Hashtable;
import java.util.Scanner;

public class Day19_4 {

	public static void main(String[] args) {
		
		// p747
		// 1. Hashtable 객체 선언
		Hashtable<String, String> map = new Hashtable<>();
		
		// 2. map 객체 추가
		map.put("spring" , "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디 입력"); String id = scanner.next();
			System.out.println("비밀번호 입력"); String pw = scanner.next();
			
			// 만약 map 객체 내에 해당 key가 존재하면  .contains(키) 있으면 true
			if(map.containsKey(id)) { // 입력한 id가 map 키에 존재하면
				if(map.get(id).equals(pw)) {
					System.out.println("로그인이 되었습니다");
				}else {
					System.out.println("PW가 일치하지 않습니다");
				}
				
			}else {
				System.out.println("ID가 존재하지 않습니다");
			}
		}
	
	}
}
