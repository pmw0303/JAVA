package zzzz;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Car> carlist = new ArrayList<Car>();
		Enter in = new Enter();
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  hh-mm");
		String strnow = sdf.format(date);
		
		
		while(true) {		
			try {
				System.out.println("============================= ���� ���� �ý��� ===============================");
				System.out.println("\t\t\t   " + strnow);
				System.out.println("\t��¥\t������ȣ\t\t�����ð�\t\t�����ð�\t\t�ݾ�\n");					
				System.out.println("=========================================================================");
				System.out.println();
				
				for(Car temp : carlist) {
					if(temp != null	){
						System.out.printf("\t%s\t\t%s\t\t%s\t\t%s\t\t%d\n",temp.getDay() ,temp.getCarNum()
								, temp.getCarIn(), temp.getCarOut(),
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
