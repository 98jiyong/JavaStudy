package _07twoDimensionalArray;

public class _05_Test_Refactory {

	public static void main(String[] args) {
		int[][] a = new int[4][5];
		int num = 1;
		int rowMin = 0;
		int rowMax = a.length-1;
		int colMin = 0;
		int colMax = a[0].length-1;
		while(rowMin <= rowMax) {			
			for(int i=colMin; i<=colMax; i++) {
				a[rowMin][i] = num++;
			}
			rowMin++;
			for(int i=rowMin; i<=rowMax; i++) {
				a[i][colMax]=num++;
			}
			colMax--;
			for(int i=colMax; i>=colMin; i--) {
				if(rowMin <= a.length/2) {					
					a[rowMax][i]=num++;
				}
			}
			rowMax--;
			for(int i=rowMax; i>=rowMin; i--) {
				if(colMin < a[0].length/2) {					
					a[i][colMin]=num++;
				}
			}
			colMin++;
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
