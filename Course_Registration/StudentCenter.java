package Course_Registration;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentCenter {
	
	Scanner sc = new Scanner(System.in);
	ArrayList<StudentOne> stuList = new ArrayList<>();
	private static final int maxRegCnt = 10;
	private static final int minRegCnt = 0;
	boolean flag;
//	StudentCenter(){
//	}
	
	public void menu() {
		while(true) {
			System.out.println("학생관리");
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
		if(stuList.size() == maxRegCnt) {
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
		if(stuList.size() == minRegCnt) {
			System.out.println("검색할 정보가 없습니다.");
		}else {
			flag = true;
			System.out.println("이름을 입력해주세요.");
			String name = sc.nextLine();
			if(isin(name)) {			
				System.out.println("이름에 \"" + name + "\"이(가) 포함된 검색 결과");
				for(int i=0; i<stuList.size(); i++) {
					String searchName = stuList.get(i).getName();
					if(searchName.contains(name)) {
						stuList.get(i).view();
					}
				}
			}else {
				System.out.println("\"" + name + "\"이(가) 포함된 검색 결과가 없습니다.");
			}
		}
	}
	
	private void overall() {
		if(stuList.size() == minRegCnt) {
			System.out.println("조회할 정보가 없습니다.");
		}else {
			for(int i=0; i<stuList.size(); i++) {
				System.out.print((i+1) + ". ");
				stuList.get(i).view();
			}
		}
	}
	
	private void delete() {
		if(stuList.size() == minRegCnt) {
			System.out.println("삭제할 정보가 없습니다.");
		}else {			
			flag = false;
			System.out.println("삭제할 학생의 아이디를 입력해주세요.");
			String searchId = sc.nextLine();
			if(isin(searchId)) {
				for(int i=0; i<stuList.size(); i++) {
					String delId = stuList.get(i).getId();
					if(delId.equals(searchId)) {
						stuList.remove(i);
					}
				}
			}else {
				System.out.println("입력한 아이디가 맞는지 확인해주세요.");
			}
		}
		
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
		if(flag) {
			for(int i=0; i<stuList.size(); i++) {
				String compName = stuList.get(i).getName();
				if(compName.contains(id)) {
					return true;
				}
			}
			return false;
		}else{
			for(int i=0; i<stuList.size(); i++) {
				String compId = stuList.get(i).getId();
				if(id.equals(compId)) {
					return true;
				}
			}
			return false;
		}
	}
}
