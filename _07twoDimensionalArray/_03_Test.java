package _07twoDimensionalArray;

public class _03_Test {

	public static void main(String[] args) {
		// 시작위치는 첫번째 행의 첫번째 열
		// 패턴은 지렁이처럼 꼬불꼬불
		// 행은 처음부터 끝으로 가지만
		// 열은 행에 따라 처음과 끝이 바뀜
		// 행을 기준으로 조건을 줘서 열을 변경
		// 행의 인덱스가 짝수이면 열은 순서대로
		// 행의 인덱스가 홀수이면 열은 거꾸로
		
		int[][] a = new int[4][5];
		int num = 1;
		
		for(int i=0; i<a.length; i++) {
			for(int j=0 ; j<a[0].length; j++) {
				if(i % 2 == 0) {
					a[i][j] = num;
					num++;
				}else {
					a[i][a[0].length-1-j]=num;
					num++;
				}
			}				
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
