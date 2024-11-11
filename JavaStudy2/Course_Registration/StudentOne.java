package Course_Registration;

import java.util.ArrayList;

public class StudentOne {
	
	private String id;
	private String name;
	private String tel;
	private String grade;
	private int cnt;
	public ArrayList<LectureOne> signList = new ArrayList<>();
	
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	public void setSignList(ArrayList<LectureOne> signList) {
		this.signList = signList;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getGrade() {
		return grade;
	}
	public int getCnt() {
		return cnt;
	}
	public LectureOne getSignList(int a) {
		return signList.get(a);
	}
	public void view() {
		System.out.printf("%-15s", "아이디 : " + getId());
		System.out.printf("%-10s", "이름 : " + getName());
		System.out.printf("%-20s", "연락처 : " + getTel());
		System.out.printf("%-10s", "학년 : " + getGrade());
		System.out.printf("%-10s", "신청한 과목 수 : " + getCnt());
		System.out.println();
	}
	
	
	
	
	
	
}
