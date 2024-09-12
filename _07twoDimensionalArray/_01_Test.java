package _07twoDimensionalArray;

public class _01_Test {

	public static void main(String[] args) {
		// 시작 위치는 첫번째 행의 마지막 열
		// 행의 위치는 증가하지만 열의 위치는 감소
		// 각각의 행의 값이 증가한 후 열의 값이 증가
		// 안쪽 반복문에 들어갈 값은 행의 값
		// 바깥쪽 반복문에 들어갈 값은 열의 값 
		
		int[][] a = new int[4][5];
		int num = 1;
				
		for(int i=a[0].length-1; i>=0; i--) {
			for(int j=0; j<a.length; j++) {
				 a[j][i] = num;
				 num++;
			}
		}
		
		// 결과 출력
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.printf("%4d",a[i][j]);
			}
			System.out.println("\n");
		}

	}

}
