package _07twoDimensionalArray;

public class _06_Test {

	public static void main(String[] args) {
		/*
		 * 1  2  3  4  5     6  1  2  3  4
		 * 6  7  8  9  10    11 12 7  8  5
		 * 11 12 13 14 15 -> 16 17 13 9  10
		 * 16 17 18 19 20    21 18 19 14 15
		 * 21 22 23 24 25    22 23 24 25 20
		 * 
		 * 시계가 네모라고 한다면 12시 줄, 3시줄, 6시줄, 9시줄이 있다.
		 * 12시 줄에 앞부터 4개를 한칸 뛰고 입력
		 * 3시 줄에 위부터 4개를 한칸 뛰고 입력
		 * 6시 줄에 뒤부터 4개를 한칸 뛰고 입력
		 * 9시 줄에 아래부터 4개를 한칸 뛰고 입력
		 * 겉에 한줄이 완성되면 안으로 들어가 반복
		 * 
		 */
		int[][] a = {
						{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15},
						{16,17,18,19,20},
						{21,22,23,24,25}
					};
		int[][] b = new int[5][5];
		// 행과 열의 길이에 대한 변수 생성 
		int aRowLen = a[0].length-1;
		int aColLen = a.length-1;
		int bRowLen = b[0].length-1; 
		int bColLen = b.length-1;
		
		// 로직을 여러번 실행하기 위한 반복문
		// 5 X 5 2차원 배열이기 때문에 맨 가운데 숫자를 제외하고 
		// 2번의 테두리만 돌면 되기 떄문에 
		// 0부터 bColLen/2 => 2까지 1씩 증가로 설정
		for(int s=0; s < (bColLen)/2; s++) {			
			// 로직
			// 반복문을 한반퀴 돌 때 마다 시작위치의 행과 열 값을 한칸씩 안으로 이동
			for(int i=s; i<aRowLen-s; i++) {
				b[s][i+1] = a[s][i];
			}
			for(int i=s; i<aColLen-s; i++) {
				b[i+1][bRowLen-s] = a[i][aRowLen-s];
			}
			for(int i=aRowLen-s; i>s; i--) {
				b[bColLen-s][i-1] = a[aColLen-s][i];
			}
			for(int i=aColLen-s; i>s; i--) {
				b[i-1][s] = a[i][s];
			}
			// 가운데 숫자 한개가 남는 줄 앞까지 도달하면 가운데 숫자를 입력
			if(s == ((bColLen)/2)-1) {
				b[(bColLen)/2][(bRowLen)/2] = a[(aColLen)/2][(aRowLen)/2];
			}
		}
		
		// 결과		
		for(int i=0; i<b.length; i++) {
			for(int j=0; j<b[0].length; j++) {
				System.out.printf("%4d",b[i][j]);
			}
			System.out.println("\n");
		}
	}

}
