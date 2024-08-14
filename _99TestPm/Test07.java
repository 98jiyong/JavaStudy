package _99TestPm;

import java.util.Random;
import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// 0.
		System.out.println("Q0---------------------");
		Scanner in = new Scanner(System.in);
		System.out.println("숫자 한 개를 입력해주세요.");
		int k = in.nextInt();
		in.nextLine();
		if(k % 2 == 1) {
			System.out.println(k+"은/는 홀수입니다.");
		}else {
			System.out.println(k+"은/는 짝수입니다.");
		}
		System.out.println("Q1---------------------");
		
		// 1.
		int sum1 = 0;
		System.out.println("첫번째 숫자를 입력해주세요.");
		int f_int = in.nextInt();
		in.nextLine();
		System.out.println("두번째 숫자를 입력해주세요.");
		int s_int = in.nextInt();
		in.nextLine();
		sum1 =f_int + s_int;
		System.out.println("두 수의 합은 " + sum1 + "입니다.");
		System.out.println("Q2---------------------");
		
		// 2.
		Random r = new Random();
		// 1부터 100 사이에서 무작위 수를 추출하는 변수 생성
		int l = r.nextInt(100) + 1;
		if(l % 7 == 0) {
			System.out.println(l + "은/는 행운의 숫자.");
		}else {
			System.out.println(l + "은/는 조심해야 하는 숫자.");
		}
		System.out.println("Q3---------------------");
		
		// 3.
		for(;true;) {
			int m = r.nextInt(100) + 1;
			if(m % 7 == 0) {
				System.out.println(m + "은/는 행운의 숫자.");
				break;
			}else {
				System.out.println("현재 숫자 : " + m);
				System.out.println("다시 뽑으시오.");
			}
		}
		System.out.println("Q4---------------------");
		
		// 4.
		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			int n = r.nextInt(100);
			System.out.println(i+"번째 값은 " + n);
			if(n % 2 == 0) {
				arr1[i] = n;
				System.out.println(n+"은/는 짝수이므로 " + i + "번째 값에 저장");
			}else {
				System.out.println(n+"은/는 홀수이므로 " + i + "번째 값은 무시");
				continue;
			}
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println("Q5---------------------");
		// 5.
	}

}
