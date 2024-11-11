package _99TestPm;

public class Test01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 시나리오
		System.out.println("메모장 프로그램");
		String title = "[나의 점심]";
		String body = "[오늘은 자장면]";
		System.out.println(title + body);
		title = "[점심메뉴]";
		System.out.println(title);
		int visit = 0;
		body = "[짬뽕도 먹음]";
		visit = 10;
		System.out.println(title + ", " + body + ", " + visit);

		// level up1
		body += "[탕수육도 먹음]";
		
		// level up2
		int point = 80;
		System.out.println(point);
		double b = 10;
		double c = 4;
		double result = b/c ;
		System.out.println(result);
		String name = null;
		name = "홍길동";
		System.out.println(name + "님");
		int eng_score = 90;
		int math_score = 87;
		int comp_score = 100;
		double divInt =3.0;
		double avg_score =(eng_score + math_score + comp_score)/divInt;
		System.out.println(avg_score);
		
		// level up3
		int a = 10;
		System.out.println(a % 3 == 0);
	}
	
}
