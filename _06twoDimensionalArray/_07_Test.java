package _06twoDimensionalArray;

public class _07_Test {
	
	public static void main(String[] args) {
		int[][] game = {
				{1,1,0,2},
				{3,2,1,2},
				{0,0,3,2},
				{4,4,4,4},
				{2,4,3,1},
				{2,4,1,3}
		};
		int jmp = 0;
		int cnt = 0;
		for(int i = 0; i < game[i].length; i++) {
			for(int j = 0; j < game.length; j++) {
				for(int k = j; k < game.length; k++) {
					System.out.println(game[j][i] + " "  + game[k][i]);
					if(game[j][i] == game[k][i]) {
						cnt++;
						jmp++;
						System.out.println(cnt);
					}else {
						if(cnt >= 3) {
							System.out.println("제거");
						}
						j = j + jmp-1;
						cnt = 0;
						jmp = 0;
						break;
					}
					if(k == game.length-1) {
						if(cnt>=3) {
							System.out.println("제거");
							j = j + jmp-1;
							cnt = 0;
							jmp = 0;
						}else {
							j = j + jmp-1;
							cnt = 0;
							jmp = 0;
						}
					}
				}
				System.out.println("cnt = " + cnt);
			}
		}
	}

}
