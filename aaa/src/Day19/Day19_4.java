package Day19;

import java.util.Hashtable;
import java.util.Scanner;

public class Day19_4 {

	public static void main(String[] args) {
		
		// p747
		// 1. Hashtable ��ü ����
		Hashtable<String, String> map = new Hashtable<>();
		
		// 2. map ��ü �߰�
		map.put("spring" , "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵� �Է�"); String id = scanner.next();
			System.out.println("��й�ȣ �Է�"); String pw = scanner.next();
			
			// ���� map ��ü ���� �ش� key�� �����ϸ�  .contains(Ű) ������ true
			if(map.containsKey(id)) { // �Է��� id�� map Ű�� �����ϸ�
				if(map.get(id).equals(pw)) {
					System.out.println("�α����� �Ǿ����ϴ�");
				}else {
					System.out.println("PW�� ��ġ���� �ʽ��ϴ�");
				}
				
			}else {
				System.out.println("ID�� �������� �ʽ��ϴ�");
			}
		}
	
	}
}
