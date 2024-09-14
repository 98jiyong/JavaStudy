package _06twoDimensionalArray;

import java.util.Random;
import java.util.Scanner;

public class _09_Test {
	
	/*
	 * 키보드로 좌표를 입력하면, 좌표 기준으로 왼쪽 또는 오른쪽으로 3개 이상의 연속된 숫자가 있으면 제거 가능
	 * 제거 가능이면 제거를 하고, -> 제거를 하면 제거한 값은 특정 문자로 변경
	 * 위에 있는 숫자가 아래로 내려온다. -> 특정 문자가 있는 값을 기준으로 위에있는 값과 교체
	 * 맨 위에 배열은 랜덤수로 채워진다. -> 특정 문자가 맨 위로 올라갔을 때 랜덤수로 변경 
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int[][] game = {
				{1,1,0,2},
				{3,2,1,2},
				{0,0,0,2},
				{4,4,4,4},
				{2,4,3,1},
				{2,4,1,3}
		};
		int left_cnt = 0;
		int right_cnt = 0;
		int total_cnt = 0;
		int left_x = 0;
		int right_x = 0;
		int del_line = 0;

		// 게임판의 행과 열의 길이 확인 
		System.out.println("열의 길이 : " + game.length);
		System.out.println("행의 길이 : " + game[0].length);
		
		// 좌표로 받는 값은 인덱스에서 -1 씩 해줘야 함 
		System.out.println("제거할 x 좌표");
		int del_x = in.nextInt();
		System.out.println("제거할 y 좌표");
		int del_y = in.nextInt();
		
		// 제거할 좌표에 대한 출력
		System.out.println("("+del_x+","+del_y+")");

		//제거할 좌표에서부터 왼쪽, 오른쪽으로 비교 (3개 이상이면 삭제)
		// 오른쪽 비교
		// cnt 값이 1 이라면 => 같은 값이 없다는 말이기 때문에 좌표 기억할 필요 X
		// 조건에 cnt 값이 1 보다 크다면 같은 값 중 가장 오른쪽 값을 저장(x좌표)
		System.out.println("오른쪽 비교");
		for(int i = del_x-1; i < game[del_y-1].length; i++) {
			if(game[del_y-1][del_x-1] == game[del_y-1][i]) {
				right_cnt++;
				// 값이 같으면 진행해야하기 때문에 조건문 안에 삽입
				if(right_cnt > 1) {
					right_x = i;
				}else {
					right_x = del_x-1;
				}
			}
//			System.out.println(game[del_y-1][i]);
		}
		System.out.println("왼쪽 비교");
		
		// 왼쪽 비교
		// cnt 값이 1 이라면 => 같은 값이 없다는 말이기 때문에 좌표 기억할 필요 X
		// 조건에 cnt 값이 1보다 크다면 같은 값 중 가장 왼쪽 값을 저장(x좌표)
		for(int i = del_x-1; i >= 0; i--) {
			if(game[del_y-1][del_x-1] == game[del_y-1][i]) {
				left_cnt++;
				// 값이 같으면 진행해야하기 때문에 조건문 안에 삽입
				if(left_cnt > 1) {
					left_x = i;
				}else {
					left_x = del_x-1;
				}
			}
//			System.out.println(game[del_y-1][i]);
		}
		
		// 같은 위치를 비교한 cnt 제거
		total_cnt = left_cnt + right_cnt - 1;
		System.out.println(total_cnt);
		
		// cnt가 3 이상이라면 
		// 가장 왼쪽에 x 좌표부터 가장 오른쪽에 x 좌표까지 값을 변경		
		if(total_cnt >=3) {
			for(int i=left_x; i < right_x+1; i++) {
				game[del_y-1][i] = 999;
			}
		}
		for(int i = 0; i<game.length; i++) {
			for(int j=0; j<game[0].length; j++) {
				System.out.print(game[i][j] + " ");
			}
			System.out.println();
		}
		// 999로 변경된 값들이 가장 위로 올라갈 수 있게 위치 변경
		// 다 올라갔으면 (행의 인덱스가 0이면) 그 값들을 랜덤으로 변경 
		
		// 999가 있는 행의 인덱스를 파악
		for(int i=0; i<game.length; i++) {
			for(int j=0; j<game[0].length; j++) {
				if(game[i][j] == 999) {
					del_line = i;
				}
			}
		}
		System.out.println("지워야하는 줄 : " + (del_line + 1));
		// 20240914_지워야하는 줄의 위치까지 확인 완료
		// 20240914_추가로 위치에서부터 위로 올리고 랜덤수로 대체까지 작업 진행 
		// 999가 있는 행의 인덱스가 0이라면 바로 랜덤 값으로 대체
		
		// 그 행부터 999가 있는 열의 위치와 그 위에 행의 열의 위치 값을 변경
		// 999 에 위에 값 넣고 위에값에 999 넣기 
	}

}
