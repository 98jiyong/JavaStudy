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
		 * 줄이 바뀔 때마다 한계씩 줄어들기 때문에 초기값 조건값을 변수로 집어넣어야할 것 같음
		 */
		
		int[][] a = new int[4][5];
		int num = 1;
		int tr = 0;
		int aRow = a.length;
		int aCol = a[0].length;
		int sRowNum = 0;
		int eRowNum = aRow;
		int sColNum = 0;
		int eColNum = aCol;
//		for(;;) {
//			break;
//		}
		// 가로 줄을 순서대로 구하는 공식
		for(;num < 20;) {
			
			for(int i=sRowNum; i<eRowNum;) {
				for(int j=sColNum; j<eColNum; j++) {
					a[i][j] = num;
					num++;
				}
				tr++;
				break;
			}
			
			// 세로 줄을 순서대로 구하는 공식
			for(int i=eColNum-1; i>=sColNum;) {
				for(int j=sRowNum+1; j<eRowNum; j++) {
					a[j][i] = num;
					num++;
				}
				tr++;
				break;
			}
			
			// 가로 줄을 거꾸로 구하는 방식
			for(int i=eRowNum-1; i>=sRowNum;) {
				for(int j=eColNum-2; j>=sColNum; j--) {
					a[i][j]=num;
					num++;
				}
				tr++;
				break;
			}
			
			// 세로 줄을 거꾸로 구하는 방식
			for(int i=sColNum; i<eColNum;) {
				for(int j=eRowNum-2; j>=sRowNum+1; j--) {
					a[j][i]=num;
					num++;
				}
				tr++;
				break;
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
