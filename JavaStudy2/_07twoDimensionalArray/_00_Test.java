package _07twoDimensionalArray;

import java.util.Scanner;

public class _00_Test {

	public static void main(String[] args) {
		// 테트리스 회전
		// 회전을 하려면 기준점이 있어야 한다.
		// 오른쪽 회전은 기준점을 대상으로 90도씩 회전하는것
		// 그러면 사분면을 기준으로 줬을 때 사분면의 위치가 바뀌는 것 
		// 기준으로부터 얼마나 떨어져있는지
		// 안에있는 블록만 돌린다고 생각하지 말고 전체를 돌린다고 생각		
		int[][] tempArr = {
				{1,1,0},
				{0,1,0},
				{0,1,1}};
		int[][] nowBlock = new int[3][3];
		int tempRow = tempArr.length;
		int tempCol = tempArr[0].length;
		int blockRow = nowBlock.length;
		int blockCol = nowBlock[0].length;
		Scanner in = new Scanner(System.in);
		
		System.out.println("어디로 돌리겠습니까?");
		String str = in.nextLine();
		
		
		if(str.equals("오른쪽")) {
			// 오른쪽 회전
			for(int i =0; i < tempRow; i++) {
				for(int j = tempCol - 1; j >= 0; j--) {
					nowBlock[i][Math.abs(j-(tempCol-1))] = tempArr[j][i];
				}
			}			
		}else {
			// 왼쪽 회전
			for(int i = tempRow - 1; i >= 0 ; i--) {
				for(int j = 0; j < tempCol; j++) {
					nowBlock[Math.abs(i-(tempRow-1))][j] = tempArr[j][i];
				}
			}			
		}
		
		// 결과 출력
		for(int i = 0; i < blockRow; i++) {
			for(int j = 0; j < blockCol; j++) {
				System.out.print(nowBlock[i][j] + " ");
			}
			System.out.println();
		}
		in.close();
		
	}

}
