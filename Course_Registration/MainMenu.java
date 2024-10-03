package Course_Registration;

import java.util.Scanner;

public class MainMenu {
	
	Scanner sc = new Scanner(System.in);
	StudentCenter stuCtr = null;
	LectureCenter lecCtr = null;
	Login lg = null;
	
	MainMenu(){
		stuCtr = new StudentCenter();
		lecCtr = new LectureCenter();
		lg = new Login();
		lg.lecC = lecCtr;
		lg.stuC = stuCtr;
		
		while(true) {			
			System.out.println("1. 학생관리 / 2. 교과목관리 / 3. 로그인 (종료 : q)");
			String choice = sc.nextLine();
			if(choice.equals("1")) {
				stuCtr.menu();
			}else if(choice.equals("2")) {
				lecCtr.menu();
			}else if(choice.equals("3")) {
				lg.menu();
			}else if(choice.equals("q")) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
		
	}
}
