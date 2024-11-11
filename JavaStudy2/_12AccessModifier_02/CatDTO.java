package _12AccessModifier_02;

public class CatDTO {
	// 멤버변수는 접근제어자로 은닉화 시킨다.
	// 은닉화 시키면 CatDTO클래스 외부에서 변수에 참조를 어떻게 하려고??
	// 일단 은닉화 하고,, 멤버 변수에 저장 및 인출에 괸련 메서드를 만든다..
	// 저장하는 메서드를 setter 인출하는 메서드를 getter라고 부릅니다.
	private String name;
	private int age=1;
	public void setName(String name) {
		chkName(name);
		this.name = name;
	}
	
	private void chkName(String name2) {
		// TODO Auto-generated method stub
		
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
