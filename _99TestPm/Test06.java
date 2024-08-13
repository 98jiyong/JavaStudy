package _99TestPm;

import java.util.Random;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// 우럭조 
		// 0.
		System.out.println("Q0");
		int[] letter = {8,12,4,13,2,14,4,5};
		for(int i = 0; i < letter.length; i ++) {
			if(letter[i] % 2 == 0) {				
				System.out.print(letter[i] + " ");
			}
		}
		System.out.println();
		System.out.println("------------------");
		
		// 1.
		System.out.println("Q1");
		int bigNum = 0;
		int bigIndex = 0;
		for(int i = 0; i < letter.length; i ++) {
			if(letter[i] > bigNum) {			
				bigNum = letter[i];
				bigIndex = i;
			}
		}
		System.out.println(bigIndex);
		System.out.println("------------------");
		
		// 2.
		System.out.println("Q2");
		for(int i = 0; i < letter.length; i ++) {
			if(letter[i] % 2 == 0 && letter[i] > bigNum) {				
				bigNum = letter[i];
			}
		}
		System.out.println(bigNum);
		System.out.println("------------------");
		
		// 3.
		System.out.println("Q3");
		int[] letter1={8,12,3,13,1,14,3,4};
		String word ="gehoudfkimjnlvy";
		String detail = "";
		for(int i = 0; i < letter1.length; i++) {
			detail += word.charAt(letter1[i]);
		}
		System.out.println(detail);
		System.out.println("------------------");
		
		// 4.
		System.out.println("Q4");
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int cnt = 0;
		int result = 0;
		int size=2;
		for(int i = 0; i < arr.length-1; i++) {
			if(arr[i] == arr[i+1]) {
				cnt++;
				if(cnt / size != 0) {
					result ++;
				}
			}else {
				cnt = 0;
			}
		}
		System.out.println(result);
		System.out.println("------------------");
		
		// 5.
		System.out.println("Q5");
		Scanner in = new Scanner(System.in);
		String a  = in.nextLine();
		String fA = "";
		String eA = "";
		if(a.length() > 0 && a.length() < 10 && a.length() % 2 == 0) {
			for(int i = 0; i < a.length()/2; i++) {					
				fA += a.charAt(i);
			}
			for(int i = a.length()-1; i > a.length()/2-1; i--) {					
				eA += a.charAt(i);
			}
			if(fA.equals(eA)) {
				System.out.println("앞 뒤가 같습니다.");
			}else {					
				System.out.println(a);
			}
		}
		System.out.println("------------------");
		
		// 6.
		System.out.println("Q6");
		String b ="23-56+45*2-56";
		String pre_num = "";
		int cnt_num = 0;
		int sum = 0;
		char sign = ' ';
		for(int i = 0; i < b.length(); i++) {
			if(b.charAt(i) == '+' || b.charAt(i) == '-' || b.charAt(i) == '*' || b.charAt(i) == '/') {
				// 처음 값을 저장하기 위한 조건문 
				if(cnt_num == 0) {
					cnt_num++;
					sum = Integer.parseInt(pre_num);
					sign = b.charAt(i);
					pre_num = "";
				}
				else {
					if(sign == '+') {
						sum += Integer.parseInt(pre_num);
						sign = b.charAt(i);
						pre_num = "";
					}else if(sign == '-') {
						sum -= Integer.parseInt(pre_num);
						sign = b.charAt(i);
						pre_num = "";
					}else if(sign == '*') {
						sum *= Integer.parseInt(pre_num);
						sign = b.charAt(i);
						pre_num = "";
					}else if(sign == '/') {
						sum /= Integer.parseInt(pre_num);
						sign = b.charAt(i);
						pre_num = "";
					}
				}
			}else {
				pre_num += b.charAt(i);
			}
		}
		// 마지막 값을 연산하기 위한 조건문
		if(sign == '+') sum += Integer.parseInt(pre_num);
		else if(sign == '-') sum -= Integer.parseInt(pre_num);
		else if(sign == '*') sum *= Integer.parseInt(pre_num);
		else if(sign == '/') sum /= Integer.parseInt(pre_num);
			
		System.out.println(sum);
		System.out.println("------------------");
		
		// 7.
		System.out.println("Q7");
		int[]c = {34,2,35,8,31,45};
		int replace_a = 0;
		for(int i = 0; i < c.length-1; i++) {
			if(c[i] > c[i+1]) {
				replace_a = c[i];
				c[i] = c[i+1];
				c[i+1] = replace_a;
			}
		}
		for(int i = 0; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		System.out.println("\n" + c[5]);
		System.out.println("------------------");
		
		// 8.
		System.out.println("Q8");
		int[]p = {34,2,35,8,31,45};
		int replace_b = 0;
		for(int i = 1; i < p.length; i++) {
			if(p[0] < p[i]) {
				replace_b = p[i];
				p[i] = p[0];
				p[0] = replace_b;

			}			
		}
		for(int i = 0; i < p.length; i++) {
			System.out.print(p[i] + " ");
		}
		System.out.println();
		System.out.println(p[0]);
		System.out.println("------------------");
		
		// 9.
		System.out.println("Q9");
		Random r = new Random();  
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			int num = r.nextInt(45)+1;
			lotto[i] = num;
			System.out.print(lotto[i] + " ");
		}
		
		System.out.println("\n------------------");
		
		// 10. -> 못품
		System.out.println("Q10");
		System.out.println("\n------------------");
		
		// 11.
		System.out.println("Q11");
		// 컴퓨터 랜덤 가위바위보 값 생성
		int comp_rsp = r.nextInt(3)+1;
		int result_rsp = 0;
		// 입력값으로 가위바위보 받기
		System.out.println("가위 : 1, 바위 : 2, 보 : 3");
		String human_rsp = in.nextLine();
		// 가위바위보 계산
		result_rsp = comp_rsp - Integer.parseInt(human_rsp);
		// 조건에 따른 결과문 출력
		if(result_rsp == 0) System.out.println("Draw!\n" + "Human : " + human_rsp + "computer : " + comp_rsp);
		else if(result_rsp == -1) System.out.println("Human Win!\n" + "Human : " + human_rsp + "computer : " + comp_rsp);
		else if(result_rsp == 2) System.out.println("Human Win!\n" + "Human : " + human_rsp + "computer : " + comp_rsp);
		else if(result_rsp == 1) System.out.println("Computer Win!\n" + "Human : " + human_rsp + "computer : " + comp_rsp);
		else if(result_rsp == -2) System.out.println("Computer Win!\n" + "Human : " + human_rsp + "computer : " + comp_rsp);
		
		System.out.println("------------------");
		
		// 12. - 못품
		System.out.println("Q12");
//		int[] lotto_storage = new int[10000];
//		for(int i=0; i < lotto_storage.length; i++) {
//			for(int j = 0; j < lotto.length; j++) {
//				int num = r.nextInt(45)+1;
//				lotto[j] = num;
//			}
//		}
		System.out.println("\n------------------");
		// 특별1.
		System.out.println("Q특별1");
		String d = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		int[] e = new int[10];
		char f = ' ';
		int g = 0;
		for(int i = 0; i < d.length(); i++) {			
			if(d.charAt(i) != '/') {
				e[d.charAt(i)-'0']++;
			}
		}
		// 결과
		for(int i=0; i<e.length; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i=0; i<e.length; i++) {
			System.out.print(e[i] + " ");
		}
		System.out.println("\n------------------");
		
		// 특별2.
		System.out.println("Q특별2");
		String h ="67/414/1/23/32/45/54/12/11/232";
		String j = "";
		int totalBug = 0;
		for(int i = 0; i < h.length(); i++) {
			if(h.charAt(i) != '/') {
				j += h.charAt(i);
			}else {
				totalBug += Integer.parseInt(j);
				j = "";
			}
		}
		totalBug += Integer.parseInt(j);
		System.out.println(totalBug);
		System.out.println("------------------");
	}
}

