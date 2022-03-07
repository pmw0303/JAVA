package Day05;

public class Day05_1 {

	public static void main(String[] args) {

		int[] ar1 = new int[3]; // int 4byte * 3 -> 12byte �迭
		ar1[0] = 80; // 0�� �ε����� 80 ����
		ar1[1] = 90;
		ar1[2] = 100;

		int[][] ar2 = new int[2][3]; // [][] : ���� ���� / 4byte * 2 * 3 -> 24byte �迭
		ar2[0][0] = 80;
		ar2[0][1] = 90;
		ar2[0][2] = 100;
		ar2[1][0] = 40;
		ar2[1][1] = 50;
		ar2[1][2] = 60;

		System.out.println("1���� �迭 : " + ar1);
		System.out.println("2���� �迭 : " + ar2);

		System.out.println("1���� �迭���� : " + ar1.length);
		System.out.println("2���� �迭 �� ���� : " + ar2.length);
		System.out.println("2���� �迭 �� ���� : " + ar2[0].length);

		// ��) �ݺ����� ����Ͽ� 0~49���� ù��° �࿡ ����
//							50~99���� �ι�° �࿡ ����

		int[][] ar3 = new int[2][50]; // int : 4byte *22*50 -> 400byte �迭 ���� -> int 100�� ����

		for (int i = 0; i < 100; i++) {
			
			// [0] : ù���� ��
			// [i] : i��° ��

			if (i < 50)
				ar3[0][i] = i;
			// i�� 50 �̸��� �� ù��° �࿡ ����
			else
				ar3[1][i-50] = i;
			// �ƴϸ� �ι�° ��

		}
		for(int i = 0 ; i < 100 ; i++) {
			
			if(i < 50) System.out.printf("%3d" , ar3[0][i]);4
			
			else System.out.printf("%3d", ar3[1][i-50]);
			
			if( i == 49) System.out.println();
		}

	}

}
