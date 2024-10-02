package Course_Registration;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentCenter {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<StudentOne> stuList = new ArrayList<>();
	
	StudentCenter(){
		System.out.println("학생관리");
		menu();
	}
	
	private void menu() {
		while(true) {
			System.out.println("1. 등록 / 2. 검색 / 3. 조회 / 4. 삭제 (종료 : q)");
			String choice = sc.nextLine();
			if(choice.equals("1")) {
				register();
			}else if(choice.equals("2")) {
				search();
			}else if(choice.equals("3")) {
				overall();
			}else if(choice.equals("4")) {
				delete();
			}else if(choice.equals("q")) {
				break;
			}else {
				System.out.println("다시 입력하세요.");
			}
		}
	}
	
	private void register() {
		if(stuList.size() == 10) {
			System.out.println("더 이상 등록할 수 없습니다.");
		}else {
			StudentOne s = new StudentOne();
			while(true) {
				System.out.println("ID를 입력해주세요.");
				String id = sc.nextLine();
				if(dpCheck(id)) {
					System.out.println("이미 사용중인 아이디입니다. / ID : " + id);
				}else {
					System.out.println("사용 가능한 아이디입니다. / ID : " + id);
					s.setId(id);
					break;
				}
			}
			System.out.println("이름을 입력해주세요.");
			String name = sc.nextLine();
			s.setName(name);
			System.out.println("연락처를 입력해주세요. (형식 : 010-0000-0000)");
			String tel = sc.nextLine();
			s.setTel(tel);
			System.out.println("학년을 입력해주세요.");
			String grade = sc.nextLine();
			s.setGrade(grade);
			stuList.add(s);
		}
	}
	
	private void search() {
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("이름에 \"" + name + "\"이(가) 포함된 검색 결과");
		for(int i=0; i<stuList.size(); i++) {
			String searchName = stuList.get(i).getName();
			if(searchName.contains(name)) {
				stuList.get(i).view();
			}
		}
		// 하나도 없다면?
		// isin() 메서드로 먼저 판별 후 정보 추출 
	}
	
	private void overall() {
		for(int i=0; i<stuList.size(); i++) {
			stuList.get(i).view();
		}
	}
	
	private void delete() {
		
	}
	
	
	private boolean dpCheck(String id) {
		for(int i=0; i<stuList.size(); i++) {
			String checkId = stuList.get(i).getId();
			if(id.equals(checkId)) {
				return true;
			}
		}
		return false;
	}
	private boolean isin(String id) {
		
		return true;
	}
}
