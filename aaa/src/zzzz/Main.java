package zzzz;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Car> carlist = new ArrayList<Car>();
		Enter in = new Enter();
				
		while(true) {		
			try {
				System.out.println("====================== ���� ���� �ý��� =====================");
				System.out.println("������ȣ\t������ġ\t�����ð�\t\t�����ð�\t\t�ݾ�\n");					
				System.out.println("========================================================");
				System.out.println();
				
				for(Car temp : carlist) {
					if(temp != null	){
						System.out.printf("%s\t\t%s\t\t%s\t\t%s\t\t%d\n", temp.getCarNum()
								, temp.getParkArea(), temp.getCarIn(), temp.getCarOut(),
								temp.getMoney());
					}
				}
				
				System.out.println("1.���� 2.����");
				int ch = scanner.nextInt();
				if(ch==1) {
					in.in(scanner);
				}else if(ch==2) {
					
				}
				
				
			} catch (Exception e) {
				
			}
			
			
		}
	}
}
