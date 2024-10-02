package Course_Registration;

import java.util.Scanner;

public class Login {

	Scanner sc = new Scanner(System.in);
	
	Login(){
		System.out.println("로그인");
		menu();
	}
	
	private void menu() {
		while(true) {
			System.out.println("1. 수강신청 / 2. 신청리스트 (종료 : q)");
			String choice = sc.nextLine();
			if(choice.equals("1")) {
				signup();
			}else if(choice.equals("2")) {
				list();
			}else if(choice.equals("q")) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	private void signup() {
		
	}
	private void list() {
		
	}
}
