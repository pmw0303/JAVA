package ���Ǳ�;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Controller extends Thread{
	
	// ��� �����忡�� ����ϱ� ���� ������ static���� ����
	static int �ڱ� = 10000 ;
	static int �ݶ� = 0 ;
	static int ���̴� = 0 ;
	static int ȯŸ = 0 ;
	static int ����� = 0 ;
	static long ���۽ð� ; // ���ӽ��۽� ���۽ð��� ����
	static int �ð����� = 1 ; // �ð�����üũ �޼ҵ带 �̿��Ͽ� ���� ����ð��� ��ġ�� ��Ÿ�� (5�ʴ� 1������)
	static int ���Ƚ�� = 0 ; // �������������� ����� ����
	static ArrayList<String> �޽��� = new ArrayList<>(); // �ݺ�������� ���� �޽��� ������� �����ϱ����� ����Ʈȭ �Ͽ� ����Ʈ�ڸ��� �����س��� ���
	static ArrayList<Rank> ��ŷ = new ArrayList<>(); // ��ŷ���� ����Ʈ
	
	public static void �޽�����ŷ���¸޼ҵ�() {
		for(int i = 1 ; i <= 5 ; i++) { // ���۾��� �������� ������� ���ӽ��۽� 0,1,2,3,4 �ε����� null���¶� .get ���ٿ����� ���Ұ�
			�޽���.add(0," "); 
		}
		for(int i = 1 ; i <= 10 ; i++) { // ���۾��� �������� ������� ���ӽ��۽� 0,1,2,3,4 �ε����� null���¶� .get ���ٿ����� ���Ұ�
			Rank rank = new Rank(" ", 0, " ");
			��ŷ.add(rank);
		}
	}
	
	public static void ���Ӹ��¸޼ҵ�() { // ���� ���� �� ������� ���Ӽ��� �ʱ�ȭ
		�ڱ� = 10000 ;
		�ݶ� = 0 ;
		���̴� = 0 ;
		ȯŸ = 0 ;
		����� = 0 ;
		�ð����� = 1 ;
		���Ƚ�� = 0 ;
	}
	 
	 public static int ��ũ����(long ���ӽð�) { // ��ũ�����޼ҵ�
		 for(int i = 0 ; i < 10 ; i++) {
			 if(��ŷ.get(i).getPlaytime() < ���ӽð�) { // ��ũ ����Ʈ 0~9�ε��� ���� ���ӽð� ��, 5���ȿ� ����� �� �ε��� ��ȯ
				 return i ;
			 }
		 }
		 return 100; // 0~4�ε��� ���� �������� ���ӽð��� ������ 100 ��ȯ(10�� �ȿ� ������� ��)(�� 100�� �ƴϾ �� �׳� ū���ڳ־���) 
	 }
	 
	 public static void ��ũ���(int result, long ���ӽð�, String �̸�, String �ڸ�Ʈ) { // 10���ȿ� ������� �Ű����� �̸��� �ڸ�Ʈ�� �޾� ��ũ ����Ʈ�� ����
		 Rank rank = new Rank(�̸�, ���ӽð�, �ڸ�Ʈ);
		 ��ŷ.add(result,rank); // ��ũ�����޼ҵ�κ��� �� �ε��� ���� ����
	 }
		 	 	 	 
	 public static void save() { // ��ŷ ����ó�� �޼ҵ�
		 try {
				FileOutputStream fileOutputStream = new FileOutputStream("D:/java/���Ǳ�.txt");
				for(int i = 0 ; i < 10 ; i++) {
					String �������� = ��ŷ.get(i).getName()+","+��ŷ.get(i).getPlaytime()+","+��ŷ.get(i).getContent()+"\n";
					fileOutputStream.write(��������.getBytes()); // ���ڿ� -> ����Ʈ��
				}
			}
			catch(Exception e) { // ����[����] ó��[���] : Exception Ŭ����
			}
	 }
	 
	public static void load() { // ��ŷ���� �ҷ����� �޼ҵ�
		try {
			FileInputStream fileInputStream = new FileInputStream("D:/java/���Ǳ�.txt");
			byte[] bytes = new byte[1024]; // bit -> byte -> kb -> mb -> gb
			fileInputStream.read(bytes);
			String ���ϳ��� = new String(bytes); // ����Ʈ�� -> ���ڿ�
			String[] file = ���ϳ���.split("\n");		
			int i = 0 ;
			for(String temp : file) {
				if(i+1 == file.length){
					break;
				}
				String[] �ʵ��� = temp.split(",");
				Rank rank = new Rank(�ʵ���[0], Long.parseLong(�ʵ���[1]), �ʵ���[2]);
				��ŷ.remove(i);
				��ŷ.add(i,rank);
				i++;
			}				
		}
		catch(Exception e){ // catch : ���� ��� -> Exception Ŭ������ ��ü�� ����
		}
	}
 
}
	
