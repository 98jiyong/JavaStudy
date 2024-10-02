package Course_Registration;

public class StudentOne {
	
	private String id;
	private String name;
	private String tel;
	private String grade;
	
	public void student(String id, String name, String tel, String grade) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		this.grade = grade;
	}
	
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
	
	public void view() {
		System.out.printf("%-15s", "아이디 : " + getId());
		System.out.printf("%-10s", "이름 : " + getName());
		System.out.printf("%-20s", "연락처 : " + getTel());
		System.out.printf("%-5s", "학년 : " + getGrade());
		System.out.println();
	}
}
