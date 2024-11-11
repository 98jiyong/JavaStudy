package _06twoDimensionalArray;

public class _04_Test {

	public static void main(String[] args) {
		int[][] a = {
				{1,2,3,4,5},
				{6,7,8,9,10},
				{11,12,13,14,15},
				{16,17,18,19,20},
				{21,22,23,24,25}};
		
		// 개수를 셀 변수 생성
		int cnt = 0;
		
		// 이중 반복문을 사용하여 배열의 모든 값이 출력
		// 안에있는 반복문이 한번 돌면 바깥에 있는 반복문이 다음수로 넘어감
		// 행에 대한 값들이 출력되면 다음 행으로 넘어감
		// 값이 2로 나눴을 때 나머지가 0이면 개수를 증가
		// 반복문이 끝나면 cnt 값을 출력
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				if(a[i][j] % 2 == 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

}
