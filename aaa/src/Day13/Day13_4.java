package Day13;

import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Day13_4 {

	public static void main(String[] args) throws Exception{
		
		// p544 DecimalFormat Ŭ���� : ���� �����͸� ���ϴ� �������� ǥ��
			// ���� ����
				// 0 : �ڸ��� [���ڸ��� 0ä��]
				// # : �ڸ��� [���ڸ��� ä��� X]
		
		double num = 1234567.89;
		
		DecimalFormat df = new DecimalFormat("0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("0000000000.00000");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.#####");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("###########.######");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("#.0"); // ������ �Ҽ��� ���ڸ� ǥ��
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#.0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("-#.0");
		System.out.println(df.format(num));
		
		// õ ���� ��ǥ ���� **********
		df = new DecimalFormat("#,##0��");
		System.out.println(df.format(0));
		
		df = new DecimalFormat("#,###��");
		System.out.println(df.format(0));
		
		df = new DecimalFormat("0,000��");
		System.out.println(df.format(0));
		
		df = new DecimalFormat("0.0E0");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#.###");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("+#,### ; -#.###");
		System.out.println(df.format(123));
		
		df = new DecimalFormat("+#,###;-#.###");
		System.out.println(df.format(-123));
		
		// ��ǻ�ʹ� ����� X [ 1 = 100% , 0.4 = 50% ]
		df = new DecimalFormat("#.#%");
		System.out.println(df.format(num));
		
		df = new DecimalFormat("\u00A4 #,###");
		System.out.println(df.format(num));
		
		// p544 : DecimalFormat Ŭ���� : ���� ���� ��ȯ
		// p545 : SimpleDateFormat Ŭ���� : ��¥ ���� ��ȯ
		// p547 : MessageFormat Ŭ���� : ���� ���� ��ȯ
		
		String id = "java";
		String name = "���";
		String tel = "010-1234-5678";
		
		String text = "ȸ�� ID : {0} \nȸ�� �̸� : {1} \nȸ�� ��ȭ : {2}";
		String result1 = MessageFormat.format(text, id, name, tel);
		System.out.println(result1);
		System.out.println();
		
		// DB ���� ����� ����
		String sql = "insert info member values( {0} {1} {2} )";
		Object[] arr = { id, name, tel };
		String result2 = MessageFormat.format(sql, arr);
		System.out.println(result2);
		
		// JAVA 7 ���� ���� Date
		LocalDate currDate = LocalDate.now();
		System.out.println("���� : " + currDate);
		
		LocalTime currTime = LocalTime.now();
		System.out.println("���� : " + currTime);
		
//		Date ���糯¥/�ð� [������ �ȵǰų� �񱳱�� �����]
//		vs
//		LocalDate : ���糯¥    LocalTime : ����ð�
		
		LocalDateTime crr = LocalDateTime.now();
		System.out.println("���� ��¥/�ð� : " + crr);
		
		// �ð��� [�ð����]
		Instant ins1 = Instant.now();
		Thread.sleep(1000);  // ms �̹Ƿ� 1000 = 1��
		Instant ins2 = Instant.now();
		
		if(ins1.isBefore(ins2)) {
			System.out.println("ins1�� �� ����");
		}else if(ins1.isAfter(ins2)) {
			System.out.println("ins2 �� �� ����");
		}else {
			System.out.println("���Ͻð�");
		}
		
		System.out.println("�ð� �� : " + ins1.until(ins2, ChronoUnit.NANOS));
		
		
	}
}
