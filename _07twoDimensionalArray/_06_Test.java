package _07twoDimensionalArray;

public class _06_Test {

	public static void main(String[] args) {
		int[][] a = {
						{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15},
						{16,17,18,19,20},
						{21,22,23,24,25}
					};
		int[][] b = new int[5][5];
		
		// 로직
		for(int i=0; i<a[0].length-1; i++) {
			b[0][i+1] = a[0][i];
		}
		
		for(int i=0; i<a.length-1; i++) {
			b[i+1][b[0].length-1] = a[i][a[0].length-1];
		}
		for(int i=a[0].length-1; i>0; i--) {
			b[b.length-1][i-1] = a[a.length-1][i];
		}
		for(int i=a.length-1; i>0; i--) {
			b[i-1][0] = a[i][0];
		}
		
		// 결과
		for(int i=0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
	}

}
