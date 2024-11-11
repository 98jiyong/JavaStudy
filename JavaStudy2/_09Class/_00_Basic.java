package _09Class;

public class _00_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "880104";
		System.out.println(a.substring(0, 2));
		String year = a.substring(0, 2);
		System.out.println(year);
		System.out.println("19"+year);
		
		
		String w = "개나리";
		String title = "오늘 컨디션 참 개나리야 짜증!";
		if(title.contains(w)) {
			System.out.println("욕하지 마세요");
		}else {
			System.out.println("제목은 올바른 표현입니다.");
		}
		
		// 과제 : 제목에서 개나리 부분을 ***으로 바꾸세요
		String changeTitle = title.replaceAll("개나리", "***");
		System.out.println(changeTitle);
		
		// 과제 :	제목에서 개나리라는 단어가 포함된 부분을 가져오세요
		//		단어가 포함된 기준은 개나리단어의 시작부터 스페이스까지
		//		위 샘플에서 [개나리야]를 가져오는 것입니다.
		System.out.println(title.lastIndexOf(""));
		String cTitle = title.substring(title.indexOf(w), title.indexOf(" ", title.indexOf(w)));
//		String cTitle = title.substring(title.indexOf(w), title.lastIndexOf("")-1);
		System.out.println(cTitle);
	}

}
