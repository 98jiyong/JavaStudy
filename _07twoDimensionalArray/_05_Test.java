package _07twoDimensionalArray;

public class _05_Test {

	public static void main(String[] args) {
		/*
		 * 가로에 대한 값과 세로에 대한 값을 따로 계산해야할 것 같음 
		 * 값이 수행된다면 점점 입력하는 필드가 줄어듬 
		 * 1 2 3 4 5
		 * 6 7 8 
		 * 9 10 11 12
		 * 13 14 
		 * 15 16 17
		 * 18
		 * 19 20
		 * 가로 줄의 개수는 5 4 3 2
		 * 세로 줄의 개수는 3 2 1
		 * 다 돌았을 때 하나씩 감소 (조건 1)
		 * 가로 줄은 왼쪽 오른쪽 왼쪽 오른쪽
		 * 세로 줄은 아래 위 아래 
		 * 가로줄 -> 세로줄 -> 가로줄 -> 세로줄... 번갈아가면서 진행 
		 * 돌 떄마다 위아래로 번갈아가면서 진행 (조건 2) -> 짝수 홀수 기준으로 설정하면 될 것 같음
		 */
		
		int[][] a = new int[4][5];
		int num = 1;
		int tr = 0;
		int aRow = a.length;
		int aCol = a[0].length;
		int s_r = 0;
		int e_r = 0;
		// 세로 줄을 순서대로 구하는 공식
		for(int i=0; i<aCol; i++) {
			for(int j=0; j<aRow; j++) {
				a[j][i] = num;
				num++;
			}
		}
		// 가로 줄을 순서대로 구하는 공식
		for(int i=s_r; i<e_r; i++) {
			for(int j=0; j<aCol; j++) {
				a[i][j] = num;
				num++;
			}
		}
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
