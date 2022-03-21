package 연습;

public class Parking_state {

	final static int MAX = 12;
	
	String[] box = new String[MAX];
	
	public void create(int MAX) {
		for(int i=0 ; i<MAX ; i++) {
			box[i] = "[ ]";
		}
	}
	
	public void print_state() {
		System.out.println("=========================================\n < 주차장 >");
		for(int i=0 ; i<MAX ; i++) {
			if(i%4==3) System.out.println();
		}
	}
}
