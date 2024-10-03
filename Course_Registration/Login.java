package Course_Registration;

//import java.util.ArrayList;
import java.util.Scanner;

public class Login {

	Scanner sc = new Scanner(System.in);
	StudentCenter stuC = null;
	LectureCenter lecC = null;
	StudentOne userS = null;
//	ArrayList<LectureOne> lecList = null;
	String userId;
	int signCnt;
	boolean flag;
	
//	Login(){
//	}
	
	public void menu() {
		log();
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
	
	private void log() {
		while(true) {
			flag = true;
			System.out.println("아이디를 입력해주세요.");
			userId = sc.nextLine();
			if(isin(userId)) {
				for(int i=0; i<stuC.stuList.size(); i++) {
					String listId = stuC.stuList.get(i).getId();
					if(userId.equals(listId)) {
						userS = stuC.stuList.get(i);
						signCnt = userS.getCnt();
//					lecList = userS.getSignList();
					}
				}
				break;
			}else {
				System.out.println("입력한 아이디가 없습니다.");
			}
		}
	}
	private void signup() {
		flag = false;
		for(int i=0; i<lecC.lecList.size(); i++) {
			System.out.print((i+1) + ". ");
			lecC.lecList.get(i).view();
		}
		System.out.println("수강신청할 교과번호를 입력해주세요.");
		String signNum = sc.nextLine();
		if(isin(signNum)) {
			for(int i=0; i<lecC.lecList.size(); i++) {
				if(signNum.equals(Integer.toString(i+1))) {
					signCnt++;
//					lecList.add(lecC.lecList.get(i));
					userS.signList.add(lecC.lecList.get(i));
//					userS.setSignList(lecList);
					userS.setCnt(signCnt);
					System.out.println("신청됐습니다.");
				}
			}
		}else {
			System.out.println("번호가 맞는지 확인해주세요.");
		}
		
	}
	private void list() {
		if(userS.signList.size() == 0) {
			System.out.println("신청한 교과목이 없습니다.");
		}else {
			System.out.println(userId + "님의 신청 리스트");
			for(int i=0; i<userS.signList.size(); i++) {
//				userS.signList.get(i).view();
				userS.getSignList(i).view();
			}
		}
	}
	
	private boolean isin(String id) {
		if(flag) {
			for(int i=0; i<stuC.stuList.size(); i++) {
				String compId = stuC.stuList.get(i).getId();
				if(id.equals(compId)) {
					return true;
				}
			}
			return false;
		}else {
			for(int i=0; i<lecC.lecList.size(); i++) {
//				String compId = stuC.stuList.get(i).getId();
				if(id.equals(Integer.toString((i+1)))) {
					return true;
				}
			}
			return false;
		}
	}
	
}
