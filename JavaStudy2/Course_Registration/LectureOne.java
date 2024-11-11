package Course_Registration;

public class LectureOne {
	
	private String subject;
	private String room;
	private String professor;
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	
	public String getSubject() {
		return subject;
	}
	public String getRoom() {
		return room;
	}
	public String getProfessor() {
		return professor;
	}
	
	public void view() {
		System.out.printf("%-15s", "과목명 : " + getSubject());
		System.out.printf("%-12s", "강의실 : " + getRoom()); 
		System.out.printf("%-15s", "교수명 : " + getProfessor());
		System.out.println();
	}
}
