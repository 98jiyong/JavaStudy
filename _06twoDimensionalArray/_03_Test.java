package _06twoDimensionalArray;

public class _03_Test {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[j][i] + " ");
			}
			System.out.println();
		}
	}

}
