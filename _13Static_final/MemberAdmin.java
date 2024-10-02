package _13Static_final;

public class MemberAdmin {
	
	public String name = null;
	public static String companyName = "Human";
	
	MemberAdmin(){
		String name = Thread.currentThread().getName();
		System.out.println(name + "스레드가 MemberAdmin" + "생성자 실행");
	}
	public static void prt() {
//		System.out.println(name);
	}
	

}
