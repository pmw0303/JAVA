package Day09;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellphone = new DmbCellPhone("��ƽ", "����", 7);
		// ��ü ����
		System.out.println("�� : " + dmbCellphone.model);
		System.out.println("���� : " + dmbCellphone.color);
		
		System.out.println("ä�� : " + dmbCellphone.channel);
		
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("��������");
		dmbCellphone.receiveVoice("�ȳ��ϼ���");
		dmbCellphone.sendVoice("�ݰ����ϴ�");
		dmbCellphone.hangup();
		
		dmbCellphone.turnOnDmb();
		dmbCellphone.ChangeChannelDmb(17);
		dmbCellphone.TurnOffDmb();
		// ��ü�� ���� ����
	}
}
