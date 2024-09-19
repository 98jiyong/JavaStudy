package _08Class;

import java.util.Scanner;

public class Cat_m {
	Scanner in = new Scanner(System.in);
	Cat_Obj[] clist = new Cat_Obj[5];
	Cat_m(){
		while(true) {
			System.out.println(" 냐옹~ ");
			System.out.println("1. 등록");
			System.out.println("2. 삭제");
			System.out.println("3. 수정");
			System.out.println("4. 전체보기");
			System.out.println(" 선택 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum + "을 선택함");
			if(selNum == 1) {
				add();
			}else if(selNum == 2) {
				del();
			}else if(selNum == 3) {
				mod();
			}else if(selNum == 4) {
				allList();
			}else {
				break;
			}
		}
	}
	public void add() {
		System.out.println("고양이 등록");
		Cat_Obj cat = new Cat_Obj();
		System.out.println("고양이 이름을 입력");
		cat.name = in.nextLine();
		System.out.println("고양이 나이를 입력");
		cat.age = in.nextInt();
		in.nextLine();
		for(int i=0; i<clist.length; i++) {
			if(clist[i] == null) {
				clist[i]=cat;
				break;
			}
		}
	}
	public void del() {
		System.out.println("고양이 삭제");
	}
	public void mod() {
		System.out.println("고양이 수정");
		System.out.println("어떤 고양이를 수정할것인가요?");
		
	}
	public void allList() {
		System.out.println("고양이 전체보기");
		for(int i=0; i<clist.length; i++) {
			if(clist[i] != null) {
				clist[i].prt();
			}
		}
	}
}
