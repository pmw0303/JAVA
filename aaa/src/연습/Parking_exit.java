package ����;

import java.io.FileInputStream;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Parking_exit {
	
	public Parking_exit() {}
	
	void out(Parking_state state, Scanner scanner) {
		
		LocalDateTime localdate = LocalDateTime.now();
		ArrayList<Parking_date> date_array = new ArrayList<>();
		
		try {
			FileInputStream inputStream = new FileInputStream("D:/java/�������Ա��.txt");
			byte[] bytes = new byte[1024];
			inputStream.read(bytes);
			String ���ϳ��� = new String(bytes);
			String[] ����������� = ���ϳ���.split("\n");
			int i=0;
			for(String temp : �����������) {
				if(i+1 == �����������.length) {
					String[] �ʵ��� = temp.split(",");
					Parking_date parking_date = new Parking_date(Integer.parseInt(�ʵ���[0]),
							Integer.parseInt(�ʵ���[1]),
							Integer.parseInt(�ʵ���[2]),
							Integer.parseInt(�ʵ���[3]),
							Integer.parseInt(�ʵ���[4]),
							Integer.parseInt(�ʵ���[5]),
							Integer.parseInt(�ʵ���[6]));
					
					date_array.add(parking_date);
					i++;
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		Calendar calendar = Calendar.getInstance();
		
		long yearNow = calendar.get(Calendar.YEAR);
	    long monthNow = calendar.get(Calendar.MONTH) + 1;
	    long dayNow = calendar.get(Calendar.DAY_OF_MONTH);
	    long timeNow= calendar.get(Calendar.HOUR_OF_DAY);
	    long minNow= calendar.get(Calendar.MINUTE);
	    
	    int num=0;
	    int real_num = num - 1;
	    System.out.println("���� ��ȣ�� �Է��ϼ���");
	    num=scanner.nextInt();
	    
	    for(Parking_date board : date_array) {
	    	if(num==board.get������ȣ()) {
	    		System.out.println("������ȣ\t������\t������\t������\t������\t������\t������ġ");
	    		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\t%d\n", 
	    				board.get������ȣ(), board.get������(), board.get������(),
	    				board.get������(), board.get������(), board.get������(),
	    				board.get������(), board.get������ġ()+1);
	    		System.out.println("���� �Ͻðڽ��ϱ�"); int sc = scanner.nextInt();
	    		System.out.println("1.�� 2.�ƴϿ�");
	    		
	    		if(sc==1) {
	    			
	    		}
	    		
	    	}
	    }
		
	}
	
}
