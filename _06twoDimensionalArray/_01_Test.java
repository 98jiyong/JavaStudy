package _06twoDimensionalArray;

public class _01_Test {

	public static void main(String[] args) {
		
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		
		// a의 2번째 행은 index가 1인 6,7,8,9,10 이기 때문에
		// 2차원 배열 첫번째 배열 값을 index 1로 설정해 행을 고정하고
		// 열에대한 값을 반복문을 사용해서 출력
		for(int i = 0 ; i < a[1].length; i++) {
			System.out.print(a[1][i] + " ");
		}
	}

}
