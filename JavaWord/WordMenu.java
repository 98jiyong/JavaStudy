package JavaWord;

import java.util.Scanner;

public class WordMenu {
	
	Scanner sc = new Scanner(System.in);
	WordCenter wc = null;
	WordGame wg = null;
	
	WordMenu(){
		if(wc == null) {
			wc = new WordCenter();
		}
		if(wg == null) {
			wg = new WordGame();
		}
		wg.wc1  = wc;
		menu();
	}
	private void menu() {
		while(true) {			
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 단어");
			System.out.println("2. 게임");
			System.out.println("3. 종료");
			int selNum  = sc.nextInt();
			sc.nextLine();
			if(selNum ==1) {
				wc.menu();
			}else if(selNum == 2) {
				wg.game();
			}else if(selNum == 3) {
				break;
			}else {
				System.out.println("1 ~ 2 사이의 번호를 입력해주세요.");
			}
		}
	}
}
