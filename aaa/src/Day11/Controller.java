package Day11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

import javax.xml.transform.Templates;



public class Controller {
	
	// �Խù� ����Ʈ
	public static ArrayList<Board> boadlist =
			new ArrayList<>();
	
	// ��� �޼ҵ�� static

	// 1. ���
	public static void boardlist() {

	}
	// 2. ����
	public static void write(String title, String content, String pw, String writer) {
		// ��üȭ -> ������ 4�� / 1�� ��ü [��������]
		Board board = new Board(title, content, pw, writer);
		// ����Ʈ�� ����
		boadlist.add(board);
		// ���Ͽ� ����
		save();
	}
	
	// 4. ����
	public static boolean update(int index, String pw, String title, String content) {
		if(pw.equals(boadlist.get(index).getPw())) {
			boadlist.get(index).setTitle(title);
			boadlist.get(index).setContent(content);
			save();
			return true;
		}else {
			return false;
		}
	}
	// 5. ����
	public static boolean delete(int index, String pw) {
		if(pw.equals(boadlist.get(index).getPw())) {
			// �Է¹��� �н������ �ش� �Խù� �ε��� ��ȣ�� ������
			boadlist.remove(index); // add() : �߰� / get() : ȣ�� / remove() : ����
			save();
			return true;
		}else return false;
		
	}
	// 6. ��۾���
	public static void replywrite() {

	}
	// 7. �Խù� ����
	public static void save() { // ����Ʈ ���� ��� �Խù��� ���Ͽ� ����
		try {
			// ���� ��� Ŭ����
			FileOutputStream outputStream = new FileOutputStream("D:/java/�Խù�����.txt");
			// ���Ͽ� �ۼ��� ���� [���پ�] / �Խù� 1�� = ��ü 1��
			for(Board board : boadlist) {
				String �ۼ����� = board.getTitle() + "," + board.getContent() + "," + 
								board.getPw() + "," + board.getWriter() + "," +
								board.getViewcount() + "," + board.getDate() + "\n";
				
				// ���� [���ڿ�] -> ����Ʈ�� ��ȯ
				// ��������
				outputStream.write(�ۼ�����.getBytes());
			}		
		}
		catch(Exception e) {
			System.err.println("�˸�>> ���� ���� ����");
		}
	}
	// 8. �Խù� �ҷ����� / ���α׷� ���� : ���� -> ����Ʈ
	public static void load() {
		try {
			FileInputStream inputStream = new FileInputStream("D:/java/�Խù�����.txt"); // 1. �����Է�Ŭ���� 
			byte[] bytes = new byte[1000]; // 2. ����Ʈ�迭 ����
			inputStream.read( bytes ); // 3. ��� ����Ʈ �о�ͼ� ����Ʈ�� ���� 
			String file = new String( bytes ); // 4. ����Ʈ -> ���ڿ� ��ȯ 
			String[] boards = file.split("\n"); // 5. ���ڿ� �ڸ��� [ ���پ� [ \n ] -> 1����ü ] 
			
			int i=0;
			for( String temp : boards ) { // �迭�� ���ڿ� �ϳ��� ������ 			
				if( i+1 == boards.length) break;
				String[] field = temp.split(","); // 6. ���ڿ� �ڸ��� [ ���� [,] -> ���ʵ� ] 
				Board board = new Board( field[0], field[1],
						field[2], field[3], Integer.parseInt(field[4]),field[5], null);  // 7. ��üȭ 
										// ��ȸ���� �ʵ�� �������̹Ƿ� ���������� ����ȯ [ Integer.parseInt( ���ڿ� ) ]
				boadlist.add(board);// 8. ����Ʈ ��� 
				i++;
			}
		} catch (Exception e) {
			System.err.println("�˸�>> ���� �ε� ����"); // \n ���� ������ ������ �������� / �������� ����
		}
	}
	// 9. �������
	

	// 10. ��� �ҷ�����
	

}
