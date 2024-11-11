package _06twoDimensionalArray;

public class _02_Test {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		// 3번째 행이란 말은 행의 index가 2라는 얘기
		// 반복문 안에 조건문을 넣어 문제를 해결
		// 행에대한 인덱스를 2로 고정한 후 
		// 반복문을 수행해 열의 값이 2로 나눴을 때 나머지가 0이면 출력
		for(int i =0; i < a[2].length; i++) {
			if(a[2][i] % 2 == 0) {
				System.out.print(a[2][i] + " ");
			}
		}
	}

}
