package zzzz;

import java.util.ArrayList;
import java.util.Scanner;

public class Exit {
	public Exit() {
	}
	
	void out(Scanner scanner) {
		ArrayList<Car> carlist = new ArrayList<Car>();
		String num;
		
		System.out.println("=========================������ȣ �Է�=========================");	
		num = scanner.next();
		try {
			for(Car temp : carlist) {
				if(num == temp.getCarNum()) {
					System.out.println("������ȣ\t�����ð�\t\t�����ð�\t\t���ݾ�");
					System.out.printf("%d\t%d\t%s\t\t%s\t\t%d\n",
							temp.getCarNum(), temp.getCarIn()
							, temp.getCarOut(), temp.getMoney());
					System.out.println("���� �Ͻðڽ��ϱ�");
					System.out.println("1.�� 2.�ƴϿ�");
					int ch=scanner.nextInt();
					if(ch==1) {
						
						
					}else if(ch==2) {
						break;
					}
				}else System.out.println("�߸��� �Է°��Դϴ�");
				
			}
		} catch (Exception e) {
			
		}
	}

}
