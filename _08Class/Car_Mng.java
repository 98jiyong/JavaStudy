package _08Class;

import java.util.Scanner;

public class Car_Mng {
	
	Scanner in = new Scanner(System.in);
	// 길이가 7인 자동차를 등록할 배열 생성 
	Car_Obj[] clist = new Car_Obj[7];
	// 자동차수를 세는 변수 cnt를 생성
	int cnt = 0;
	Car_Mng(){
		while(true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 등록");
			System.out.println("2. 조회");
			System.out.println("3. 삭제");
			System.out.println("4. 전체보기");
			System.out.println("5. 종료");
			System.out.print("선택 >> ");
			int selNum = in.nextInt();
			in.nextLine();
			System.out.println(selNum + "을 선택함");
			if(selNum == 1) {
				enroll();
			}else if(selNum == 2) {
				select();
			}else if(selNum == 3) {
				delete();
			}else if(selNum == 4) {
				allList();
			}else {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
	// 등록
	// 주차가능한 자동차 수 => 7대 
	// 주차장이 꽉 차면 자리가 없다고 출력
	// 꽉 차지 않으면 자동차를 등록하고 cnt값을 1씩 증가
	public void enroll() {
		if(cnt == clist.length) {
			System.out.println("주차장이 꽉 찼습니다.");
		}else {
			System.out.println("가능한 주차 공간 : "+ (clist.length-cnt) + "대");
			System.out.println("자동차 등록");
			Car_Obj car = new Car_Obj();
			System.out.println("차 번호를 입력하세요");
			car.carNum = in.nextLine();
			System.out.println("이름을 입력하세요");
			car.name = in.nextLine();
			System.out.println("전화번호를 입력하세요");
			car.number = in.nextLine();
			for(int i=0; i<clist.length; i++) {
				if(clist[i] == null) {
					clist[i]=car;
					break;
				}
			}
			cnt++;
		}
	}
	// 조회
	// 차 번호를 조회하면 이름과 연락처를 표시
	public void select() {
		System.out.println("자동차 조회");
		System.out.println("차 번호를 입력하세요");
		String comp_carNum = in.nextLine();
		for(int i=0; i<clist.length; i++) {
			if(clist[i]!= null) {
				if(comp_carNum.equals(clist[i].carNum)) {
					clist[i].prt();
					break;
				}
			}
			// 배열의 끝까지 조회했을 경우 일치하는 차 번호가 없을때
			if(i == clist.length-1) {				
				System.out.println("차 번호가 맞는지 다시 확인해주세요.");					
			}
		}
		
	}
	// 삭제
	// cnt값을 확인해 등록된 차가 있는지 확인
	// cnt값이 0이라면 등록된 자동차가 한 대도 없는것이기 때문에
	// 삭제할 자동차가 없다고 출력
	// cnt값이 0이 아니라면 리스트 안에 있는 차 번호와 일치하는 자동차를 삭제
	// 삭제했을 시 다른 차들이 등록 할 수 있게 cnt값을 1씩 감소
	public void delete() {
		if(cnt == 0) {
			System.out.println("삭제할 자동차가 없습니다.");
		}else {
			System.out.println("삭제할 자동차 번호를 입력해주세요.");
			String del_carNum = in.nextLine();
			for(int i=0; i<clist.length; i++) {
				if(clist[i]!= null) {
					if(del_carNum.equals(clist[i].carNum)) {
						clist[i] = null;
						break;
					}
				}
				// 배열의 끝까지 조회했을 경우 일치하는 차 번호가 없을때
				if(i == clist.length-1) {				
					System.out.println("차 번호가 맞는지 다시 확인해주세요.");					
				}
			}
			cnt--;
		}
	}
	// 전체보기
	public void allList() {
		System.out.println("전체보기");
		System.out.println("--- info ---");
		for(int i=0; i<clist.length; i++) {
			if(clist[i] != null) {
				clist[i].prt();
				System.out.println();
			}
		}
	}

}
