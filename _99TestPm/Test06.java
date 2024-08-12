package _99TestPm;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// 우럭조 
		// 0.짝수만 출력하시오.
		System.out.println("Q0");
		int[] letter = {8,12,4,13,2,14,4,5};
		for(int i = 0; i < letter.length; i ++) {
			if(letter[i] % 2 == 0) {				
				System.out.print(letter[i] + " ");
			}
		}
		System.out.println();
		System.out.println("------------------");
		
		// 1.배열의 가장 큰수가 있는 인덱스를 출력하시오.
		System.out.println("Q1");
		int bigNum = 0;
		for(int i = 0; i < letter.length; i ++) {
			if(letter[i] > bigNum) {			
				bigNum = letter[i];
			}
		}
		System.out.println(bigNum);
		System.out.println("------------------");
		
		// 2.범인을찾으시오 / 범인은 짝수이면서 가장큰 값이다. / 범인은 14입니다. 
		System.out.println("Q2");
		for(int i = 0; i < letter.length; i ++) {
			if(letter[i] % 2 == 0) {				
				if(letter[i] > bigNum) {			
					bigNum = letter[i];
				}
			}
		}
		System.out.println(bigNum);
		System.out.println("------------------");
		
		// 3.letter  배열은 word문자열 알파벳의 위치이다.
		// letter배열의 암호를 풀어서 편지의 내용을 출력하시오. 
		System.out.println("Q3");
		int[] letter1={8,12,3,13,1,14,3,4};
		String word ="gehoudfkimjnlvy";
		String detail = "";
		for(int i = 0; i < letter1.length; i++) {
			detail += word.charAt(letter1[i]);
		}
		System.out.println(detail);
		System.out.println("------------------");
		
		// 4.arr 배열에서 0이 의미하는 것은 공터이다. 
		// size는 건물의 크기 이다. 건물은 하나만 짓는다. 공터는 연속적으로 있어야 한다. 
		// size 설정값에 따라 공터에 건물을 지을 수 있는 위치는 모두 몇개인가?
		// size가 2일경우에 7개이다. 
		System.out.println("Q4");
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size=2;
		
		// 5. 숫자는  nextInt(), 문자열을 nextLine() 메서드를 사용한다. 
		// 이때 문자열의 길이는 0보다 크고 10보다 작으며 짝수만 가능하다.
		// 조건에 만족될때까지 문자 입력을 받는다.
		// 문자열을 앞으로 읽으나 뒤로 읽으나 같은 경우의 문자를 판별하는 코드를 작성하세요
//		System.out.println("Q6");
//		Scanner in = new Scanner(System.in);
//		String a  = in.nextLine();
//		String fA = "";
//		String eA = "";
//		if(a.length() > 0 && a.length() < 10) {
//			if(a.length() % 2 == 0) {
//				for(int i = 0; i < a.length()/2; i++) {					
//					fA += a.charAt(i);
//				}
//				for(int i = a.length()-1; i > a.length()/2-1; i--) {					
//					eA += a.charAt(i);
//				}
//				if(fA.equals(eA)) {
//					System.out.println(fA);
//					System.out.println(eA);
//					System.out.println("앞 뒤가 같습니다.");
//				}else {					
//					System.out.println(a);
//				}
//			}
//		}
		// 6.수식을 계산하는 프로그램을 작성하세요.
		// 수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
		// 지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
		// 메서드는 최대한 적게 사용하세요
		// 20240812 -> +,-,*,/ 값을 따로 체크해서 계산하는 방법으로
		System.out.println("Q6");
		String b ="23-56+45*2-56";
		String cal = "";
		int num = 0;
		int sum = 0;
		char sign = ' ';
		for(int i = 0; i < b.length(); i++) {
			if((int)b.charAt(i) >= 48) {
				cal += b.charAt(i);
				System.out.println(cal);
			}else {
				num = Integer.parseInt(cal);
				System.out.println("num" + num);
				sum += (int) sign  + num;
				System.out.println("sign" + sign);
				System.out.println("sum" + sum);
				sign = b.charAt(i);
				cal = "";
				
			}
		}
		sum = sum + sign  + Integer.parseInt(cal);
		System.out.println(sum);
		System.out.println("------------------");
		
		// 7.
		System.out.println("Q7");
		int[]c = {34,2,35,8,31,45};
		if(c[0] < c[1]) c[0] = c[1];
		if(c[1] < c[2]) c[1] = c[2];
		if(c[2] < c[3]) c[2] = c[3];
		if(c[3] < c[4]) c[3] = c[4];
		if(c[4] < c[5]) c[4] = c[5];
		System.out.println(c[5]);
		System.out.println("------------------");
		
		//8. 
		System.out.println("Q8");
		if(c[0] < c[1]) c[0] = c[1];
		if(c[0] < c[2]) c[0] = c[2];
		if(c[0] < c[3]) c[0] = c[3];
		if(c[0] < c[4]) c[0] = c[4];
		if(c[0] < c[5]) c[0] = c[5];
		System.out.println(c[0]);
		System.out.println("------------------");
		
	}

}
