package _06twoDimensionalArray;

import java.util.Arrays;

public class _05_Test {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[i][j] % 2 != 0) {
					a[i][j] = 0;
				}
			}
		}
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(a));
	}

}
