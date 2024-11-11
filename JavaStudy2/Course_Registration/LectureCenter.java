package Course_Registration;

import java.util.ArrayList;
import java.util.Scanner;

public class LectureCenter {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<LectureOne> lecList = new ArrayList<>();
	private static final int maxRegCnt = 10;
	private static final int minRegCnt = 0;
	
//	LectureCenter(){
//	}
	
	public void menu() {
		while(true) {
			System.out.println("교과목관리");
			System.out.println("1. 등록 / 2. 조회 (종료 : q)");
			String choice = sc.nextLine();
			if(choice.equals("1")) {
				register();
			}else if(choice.equals("2")) {
				overall();
			}else if(choice.equals("q")) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	private void register() {
		if(lecList.size() == maxRegCnt) {
			System.out.println("더 이상 등록할 수 없습니다.");
		}else {
			LectureOne l = new LectureOne();
			while(true) {
				System.out.println("과목명을 입력해주세요.");
				String subject = sc.nextLine();
				if(dpCheck(subject)) {
					System.out.println("이미 사용중인 과목명입니다. / 과목명 : " + subject);
				}else {
					System.out.println("사용 가능한 과목명입니다. / 과목명 : " + subject);
					l.setSubject(subject);
					break;
				}
			}
			System.out.println("강의실을 입력해주세요.");
			String room = sc.nextLine();
			l.setRoom(room);
			System.out.println("담당교수를 입력해주세요.");
			String professor = sc.nextLine();
			l.setProfessor(professor);
			lecList.add(l);
		}
	}
	
	private void overall() {
		if(lecList.size() == minRegCnt) {
			System.out.println("등록된 교과목이 없습니다.");
		}else {
			 for(int i=0; i<lecList.size(); i++) {
				 System.out.print((i+1) + ". ");
				 lecList.get(i).view();
			 }
		}
	}
	
	private boolean dpCheck(String subject) {
		for(int i=0; i<lecList.size(); i++) {
			String checkSubject = lecList.get(i).getSubject();
			if(subject.equals(checkSubject)) {
				return true;
			}
		}
		return false;
	}
	
//	private boolean isin(String id) {
//		if(flag) {
//			for(int i=0; i<stuList.size(); i++) {
//				String compName = stuList.get(i).getName();
//				if(compName.contains(id)) {
//					return true;
//				}
//			}
//			return false;
//		}else{
//			for(int i=0; i<stuList.size(); i++) {
//				String compId = stuList.get(i).getId();
//				if(id.equals(compId)) {
//					return true;
//				}
//			}
//			return false;
//		}
//		
//	}
	
}
