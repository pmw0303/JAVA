package Day09;

import java.util.Random;
import java.util.Scanner;

public class Controller { 
	// 해당 클래스는 은행 관련 컨트롤러
	// M : 모델[데이터]
	// V : 뷰[입출력]
	// C : 모델과 뷰 연결 역할
	
	// 뷰애서 요청하는 서비스[기능] 제공
//		1. **계좌생성 C
	public String 계좌생성(String pw, String name, int bankNo) {
		// 1. 입력받은 값 가져온다
			// 계좌번호 자동생성
		String accNo = null;
		while(true) {
		Random random = new Random(); // 4자리
		int 난수 = random.nextInt(10000); // 0 ~ 9999 사이
		accNo = String.format("%04d", 난수);
		// %d : 정수 / %4d : 4자리 정수 / %04d : 공백처리 4자리 정수
		
		// 중복체크
		Boolean 계좌번호중복 = false;
		for (Bank temp2 : Day09_6_은행계좌프로그램.accList) {
			if (temp2 != null && temp2.getAccNo().equals(accNo)) {
				// 기존 배열 내의 계좌번호와 동일하면
				계좌번호중복 = true; // 무한반복
			}
		}if(계좌번호중복 == false) // 중복이 없으면
			break; // 무한루프 종료
	}
		
		
		
		// 2. 객체화 -> 다수의 변수를 하나의 객체로 만듬
		Bank temp = null; // 빈 객체 생성
		if(bankNo == 1) {
			temp = new KookminBank(accNo, pw, name, 0);
		}else if(bankNo == 2) {
			temp = new ShinhanBank(accNo, pw, name, 0);
		}else if(bankNo == 3) {
			temp = new HanaBank(accNo, pw, name, 0);
		}
		
		// 3. 배열에 저장 [DB/file]
		int i = 0;
		for(Bank temp2 : Day09_6_은행계좌프로그램.accList) {
			if(temp2 == null) {
				Day09_6_은행계좌프로그램.accList[i] = temp;
				System.out.println("+++ 계좌 등록 +++");
				return accNo; // 
			}
			i++;
		}		
		return null;
	}
//		2. **입금 U
	public boolean 입금(String accNo, int input) {
		// 동일한 계좌번호를 찾아서
		int i =0;
		for(Bank temp : Day09_6_은행계좌프로그램.accList) {
			if(temp != null && temp.getAccNo().equals(accNo)) {
				// 동일한 계좌번호가 있으면 입금
				// 없으면 실패
				Day09_6_은행계좌프로그램.accList[i].setMoney(temp.getMoney()+input);
												// setter = 기존금액 + 입금액
				return true;
			}i++;
		}
		// 동일한 계좌번호가 없으면 입금 실패
		return false;
	}
//		3. **출금 U
	public int 출금(String accNo, String pw, int output) {
		// 동일한 계좌번호를 찾아서
		int i = 0;
		for(Bank temp : Day09_6_은행계좌프로그램.accList) {
			if (temp != null && temp.getAccNo().equals(accNo) && temp.getPw().equals(pw)) {
				if(temp.getMoney() < output)
				return 1; // 잔액이 부족을 반환

			} else {
				Day09_6_은행계좌프로그램.accList[i].setMoney(temp.getMoney() - output);
				return 2; // 출금 성공
			}
		}
		return 3; // 동일한 정보가 아닐 경우 실패를 의미
		// 해당 계좌번호의 비밀번호가 일치 확인
		// 비밀번호가 일치하면 출금
		// 아니면 출금 실패
		
	}
//		4. **이체 U
	public int 이체(String accNo, String pw, int 이체금액, String 받는계좌) {
		// 동일한 계좌번호와 비밀번호 일치
		// 받는계좌 찾기
		// 본인계좌에서 이체금액 빼기
		// 받는계좌에서 이체금액 더하기
		// 리턴 경우 수 : 본인계좌정보틀림, 받는계좌정보틀림, 잔고부족
		int i = 0;
		for(Bank temp : Day09_6_은행계좌프로그램.accList) {
			if(temp != null && temp.getAccNo().equals(accNo) 
					&& temp.getPw().equals(pw)) {
				int j =0;
				for(Bank temp2 : Day09_6_은행계좌프로그램.accList) {
					if(temp2 != null && temp.getAccNo().equals(받는계좌)) {
						if(temp.getMoney() < 이체금액) {
							// 잔액부족
							return 1;
						}else {
							Day09_6_은행계좌프로그램.accList[i].setMoney(temp.getMoney()-이체금액);
							Day09_6_은행계좌프로그램.accList[j].setMoney(temp2.getMoney()+이체금액);
							return 2; // 성공
						}
					}j++;
				}// 받는계좌 없음
//				return 3;
			} 
			i++;
		}
		
		return 4;
	}
//		5. **내계좌목록 R
	public Bank[] 계좌목록(String name) {
		// 입력받은 계좌주의 계좌목록 만들어서 반환
		// 동일한 계좌주 찾아서 배열달아 넘기기
		Bank[] myAcc = new Bank[100]; // 배열 생성
		for(Bank temp : Day09_6_은행계좌프로그램.accList	) {
			if(temp != null && temp.getName().equals(name)) {
				// 해당 계좌내 계좌주와 인수의 계좌주와 동일하면
				// myAcc(배열)의 빈 공간을 찾아서 내 계좌목록에 넣기
				int i = 0;
				for(Bank temp2 : myAcc) {
					if(temp2 == null) {
						myAcc[i] = temp; 
						break;
					}i++;
				}
			}
		}
		return myAcc;
	}
//		6. **대출 U싸지
	public boolean 대출() {
		return false;
	}

} // 7679 1    4242 1
