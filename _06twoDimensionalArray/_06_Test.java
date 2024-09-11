package _06twoDimensionalArray;


public class _06_Test {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		
		// 내림차순으로 작성
		// 행에대한 배열도 초기값을 마지막부터
		// 열에대한 배열도 초기값을 마지막부터 설정
		// 반복문의 조건을 바꾸고 증감식 또한 감소하는 형태로 설정
		for(int i = a.length-1; i >= 0; i--) {
			for(int j = a[i].length-1; j >= 0; j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
