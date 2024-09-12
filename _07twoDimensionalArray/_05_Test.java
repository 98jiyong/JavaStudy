package _07twoDimensionalArray;

public class _05_Test {

	public static void main(String[] args) {
		/*
		 * 가로줄 순서대로, 세로줄 순서대로, 가로줄 거꾸로, 세로줄 거꾸로에 대한 반복문을 개별로 작성
		 * 각각의 반복문이 실행이 된 후 2차원 배열의 안쪽으로 이동해야함
		 * 안쪽으로 이동하면서 위치는 증가하거나 감소하기 때문에 초기값과 끝값 설정을 잘 해줘야함
		 * 
		 */
		
		int[][] a = new int[4][5];
		int num = 1;
		// 초기값과 끝값을 설정하기 위한 변수 생성
		int w = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		
		// 가로줄 순서대로의 행과 가로줄 거꾸로의 행이 만날 때 종료 
		for(;a.length - (z + x) > 0;) {
			
			// 가로 줄을 순서대로 구하는 공식
			for(int j=x; j<a[0].length - w; j++) {
				a[y][j] = num;
				num++;
			}
			x++;

			// 세로 줄을 순서대로 구하는 공식
			for(int j=x; j<a.length-z; j++) {
				a[j][a[0].length-1-y] = num;
				num++;
			}
			z++;

			// 가로 줄을 거꾸로 구하는 방식
			for(int j=a[0].length-x-1; j>=w; j--) {
				a[a.length-y-1][j]=num;
				num++;
			}
			w++;
			
			// 세로 줄을 거꾸로 구하는 방식
			for(int j=a.length-1-x; j>=w; j--) {
				a[j][y]=num;
				num++;
			}
			y++;			
		}
		
		// 결과 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
