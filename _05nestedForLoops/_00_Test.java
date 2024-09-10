package _05nestedForLoops;

public class _00_Test {

	public static void main(String[] args) {
		String id = "abc*";
		String sign = "*^$";
		
		for(int i = 0; i < id.length(); i++) {
			for(int j = 0; j < sign.length(); j++) {
				if(id.charAt(i) == sign.charAt(j)) {
					System.out.println("특수문자는 " + sign.charAt(j));
				}
			}
		}

	}

}
