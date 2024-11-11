package _02If;

public class _00_Basic {

	public static void main(String[] args) {
		// 시나리오 1 - 조건이 1개인 경우 참과 거짓으로 코드 분리
		// 키가 160 미만이면 집에 가시오..
		
		int height = 163;
		if(height < 160) {
			System.out.println("집에 가시오");
		}
		// 키가 160 미만이면 집에 가시오.. 160 이상이면 환영
		if(height < 160) {
			System.out.println("집에 가시오");
		}else {
			System.out.println("환영");
		}
		
		// 점수가 있다. 만약 점수가 홀수라면 +10을 하시오.
		int point = 9;
		// step1. 조건식을 만든다.
		System.out.println(point % 2 == 1);
		// step2. 조건에 따라 참과 거짓을 분리하는 코드
		if(point % 2 == 1) {
			point += 10;
		}
		// 변경된 point 값 정상출력
		System.out.println(point);
		
		// 시나리오 2 - 조건이 여러개 있을 때 이 중에 하나를 선택
		// 키가 180 이상이면 A조, 170-179 B조, 170미만 C조
		// step1. 조건을 만든다.
		int cm = 185;
		System.out.println(cm >= 180);
		System.out.println(cm >= 170 && cm < 180);
		System.out.println(cm < 170);
		
		if(cm >= 180) {
			System.out.println("A조");
		}else if(cm >= 170) {
			System.out.println("B조");
		}else if(cm < 170) {
			System.out.println("C조");
		}
		
		// 아래 if는 위 예제랑 비슷해 보이지만
		// 단독 if가 세 개 이다. 즉 위에 if문 하고 완전 다름.
		if(cm >= 180) {
			System.out.println("A조");
		}if(cm >= 170) {
			System.out.println("B조");
		}if(cm < 170) {
			System.out.println("C조");
		}
		
		// 시나리오3 - 조건1에 참인 후에 다시 조건을 순차적으로 판별
		// 출석이 100프로이고 과제 제출 횟수가 90% 이상인 경우
		int cnt = 100;	// 출석
		int cntAnswer = 95;	// 과제 제출
		if(cnt == 100) {
			if(cntAnswer >= 90) {
				System.out.println("MVP");
			}else {
				System.out.println("Not MVP");
			}
		}else {
			System.out.println("출석율 미달로 자격 요건이 안됩니다.");
		}
	}

}
