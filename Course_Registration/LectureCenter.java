package Course_Registration;

import java.util.ArrayList;
import java.util.Scanner;

public class LectureCenter {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<LectureOne> lecList = new ArrayList<>();
	
	LectureCenter(){
		System.out.println("교과목관리");
		menu();
	}
	
	private void menu() {
		while(true) {
			System.out.println("1. 등록 / 2. 조회 (종료 : q)");
			String choice = sc.nextLine();
			if(choice.equals("1")) {
				register();
			}else if(choice.equals("2")) {
				check();
			}else if(choice.equals("q")) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	private void register() {
		
	}
	
	private void check() {
		
	}
	
}
