package Day09;

public class DmbCellPhone extends CellPhone{

	// 필드
	int channel;
	
	// 생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("DMB 채널 " + channel + "번 수신을 시작합니다");
	}
	void ChangeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다");
	}
	void TurnOffDmb() {
		System.out.println("DMB 수신을 종료합니다");
	}
}
