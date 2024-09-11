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
		
		// 이중 반복문을 사용하여 배열의 모든 값이 출력
		// 안에있는 반복문이 한번 돌면 바깥에 있는 반복문이 다음수로 넘어감
		// 행에 대한 값들이 출력되면 다음 행으로 넘어감
		// 조건문을 사용해 값이 2로 나눴을 때 나머지가 0이 아니면 값을 0으로 변경
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] % 2 != 0) {
					a[i][j] = 0;
				}
			}
		}
		
		// 2차원 배열 출력
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println(Arrays.deepToString(a));
	}

}
