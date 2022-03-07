package Day05;

public class Day05_1 {

	public static void main(String[] args) {

		int[] ar1 = new int[3]; // int 4byte * 3 -> 12byte 배열
		ar1[0] = 80; // 0번 인덱스에 80 대입
		ar1[1] = 90;
		ar1[2] = 100;

		int[][] ar2 = new int[2][3]; // [][] : 가로 세로 / 4byte * 2 * 3 -> 24byte 배열
		ar2[0][0] = 80;
		ar2[0][1] = 90;
		ar2[0][2] = 100;
		ar2[1][0] = 40;
		ar2[1][1] = 50;
		ar2[1][2] = 60;

		System.out.println("1차원 배열 : " + ar1);
		System.out.println("2차원 배열 : " + ar2);

		System.out.println("1차원 배열길이 : " + ar1.length);
		System.out.println("2차원 배열 행 길이 : " + ar2.length);
		System.out.println("2차원 배열 열 길이 : " + ar2[0].length);

		// 예) 반복문을 사용하여 0~49까지 첫번째 행에 저장
//							50~99까지 두번째 행에 저장

		int[][] ar3 = new int[2][50]; // int : 4byte *22*50 -> 400byte 배열 선언 -> int 100개 저장

		for (int i = 0; i < 100; i++) {
			
			// [0] : 첫번쨰 행
			// [i] : i번째 행

			if (i < 50)
				ar3[0][i] = i;
			// i가 50 미만일 때 첫번째 행에 저장
			else
				ar3[1][i-50] = i;
			// 아니면 두번째 행

		}
		for(int i = 0 ; i < 100 ; i++) {
			
			if(i < 50) System.out.printf("%3d" , ar3[0][i]);4
			
			else System.out.printf("%3d", ar3[1][i-50]);
			
			if( i == 49) System.out.println();
		}

	}

}
