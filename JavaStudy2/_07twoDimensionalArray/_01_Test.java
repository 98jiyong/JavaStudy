package _07twoDimensionalArray;

public class _01_Test {

	public static void main(String[] args) {
		// 시작 위치는 첫번째 행의 마지막 열
		// 행의 위치는 증가하지만 열의 위치는 감소
		// 각각의 행의 값이 증가한 후 열의 값이 증가
		// 안쪽 반복문에 들어갈 값은 행의 값
		// 바깥쪽 반복문에 들어갈 값은 열의 값 
		
		/*
		 * 선언문(변수와 자료형) 변수명:a, 자료형은 2차원배열
		 * 변수 : 값을 저장하는 기억공간
		 * 2차원배열은 행과 열로 이루어진 공간
		 * int[4][5] = 행이 4개 열이 5개로 이루어진 2차원배열
		 * 행의 인덱스 번호는 0-3, 열의 인덱스 번호는 0-4
		 */
		int[][] a = new int[4][5];
		int num = 1;
				
		for(int i=a[0].length-1; i>=0; i--) {
			for(int j=0; j<a.length; j++) {
				 a[j][i] = num++;
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
