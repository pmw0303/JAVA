package Day08;


public class Member {

	String id;
	String pw;
	String name;
	String phone;
	
	public Member() {
		
	}
	// 2. 모든 필드를 받는 생성자 
	public Member(String id, String pw, String name, String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.phone = phone;
	}
	
	// 1. 회원가입 [인수 X 반환 O]
		void signIn() {		
			System.out.println("------------------회원가입 페이지------------------");
			System.out.print("아이디 : "); String id = Day08_5.scan.next();
			System.out.print("비밀번호 : "); String pw = Day08_5.scan.next();
			System.out.print("이름 : "); String name = Day08_5.scan.next();
			System.out.print("연락처 : "); String phone = Day08_5.scan.next();
															// 클래스명.필드명.함수명()

			// 아이디 중복 체크
			boolean idcheck = true;
			for(Member temp : Day08_5.members) {
				if(temp != null && temp.id.equals(id)) {
					// 만약 공백 아니면서 입력받은 아이디와 동일
					System.err.println("알림>> 현재 사용중인 아이디입니다");
					idcheck = false;
					break;
					// 아이디가 중복되었기 때문에 false
				}
			}
			
			
			
			// 2. 4개 변수 -> 객체화 -> 1개
			Member member = new Member(id, pw, name, phone); // 모든 필드 받는 생성자로 객체 생성
			 
			int i = 0 ; // 반복횟수 [ 인덱스체크 ]
			for( Member temp : Day08_5.members ) {
				if( temp == null ) { // 빈공간이면 
					Day08_5.members[i] = member; // 빈 인덱스에 새로운 회원 대입
					 // 회원가입 메소드 종료 ~~~~~~~ [ 반환 : true ]
					break;
				}
				i++; // i증가 
			}
			 if(idcheck) {
				 System.out.println("회원가입 성공");
			 }
		}
		// 2. 로그인 [인수 X 반환 O]
		String logIn() {
			System.out.println("------------------로그인 페이지------------------");
			System.out.print("아이디 : "); String id = Day08_5.scan.next();
			System.out.print("비밀번호 : "); String pw = Day08_5.scan.next();
			
			for(Member temp : Day08_5.members) {
				
				if(temp != null && temp.id.equals(id) && temp.pw.equals(pw)) {
					return temp.id;
					// 성공 시 입력한 id 반환
				}
			}
			// 실패 시 null 반환
			return null;
		}
		 
			// 3. 아이디찾기 [ 인수 X 반환 X ]
		void findId() {
			System.out.println("-------------아이디 찾기------------");
			System.out.println("이름 입력 : "); String name = Day08_5.scan.next();
			System.out.println("전화번호 입력 : "); String phone = Day08_5.scan.next();
			
			for(Member temp : Day08_5.members) {
				
				if(temp.name != null && temp.name.equals(name) && temp.id.equals(phone)) {
					System.out.println(temp.name + "님 확인되었습니다");
					System.out.println("아이디는 " + temp.id + "입니다");
					return;
				} 
					
			} 
			System.err.println("알림>> 회원정보가 없습니다");
			
		}
		
			// 4. 비밀번호찾기 [ 인수 X 반환 X ]
			void findPw() {
				System.out.println("-------------비밀번호 찾기------------");
				System.out.println("아이디 입력 : ");
				String id = Day08_5.scan.next();
				
				System.out.println("전화번호 입력 : ");
				String phone = Day08_5.scan.next();

				for (Member temp : Day08_5.members) {

					if (temp.id != null && temp.name.equals(id) && temp.id.equals(phone)) {
						System.out.println(temp.id + "님 확인되었습니다");
						System.out.println("비밀번호는 " + temp.pw + "입니다");
						return;
					}

				}
				System.err.println("알림>> 회원정보가 없습니다");
			}

}
