package _07twoDimensionalArray;

public class _02_Test {

	public static void main(String[] args) {
		// 시작위치는 마지막 행의 마지막 열
		// 행과 열의 위치는 점차 감소
		// 각각의 열의 값이 증가한 후 행이 증가함
		// 안쪽 반복문에는 열에 대한 값
		// 바깥쪽 반복문에는 행에 대한 

		int[][] a = new int[4][5];
		int num = 1;
				
		for(int i=a.length-1; i>=0; i--) {
			for(int j=a[0].length -1 ; j>=0; j--) {
				 a[i][j] = num;
				 num++;
			}
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
