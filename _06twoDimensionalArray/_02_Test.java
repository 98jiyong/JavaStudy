package _06twoDimensionalArray;

public class _02_Test {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		for(int i =0; i < a.length; i++) {
			if(a[3][i] % 2 == 0) {
				System.out.print(a[2][i] + " ");
			}
		}
	}

}
