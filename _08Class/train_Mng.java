package _08Class;

import java.util.Scanner;

public class train_Mng {
	
	train_Obj[] tlist = new train_Obj[5]; // 기차 객체를 담을 길이가 5인 배열 생성
	String[] tNum_list = new String[4]; 	// 기본 정보를 담을 길이가 4인 배열 생성 => {1111,2222,3333,4444}
	Scanner sc = new Scanner(System.in);
	String trainNumber = null;
	String trainTime = null;
	int temp = 0;
	int cnt = 0;
	
	train_Mng(){
		while(true) {
			menu();
			System.out.print(">>>>> ");
			int selNum = sc.nextInt();
			sc.nextLine();
			System.out.println("--- " + selNum + " 선택 ---");
			if(selNum == 1) {
				enroll();
			}else if(selNum == 2) {
				modify();
			}else if(selNum == 3) {
				overall();
			}else if(selNum == 4) {
				System.out.println("감사합니다...");
				break;
			}else {				
				System.out.println("1에서 4사이의 값을 입력해주세요...");
			}
		}
	}
	
	public void menu() {
		System.out.println("메뉴");
		System.out.println("1. 등록");
		System.out.println("2. 수정");
		System.out.println("3. 전체");
		System.out.println("4. 종료");
	}
	
	public void enroll() {
		for(int i=0; i<tNum_list.length; i++) {
			tNum_list[i] = Integer.toString(((i+1)*1111));
		}
		boolean check = true;
		if(cnt == tlist.length) {
			System.out.println("더 이상 등록할 수 없습니다...");
		}else {
			System.out.println("기차번호를 입력하세요...");
			trainNumber = sc.nextLine();
			System.out.println("기차시간을 입력하세요...(형식 : HHmm)");
			trainTime = sc.nextLine();
			train_Obj train = new train_Obj(trainNumber, trainTime);
			for(int i=0; i<tNum_list.length; i++) {
				if(trainNumber.equals(tNum_list[i])) {
					check = true;
					break;
				}else {
					check = false;
				}
			}
			if(check == true) {
				for(int j=0; j<tlist.length; j++) {
					if(tlist[j] == null) {
						tlist[j] = train;
						cnt++;
						break;
					}
				}			
			}else {
				System.out.println("없는 기차번호 입니다...");
			}
		}
	}
	public void modify() {
		temp = cnt;
		boolean check = true;
		for(int i=0; i<tNum_list.length; i++) {
			tNum_list[i] = Integer.toString(((i+1)*1111));
		}
		if(cnt == 0) {
			System.out.println("등록된 기차가 없습니다...");
		}else {
			System.out.println("변경하려는 기차번호를 입력하세요...");
			String searchtNum = sc.nextLine();
			System.out.println("변경하려는 기차시간을 입력하세요...(형식 : HHmm)");
			String searchtTime = sc.nextLine();
			// 기차번호가 존재하는지 확인
			for(int i=0; i<tNum_list.length; i++) {
				if(searchtNum.equals(tNum_list[i])) {
					check = true;
					break;
				}else {
					check = false;
				}
			}
			if(check == true) {
				for(int i=0; i<tlist.length; i++) {
					if(tlist[i] != null) {
						// 변경하고자 하는 번호 찾기 (1차 판별)
						if(searchtNum.equals(tlist[i].tNum)) {
							// 변경하고자 하는 시간대 찾기 (2차 판별)
							if(searchtTime.equals(tlist[i].tTime)) {
								System.out.println("원하는 기차시간을 입력하세요...(형식 : HHmm)");
								String modtTime = sc.nextLine();
								tlist[i].tTime = modtTime;
								temp++;
								break;
							}
						}
					}
				}
			}else {
				System.out.println("없는 기차번호 입니다...");
			}
		}
		if(temp==cnt) {
			System.out.println("조건에 맞는 값이 없습니다...");
		}else {
			System.out.println("변경되었습니다...");
		}
		
	}
	public void overall() {
		int tCnt = 0;
		System.out.println("기차번호 : 기차종류 : 기차시간");
		System.out.println("-------------------");
		for(int i=0; i<tlist.length; i++) {
			if(tlist[i] != null) {
				tCnt++;
				tlist[i].show();
				System.out.println();
			}
		}
		System.out.println("총 " + tCnt + "건 조회\n");
	}
}
