package Course_Registration;

import java.util.Scanner;

public class MainMenu {
	
	Scanner sc = new Scanner(System.in);
	
	MainMenu(){
		while(true) {			
			System.out.println("1. 학생관리 / 2. 교과목관리 / 3. 로그인 (종료 : q)");
			String choice = sc.nextLine();
			if(choice.equals("1")) {
				new StudentCenter();
			}else if(choice.equals("2")) {
				new LectureCenter();
			}else if(choice.equals("3")) {
				new Login();
			}else if(choice.equals("q")) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
		
	}
}
