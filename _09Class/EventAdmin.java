package _09Class;

import java.util.Scanner;

//이벤트 관리 클래스
public class EventAdmin {
	Scanner in = new Scanner(System.in);
	EventOne[] elist = new EventOne[5];
	
	EventAdmin() {
		//menu();
	}
	public void menu() {
		while(true) {
			System.out.println("1.이벤트등록");
			System.out.println("2.이벤트보기");
			System.out.println("9.이전메뉴");
			int num = in.nextInt();
			in.nextLine();
			if(num==1) {
				addEvent();
			}else if(num==2) {
				allListEvent();
			}else if(num ==9) {
				break; // while문 종료
			}
		}
	}
	public void allListEvent() {
		// TODO Auto-generated method stub
		for(int i=0; i < elist.length; i++) {
			if(elist[i]!=null) {
				elist[i].prt();
			}
		}
		
	}
	private void addEvent() {
		// TODO Auto-generated method stub
		EventOne temp = new EventOne();
		System.out.println("제목을 입력하세요");
		String title = in.nextLine();
		temp.title=title;
		System.out.println("내용을 입력하세요");
		String memo = in.nextLine();
		temp.memo=memo;		
		for(int i=0; i < elist.length; i++) {
			if(elist[i]==null) {
				elist[i]=temp;
				break;
			}
		}
		temp=null;
		
	}
}