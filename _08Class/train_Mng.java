package _08Class;

import java.util.Scanner;

public class train_Mng {
	
	train_Obj[] tlist = new train_Obj[5]; // 기차 객체를 담을 길이가 5인 배열 생성
	
	String[] tNum_list = {"1111","2222","3333","4444"};
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
		boolean checkReg = true;
		if(cnt == tlist.length) {
			System.out.println("더 이상 등록할 수 없습니다...");
		}else {
			System.out.println("기차번호를 입력하세요...");
			trainNumber = sc.nextLine();
			// 입력한 기차 값이 기본정보에 있는 판별
			for(int i=0; i<tNum_list.length; i++) {
				if(trainNumber.equals(tNum_list[i])) {
					checkReg = true;
					break;
				}else {
					checkReg = false;
				}
			}
			if(checkReg == true) {
				System.out.println("기차시간을 입력하세요...(형식 : HHmm)");
				trainTime = sc.nextLine();
				train_Obj train = new train_Obj(trainNumber, trainTime);
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
		boolean checkTime = true;
		train_Obj[] searchList = new train_Obj[5]; // 비교 후 같은 번호의 값들을 넣을 배열 생성
		// 등록된 기차가 있는지 판별
		if(cnt ==0) {
			System.out.println("등록된 기차가 없습니다...");
		}else {
			System.out.println("기차번호를 입력해주세요...");
			String searchtNum = sc.nextLine();
			// 입력한 기차번호 조회
			for(int i=0; i<tlist.length; i++) {
				// 값이 채워진 부분만 비교하기 위해 조건문 사용
				if(tlist[i] != null) {
					// 입력한 같은 기차번호들의 값들을 새 배열에 저장
					if(searchtNum.equals(tlist[i].tNum)) {
						for(int j=0; j<searchList.length; j++) {
							if(searchList[j] == null) {
								searchList[j] = tlist[i];
								break;
							}
						}
					}
				}
			}
			// 기차번호가 없다면 새 배열은 빈 배열이기 때문에
			// 배열이 비어있다면 번호가 없다고 표시
			// 그렇지 않으면 기차시간 조회
			if(searchList[0] == null) {
				System.out.println("입력한 기차번호가 없습니다...");
			}else {			
				System.out.println("기차시간을 입력해주세요...");
				String searchtTime = sc.nextLine();
				for(int i=0; i<searchList.length; i++) {
					if(searchList[i] != null) {
						// 번호가 같을 시 기차시간을 비교
						if(searchtTime.equals(searchList[i].tTime)) {
							// 시간이 같을 시 변경하고자 하는 기차시간 입력
							System.out.println("변경할 기차시간을 입력해주세요...");
							String modtTime = sc.nextLine();
							// 기차번호와 기차시간이 같은 기차에 시간을 변경 
							for(int j=0; j<tlist.length; j++) {
								if(tlist[j] != null) {
									if(searchtNum.equals(tlist[j].tNum)){
										if(searchtTime.equals(tlist[j].tTime)) {
											tlist[j].tTime = modtTime;
											checkTime = true;
											break;
										}
									}
								}
							}
							break;
						}else { // 같은 기차번호 중 입력한 기차시간이 없다면
							checkTime = false;
						}
					}
				}
			}
			// 기차시간이 틀리다면 
			if(checkTime == false) {
				System.out.println("입력한 기차시간이 없습니다...");
			}
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
