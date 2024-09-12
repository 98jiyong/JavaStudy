package _07twoDimensionalArray;

public class _05_Test {

	public static void main(String[] args) {
		/*
		 * 가로줄 순서대로, 세로줄 순서대로, 가로줄 거꾸로, 세로줄 거꾸로에 대한 반복문을 개별로 작성
		 * 각각의 반복문이 실행이 된 후 2차원 배열의 안쪽으로 이동해야함
		 * 안쪽으로 이동하면서 위치는 증가하거나 감소하기 때문에 초기값과 끝값 설정을 잘 해줘야함
		 * 
		 */
		
		int[][] a = new int[4][5];
		int num = 1;
		// 초기값과 끝값을 설정하기 위한 변수 생성
		int x = 0;
		int y = 0;
		int z = 0;

		
		// 
		while(a.length - (z + x) > 0) {
			
			// 가로 줄을 순서대로
			// x(안으로 갈수록 입력되는 개수가 줄기 때문)부터 
			// 길이 - y(안으로 갈수록 입력되는 개수가 줄기 때문)까지
			// 행을 고정하고 열 값 입력
			for(int j=x; j<a[0].length - y; j++) {
				a[z][j] = num;
				num++;
			}
			x++;

			// 세로 줄을 순서대로
			// 위에서 세로줄의 한칸을 썼으니 한칸 다음으로 시작
			// x부터 길이 - z 까지 열을 고정하고 행 값 입력
			for(int j=x; j<a.length-z; j++) {
				a[j][a[0].length-1-z] = num;
				num++;
			}

			// 가로 줄을 거꾸로 구하는 방식
			// 똑같이 가로줄에서 한칸을 제외한 다음 진행
			// 시작위치 : 열의 끝에서 x만큼 뺀 위치
			// 값을 감소하면서 거꾸로 행을 고정하고 열 값 입력
			// 행 혹은 열이 홀수이면 원하는대로 값이 나오지 않기 때문에
			// 작업하고있는 행이 마지막으로 실행하는 가운데 행과 같지않을때
			// 작업을 진행하고 같으면 종료
			for(int j=a[0].length-1-x; j>=y; j--) {
				if(a.length-z-1!=(a.length-1)/2) {
					a[a.length-z-1][j]=num;
					num++;
				}
			}
			y++;
			// 세로 줄을 거꾸로 구하는 방식
			// 양쪽에서 한칸씩 사용하고있기 때문에 조건에 같은 x를 사용
			// 값을 증가하면서 순서대로 행을 고정하고 열 값 입력
			// 행 혹은 열이 홀수이면 원하는대로 값이 나오지 않기 때문에
			// 작업하고있는 행이 마지막으로 실행하는 가운데 행과 같지않을때
			// 작업을 진행하고 같으면 종료
			for(int j=a.length-1-x; j>=x; j--) {
				if(z != (a[0].length-1)/2) {
					a[j][z]=num;
					num++;
				}
			}
			z++;			
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
