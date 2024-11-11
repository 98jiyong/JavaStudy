package JavaWord;

import java.util.ArrayList;
import java.util.Scanner;

public class WordGame {
	
	Scanner sc = new Scanner(System.in);
	WordCenter wc1 = null;
	ArrayList<WordOne> icWord = new ArrayList<>();
	
	void game() {
		System.out.println("게임 시작");		
		for(int i=0; i<wc1.wlist.size(); i++) {
			WordOne word = new WordOne();
			System.out.println(wc1.wlist.get(i).getkWord());
			String write = sc.nextLine();
			
			if(wc1.wlist.get(i).geteWord().equals(write)) {
				System.out.println("Good!");
			}else {
				word.setkWord(wc1.wlist.get(i).getkWord());
				word.seteWord(write);
				icWord.add(word);
			}
		}
		for(int i=0; i<icWord.size(); i++) {
			icWord.get(i).view();
		}
	}
}
