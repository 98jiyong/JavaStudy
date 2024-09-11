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
		int[][] game = {
				{1,1,0,2},
				{3,2,1,2},
				{0,0,3,2},
				{4,4,4,4},
				{2,4,3,1},
				{2,4,1,3}
		};
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		// 좌표로 받는 값은 인덱스에서 -1 씩 해줘야 함 
		System.out.println("제거할 x 좌표");
		int del_x = in.nextInt();
		System.out.println("제거할 y 좌표");
		int del_y = in.nextInt();
		
		System.out.println("("+del_x+","+del_y+")");

		// 왼쪽 비교
		for(int i = del_x-1; i < game[del_y-1].length; i++) {
		
		// 오른쪽으로 비교
//		for(int i = del_x-1; i < a)
		System.out.println(game[del_y-1][del_x-1]);
		}
	}

}
