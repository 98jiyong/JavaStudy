package _08Class;

import java.util.Scanner;

public class User_center {
	
	User_one[] ulist = new User_one[5];
	Scanner sc = new Scanner(System.in);
	int uCnt = 0;
	
	public void regClient(){
		User_one user = new User_one();
		if(uCnt == ulist.length) {
			System.out.println("더이상 등록할 수 없습니다.");
		}else {
			System.out.println("아이디를 입력해주세요.");
			System.out.println("영문 + 숫자로 10글자 작성(10글자 초과시 10글자만 등록)");
			String uId = sc.nextLine();
			user.setId(uId);
			System.out.println("이름을 입력해주세요.");
			String uName = sc.nextLine();
			user.setName(uName);
			for(int i=0; i<ulist.length; i++) {
				if(ulist[i] == null) {
					ulist[i] = user;
					uCnt++;
					break;
				}
			}
		}
	}
	
	public void modClient() {
		User_one[] clist = new User_one[10];
		System.out.println("이름을 입력해주세요.");
		String checkName = sc.nextLine();
		// 입력한 이름이 정보에 있는지 확인 (추가필요)
		for(int i=0; i<ulist.length; i++) {			
			if(ulist[i] != null) {
				String userName = ulist[i].getName();
				if(userName.equals(checkName)) {
					for(int j=0; j<clist.length; j++) {
						if(clist[j] == null) {
							clist[j] = ulist[i];
							break;
						}
					}
				}
			}
		}
		// 이름이 같은 사람들 출력 
		System.out.println("등록된 고객 중 \""+checkName+"\"" + " 의 이름을 가진 고객의 아이디");
		for(int i=0; i<clist.length; i++) {
			if(clist[i] != null) {
				String userId = clist[i].getId();
				System.out.println((i+1) + ". 아이디 : " + userId);
			}
		}
		System.out.println("아이디를 입력해주세요.");
		String checkId = sc.nextLine();
		// 입력한 아이디가 정보에 있는지 확인 (추가필요)
		System.out.println("변경하고자 하는 아이디를 입력해주세요.");
		String modId = sc.nextLine();
		for(int i=0; i<ulist.length; i++) {
			if(ulist[i] != null) {
				String userId = ulist[i].getId();
				String userName = ulist[i].getName();
				if(userId.equals(checkId)) {
					if(userName.equals(checkName)) {
						ulist[i].setId(modId);
						break;
					}
				}
			}
		}
	}
	
	public void delClient() {
		System.out.println("이름을 입력해주세요.");
		String checkName = sc.nextLine();
		System.out.println("아이디를 입력해주세요.");
		String checkId = sc.nextLine();
		for(int i=0; i<ulist.length; i++) {
			if(ulist[i] != null) {
				String userId = ulist[i].getId();
				String userName = ulist[i].getName();
				if(userId.equals(checkId)) {
					if(userName.equals(checkName)) {
						ulist[i] = null;
						System.out.println("삭제되었습니다.");
						break;
					}
				}
			}
		}
	}
	
	public void ovClient() {
		System.out.println("고객 리스트");
		for(int i=0; i<ulist.length; i++) {
			if(ulist[i] != null) {
				String userId = ulist[i].getId();
				String userName = ulist[i].getName();
				System.out.println((i+1) + ". 아이디 : " + userId + " 이름 : " + userName);
			}
		}
		System.out.println("총 " + uCnt + "명");
	}
}
