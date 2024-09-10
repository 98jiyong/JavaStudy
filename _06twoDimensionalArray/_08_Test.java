package _06twoDimensionalArray;

public class _08_Test {

	public static void main(String[] args) {
		int[][] game = {
				{1,1,0,2},
				{3,2,1,2},
				{0,0,3,2},
				{4,4,4,4},
				{2,4,3,1},
				{2,4,1,3}
		};
		int cnt = 1;
		int del_num = 0;
		for(int i = 0; i < game.length; i ++) {
			for(int j = 0; j < game[i].length-1; j++) {
				if(game[i][j] == game[i][j+1]) {
					del_num = game[i][j];
					cnt ++;
					System.out.print(game[i][j+1]);
					System.out.print(game[i][j+1]);
					System.out.println(cnt);
				}
				else {
					del_num = 0;
					cnt = 1;
				}
				if(cnt >= 3) {
					System.out.println((j-cnt+3) + "," + (i+1) + " 부터 " + (j+cnt-1) + "," + (i+1)+" 까지 숫자 " + del_num +" 제거");
				}
				if(j+1 == game[i].length-1) {
					if(cnt >= 3) {
						System.out.println((j-cnt+3) + "," + (i+1) + " 부터 " + (j+cnt-1) + "," + (i+1)+" 까지 숫자 " + del_num +" 제거");
					}
				}
			}
		}
		for(int i = 0; i < game[i].length; i++) {
			for(int j = 0; j < game.length-1; j++) {
				if(game[j][i] == game[j+1][i]) {
					del_num = game[j][i];
					cnt ++;
					System.out.print(game[j][i]);
					System.out.print(game[j+1][i]);
					System.out.println(cnt);
				}
				else {
					del_num = 0;
					cnt = 1;
				}
				if(cnt >= 3) {
					System.out.println((i+1) + "," + (j) + " 부터 " + (i+1) + "," + (j+2)+" 까지 숫자 " + del_num +" 제거");
				}
			}
		}
			
	}

}
