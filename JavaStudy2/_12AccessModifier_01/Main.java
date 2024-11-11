package _12AccessModifier_01;

import _12AccessModifier_02.MemberOne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberOne m = new MemberOne();
		// m.name = "hong";	// error -> name 변수는 default로 선언돼있기 때문에
		m.setName("1234");
		m.setName("4567");
//		m.prt();	// 가능
		
		
		
	}

}
