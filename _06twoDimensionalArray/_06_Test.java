package _06twoDimensionalArray;


public class _06_Test {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		
		for(int i = a.length-1; i >= 0; i--) {
			for(int j = a.length-1; j >= 0; j--) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
