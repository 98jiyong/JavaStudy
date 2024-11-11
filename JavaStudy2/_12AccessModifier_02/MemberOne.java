package _12AccessModifier_02;

public class MemberOne {
	private String name = null;
	
	public void setName(String n) {
		if(chkName(n)) {
			this.name = n;
		}else {
			this.name = "err";
		}
		System.out.println(name);
	}
	
	private boolean chkName(String n) {
		if(n.charAt(0) == '4' ) {
			return false;
		}
		return true;
	}
	// chkName은 내부적으로 호출하는 메서드로 정의하였으므로 private가 적당함.
	public void prt() {
		System.out.println(name);
	}
}
