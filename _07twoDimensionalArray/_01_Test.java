package _07twoDimensionalArray;

public class _01_Test {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		
//		for(int i = 0; i<a[0].length; i++) {
//			for(int j = 0; j<a.length; j++) {
//				a[((a.length - 1) - j)][((a[0].length - 1) - i)] = num;
//				num++;
//			}
//		}
		
		for(int i=a[0].length-1; i>=0; i--) {
			for(int j=0; j<a.length; j++) {
				 a[j][i] = num;
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
