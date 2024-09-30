package JavaWord;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class WordCenter {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<WordOne> wlist = new ArrayList<>();
	
//	WordCenter(){
//		
//	}
	void menu() {
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 등록");
			System.out.println("2. 조회");
			System.out.println("3. 삭제");
			System.out.println("4. 수정");
			System.out.println("5. 종료");
			int selNum  = sc.nextInt();
			sc.nextLine();
			if(selNum ==1) {
				register();
			}else if(selNum == 2) {
				overall();
			}else if(selNum == 3) {
				delete();
			}else if(selNum == 4) {
				modify();
			}else if(selNum == 5) {
				break;
			}else {
				System.out.println("1 ~ 5 사이의 번호를 입력해주세요.");
			}
		}
		
	}
	private void register() {
		// 10개까지 저장 가능하게 설정
		if(wlist.size() == 10) {
			System.out.println("더 이상 등록할 수 없습니다.");
		}else {
			WordOne word = new WordOne();
			while(true) {
				System.out.println("한글 단어를 입력해주세요.");
				String kWord = sc.nextLine();
				if(Pattern.matches("^[ㄱ-ㅎ가-힣]*$", kWord)) {
					word.setkWord(kWord);
					break;
				}
			}
			while(true) {
				System.out.println("영어 단어를 입력해주세요.");
				String eWord = sc.nextLine();
				if(Pattern.matches("^[a-zA-Z]*$", eWord)) {
					word.seteWord(eWord);
					break;
				}
			}
			wlist.add(word);
		}
	}
	
	private void overall() {
		if(wlist.isEmpty()) {
			System.out.println("단어가 없습니다.");
		}else {
			System.out.println("1. 선택조회");
			System.out.println("2. 전체조회");
			int selNum = sc.nextInt();
			sc.nextLine();
			if(selNum == 1) {
				System.out.println("조회하고 싶은 단어를 입력하세요 (한글)");
				String searchWord = sc.nextLine();
				if(isin(searchWord)) {
					for(int i=0; i<wlist.size(); i++) {
						if(wlist.get(i).getkWord().equals(searchWord)) {
							wlist.get(i).view();
							break;
						}
					}
				}else {
					System.out.println("입력한 단어가 맞는지 확인해주세요.");
				}
			}else if(selNum == 2) {
				for(int i=0; i<wlist.size(); i++) {
					wlist.get(i).view();
				}
			}else {
				System.out.println("1 혹은 2를 입력해주세요.");
			}
		}
	}
	
	private void delete() {
		if(wlist.isEmpty()) {
			System.out.println("단어가 없습니다.");
		}else {
			System.out.println("1. 선택삭제");
			System.out.println("2. 전체삭제");
			int selNum = sc.nextInt();
			sc.nextLine();
			if(selNum == 1) {
				System.out.println("삭제하고 싶은 단어를 입력하세요 (영어)");
				String searchWord = sc.nextLine();
				if(isin(searchWord)) {
					for(int i=0; i<wlist.size(); i++) {
						if(wlist.get(i).geteWord().equals(searchWord)) {
							wlist.remove(i);
							break;
						}
					}
				}else {
					System.out.println("입력한 단어가 맞는지 확인해주세요.");
				}
			}else if(selNum == 2) {
				for(int i=0; i<wlist.size(); i++) {
					wlist.clear();
				}
			}else {
				System.out.println("1 혹은 2를 입력해주세요.");
			}
		}
	}
	
	private void modify() {
		if(wlist.isEmpty()) {
			System.out.println("단어가 없습니다.");
		}else {
			System.out.println("수정하고 싶은 단어를 입력하세요 (한글)");
			String searchWord = sc.nextLine();
			if(isin(searchWord)) {
				WordOne word =  new WordOne();
				System.out.println("수정할 한글단어를 입력하세요.");
				String modKword = sc.nextLine();
				System.out.println("수정할 영어단어를 입력하세요.");
				String modEword = sc.nextLine();
				for(int i=0; i<wlist.size(); i++) {
					if(wlist.get(i).getkWord().equals(searchWord)) {
						word.setkWord(modKword);
						word.seteWord(modEword);
						wlist.set(i, word);
						break;
					}
				}
			}else {
				System.out.println("입력한 단어가 맞는지 확인해주세요.");
			}
		}
	}
	
	private boolean isin(String n) {
		// 한글일 때 영어일 때 구분
		if(Pattern.matches("^[ㄱ-ㅎ가-힣]*$", n)) {
			for(int i=0; i<wlist.size(); i++) {
				if(wlist.get(i).getkWord().equals(n)) {
					return true;
				}
			}
		}else {
			for(int i=0; i<wlist.size(); i++) {
				if(wlist.get(i).geteWord().equals(n)) {
					return true;
				}
			}
		}
		return false;
	}

	
	
}
