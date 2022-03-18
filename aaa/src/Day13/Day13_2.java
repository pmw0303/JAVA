package Day13;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class Day13_2 {

	
	public static void main(String[] args) {
		Date date = new Date();
		
		System.out.println(date);
		System.out.println(date.toString());
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		// ��¥ ���� ��� ����
		
		String strnow = sdf.format(date);
		// ��¥�� ���� ���� ->  date ������ String����
		
		System.out.println(strnow);
		
		
		// p540
		Calendar now = Calendar.getInstance();
		// �̹� Calender Ŭ���� ���� ��ü ���� -> (new) ���� ���� ���ʿ�
		System.out.println(" ���� : " + now.get(Calendar.YEAR)); // ��
		System.out.println(" �� : " + (now.get(Calendar.MONTH)+1)); // 0~11 �̹Ƿ� 1�� �����ش�
		System.out.println(" �� : " + now.get(Calendar.DAY_OF_MONTH)); // ��
		
		System.out.println(" ���� : " + now.get(Calendar.DAY_OF_WEEK)); // �� ���� - ��(1) ��(2) ȭ(3) ��(4) ��(5) ��(6) ��(7)
		int week = now.get(Calendar.DAY_OF_WEEK);
		String ���� = null;
		switch (week) {
		case 1:
			���� = "��";
			break;
		case 2:
			���� = "��";
			break;
		case 3:
			���� = "ȭ";
			break;
		case 4:
			���� = "��";
			break;
		case 5:
			���� = "��";
			break;
		case 6:
			���� = "��";
			break;
		case 7:
			���� = "��";
			break;

		}
		System.out.println("����[�ѱ�] : " + ����);
		
		
		// ����/����
		System.out.println("����/����(0/1) : " + now.get(Calendar.AM_PM)); 
		int ampm = now.get(Calendar.AM_PM);
		String �������� = null;
		if(ampm == 0) {
			�������� = "����";
		}else if(ampm ==1) {
			�������� = "����";
		}
		System.out.println("����/���� : " + ��������);
		
		
		System.out.println(" �� : " + now.get(Calendar.HOUR));
		System.out.println(" �� : " + now.get(Calendar.MINUTE));
		System.out.println(" �� : " + now.get(Calendar.SECOND));
		
		// ZonedDateTime Ŭ���� : ���� ������
		ZonedDateTime zoned = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println("������ : " + zoned);
		zoned = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println("����ð� : " + zoned);
		zoned = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println("����ð� : " + zoned);
		
		
	}
}
