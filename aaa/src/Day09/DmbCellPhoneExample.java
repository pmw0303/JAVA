package Day09;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellphone = new DmbCellPhone("햅틱", "검정", 7);
		// 객체 생성
		System.out.println("모델 : " + dmbCellphone.model);
		System.out.println("색상 : " + dmbCellphone.color);
		
		System.out.println("채널 : " + dmbCellphone.channel);
		
		dmbCellphone.powerOn();
		dmbCellphone.bell();
		dmbCellphone.sendVoice("여보세요");
		dmbCellphone.receiveVoice("안녕하세요");
		dmbCellphone.sendVoice("반갑습니다");
		dmbCellphone.hangup();
		
		dmbCellphone.turnOnDmb();
		dmbCellphone.ChangeChannelDmb(17);
		dmbCellphone.TurnOffDmb();
		// 객체를 통한 선언
	}
}
