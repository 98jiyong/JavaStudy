package _06twoDimensionalArray;

public class _03_Test {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		// 2열의 인덱스는 1
		// 2차원 배열에 열에대한 배열 값을 1로 고정
		// 반복문을 사용해 행과 고정된 열에대한 값을 출력 
		for(int i = 0; i < a.length; i++) {
			System.out.println(a[i][1]);
		}
	}

}
