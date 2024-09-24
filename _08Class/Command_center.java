package _08Class;

import java.util.Scanner;

public class Command_center {
	User_center u = null;
	Event_center e = null;
	Scanner sc = new Scanner(System.in);
	
	Command_center(){
		if(u == null) {
			u = new User_center();
		}
		if(e == null) {
			e = new Event_center();
		}
		menu();
	}
	
	public void menu(){
		while(true) {
			System.out.println("------");
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 삭제");
			System.out.println("4. 전체");
			System.out.println("5. 종료");
			System.out.println("------");
			System.out.print(">>> ");
			int selNum = sc.nextInt();
			sc.nextLine();
			if(selNum == 1) {
				register();
			}else if(selNum == 2) {
				update();
			}else if(selNum == 3) {
				delete();
			}else if(selNum == 4) {
				overall();
			}else if(selNum == 5) {
				System.out.println("감사합니다.");
				break;
			}else {
				System.out.println("1 ~ 5 사이의 숫자를 입력해주세요.");
			}
		}
	}
	
	public void register() {
		System.out.println("무엇을 등록하시겠습니까?");
		System.out.println("1. 고객    2. 이벤트");
		int regNum = sc.nextInt();
		sc.nextLine();
		if(regNum == 1) {
			u.regClient();
		}else if(regNum == 2){
			e.regEvent();
		}else {
			System.out.println("1 혹은 2를 입력해주세요.");
		}
	}
	
	public void update() {
		u.modClient();
	}
	
	public void delete() {
		u.delClient();
	}
	
	public void overall() {
		System.out.println("무엇을 조회하시겠습니까?");
		System.out.println("1. 고객    2. 이벤트");
		int ovNum = sc.nextInt();
		sc.nextLine();
		if(ovNum == 1) {
			u.ovClient();
		}else if(ovNum == 2){
			e.ovEvent();
		}else {
			System.out.println("1 혹은 2를 입력해주세요.");
		}
	}
}
