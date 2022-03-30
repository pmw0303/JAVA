package Day19;

import java.util.HashMap;

public class Day19_3_Map {
	
	public static void main(String[] args) {
		
		// Map �÷��� = json
			// *Ű(��ü) , ��(��ü) => ��Ʈ��
			// Ű : set �÷���(�ߺ��Ұ�) �� : list �÷���(�ߺ�����)
			// HashMap Ŭ����
				// 1. map��ü��.put(Ű, ��) : ��Ʈ�� �߰�
				// 2. map��ü��.size() : ��Ʈ�� ����
				// 3. map��ü��.get(Ű) : �ش� Ű�� �� ���
				// 4. map��ü��.keySet() : map ��ü �� ��� Ű
				// 5. map��ü��.values() : map ��ü �� ��� ��
					// Ű ���� �ߺ� �ȵ� -> Ű�� �˸� ���� �� �� ����
					// for( �ӽð�ü�� : map��ü��.ketSet()) { }
				// 6. map��ü��.remove(Ű) : �ش� Ű�� ��Ʈ�� ����
				// 7. map��ü��.clear() : ��ü ��Ʈ�� ����
		
		// List : ����(�ε���) ����
		// Set : ���� ���� ����
		// Map : Ű�� ������ �̷���� ��Ʈ�� ���� [����X]
		
		// 1. HashMap Ŭ���� ��ü ����
		HashMap<String, Integer> map = new HashMap<>();
		// HashMap : �÷��� �����ӿ�ũ map Ŭ����
		// <���׸�, ���׸�> : key, value �� ������ ���׸�
			// map : map ��ü��(�ƹ��ų�)
				
		map.put("������", 30); System.out.println("Ȯ�� : " + map);
		// ����Ʈ = [ ��ü, ��ü, ... ]
		// ��Ʈ = [ ��ü, ��ü, ... ]
		// �� = { Ű = �� }
		map.put("ȫ�浿", 70); System.out.println("Ȯ�� : " + map);
		map.put("ȫ��", 75); System.out.println("Ȯ�� : " + map);
		map.put("ȫ�浿", 60); System.out.println("Ȯ�� : " + map); 
		// *Ű �ߺ� �ȵ� [���� ����]
		
		System.out.println("�� : " + map.get("ȫ��"));
		System.out.println("map ��ü �� ��Ʈ�� �� : " + map.size());
		
		System.out.println("��� Ű ȣ�� : " + map.keySet());
		System.out.println("��� �� ȣ�� : " + map.values());
		
		// �ݺ��� [key �ݺ��� �̿� -> ��� value ȣ��]
		for(String temp : map.keySet()) {
			System.out.println(temp + " : " + map.get(temp) );
		}
	
		map.remove("ȫ�浿"); // ����
		System.out.println("Ȯ�� : " + map);
		
		map.clear(); // ��ü ����
		System.out.println("Ȯ�� : " + map);
	}
}
