package Day10;

import java.util.ArrayList;
import java.util.Scanner;

public class Day10_5_��������_����Ʈ {
	
	public static void main(String[] args) {
		
		// ����Ʈ[��ü] ����
		ArrayList<Book> booklist = new ArrayList<>();
		// ����ƮŬ����< ����Ʈ�ȿ� ������ Ŭ����>
			// <Ŭ����> : �ش� Ŭ������ ���� ��ü�� ����Ʈ�� ����
			// ����(����) : �⺻ 10
		
		
		while(true) {
			System.out.println("1. ���|2. ���|3. ����|4. ����|");
			Scanner scanner = new Scanner(System.in);
			int ch = scanner.nextInt();
			
			if(ch == 1) {
				// �Է¹ޱ�
				System.out.println("������ : ");
				String ������ = scanner.next();
				System.out.println("�۰� : ");
				String �۰� = scanner.next();
				// ��üȭ [������ ���� -> 1�� ��ü]
				Book book = new Book(������, �۰�);
				// �迭����
				booklist.add(book);			
				
			}else if(ch == 2) {
				// �迭 [null ����] vs ����Ʈ 
				System.out.println("����\t�۰�");
				for(Book book : booklist) {	
					System.out.println(book.get������() + "\t" + book.get�۰�());					
				}
			}else if(ch == 3) {
				// ����Ʈ�� �迭�� �ٸ��� �ڵ����� ������
				System.out.println("������ ������ : ");
				String ������ = scanner.next();
				
				for(Book book : booklist) {
					if(book.get������().equals(������)) {
						booklist.remove(book);
						break;
					}
				}
				
			}else if(ch == 4) {
				System.out.println("������ ������ : ");
				String ������ = scanner.next();
				
				for(Book book : booklist) {
					if(book.get������().equals(������)) {
						System.out.println("������ �۰� �̸� : ");
						String �۰� = scanner.next();
						book.set�۰�(�۰�);
					}
				}
				
			}
			
		}
	}

}
