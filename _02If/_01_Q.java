package _02If;

public class _01_Q {

	public static void main(String[] args) {
		/*
		 * Q1
		 * 수강관리 프로젝트를 진행한다.
		 * 학생의 정보는 이름 학번 나이 성적이다.
		 * 나이가 18세 미만은 수강신청을 할 수 없다. 
		 * 성적이 60점 이상이면서 70점 미만인 학생은 수강 신청을 할 수 있지만
		 * 이름 뒤에 별표를 추가한다.
		 * 학생의 성적을 기준으로
		 * 90점 이상이면 A
		 * 80점 이상이면 B
		 * 70점 이상이면 C
		 * 60점 이상이면 D
		 * 60점 미만이면 F라고 출력한다.
		 * 
		 * Q2
		 *  int a = 10;
		 *  int b = 20;
		 *  int my = 15;
		 *  문제 a와 b는 도로의 길이이며 위치이다.
		 *  my는 나의 위치이다.
		 *  내가 도로위에 있으면 도로위.. 도로위가 아니라면 도로가아님이라고 출력하시오
		 *  up1
		 *  만약 내가 도로위라면
		 *  a지점으로부터 5(my위치에 따라 달라짐)만큼 떨어져 있습니다 라고 출력하시오
		 *  up2
		 *  up1에서 현재 my위치가 가까운 쪽 기준으로 출력한다
		 *  예를들어 my 18이면 b에 더 가까우니 b에서 부터 2거리 떨어져 있습니다. 
		 */
		
		// Q1
		String name = "정지용";
		String id = "201804108";
		int age = 20;
		int grade = 65;
		
		if(age >= 18) {
			if(grade >= 90) {
				System.out.println("이름 : " + name + ", 학번 : " + id + ", 성적 : A");
			}
			else if(grade >= 80) {
				System.out.println("이름 : " + name + ", 학번 : " + id + ", 성적 : B");
			}
			else if(grade >= 70) {
				System.out.println("이름 : " + name + ", 학번 : " + id + ", 성적 : C");
			}
			else if(grade >= 60) {
				System.out.println("이름 : " + name + "*, 학번 : " + id + ", 성적 : D");
			}
			else {
				System.out.println("이름 : " + name + ", 학번 : " + id + ", 성적 : F");
			}
		}else {
			System.out.println("수강신청을 할 수 없습니다.");
		}
		
		// Q2
		int a = 10;
		int b = 20;
		int my = 17;
		int cp = 0;
		
		if(a <= my && b >= my) {
			System.out.println("도로 위에 있음");
			 System.out.println("a에서 " + (my-a) + "만큼 떨어져 있음");
		}else {
			System.out.println("도로가 아님");
		}
		
		// up2
		if(a <= my && b >= my) {
			System.out.println("도로 위에 있음");
			if((my - a) < (b - my)) {
				cp = my - a;
				System.out.println("a에서 " + cp + "만큼 떨어져 있음");
			}else {
				cp = b - my;
				System.out.println("b에서 " + cp + "만큼 떨어져 있음");
			}
		}else {
			System.out.println("도로가 아님");
		}
	}

}
