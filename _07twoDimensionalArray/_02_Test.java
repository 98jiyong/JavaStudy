package _07twoDimensionalArray;

public class _02_Test {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
		for(int i=a.length-1; i>=0; i--) {
			for(int j=a[0].length -1 ; j>=0; j--) {
				 a[i][j] = num;
				 num++;
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
