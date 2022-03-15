package Day10;
										// *** implements ������ ����  
public class Television implements RemoteControl, Searchable{
	
	private int volume;
	
	public void turnOn() {
		System.out.println("TV ���� �ѱ�");
	}
	public void turnOff() {
		System.out.println("TV ���� ����");
	}
	
	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : " + this.volume);
	}
	
	@Override
	public void search(String url) {
		// TODO Auto-generated method stub
		System.out.println(url + "�˻��մϴ�");
	}

}
