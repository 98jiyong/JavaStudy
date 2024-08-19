package _99TestPm;

public class Test08 {

	public static void main(String[] args) {
		// 1
		System.out.println("Q1---------------- ");
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + " ");
			}
			System.out.println();
		}
		System.out.println("Q2---------------- ");
		
		// 2
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q3---------------- ");
		
		// 3
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q4---------------- ");
		
		// 4
		for(int i = 4; i > 0; i--) {
			for(int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("Q5---------------- ");
		
		// 5
		int cnt_a = 0;
		int[] a ={34,55,23,56,34,45,34};
		for(int i = 0; i < a.length; i ++) {
			if(a[i] > 40) {
				cnt_a++;
			}
		}
		System.out.println("40보다 큰 수는 " + cnt_a + "개");
		System.out.println("Q6---------------- ");
		
		// 6
		int[] b ={36,49};
		int cnt_b1 = 0;
		int cnt_b2 = 0;
		int cnt_if = 0;
		for(int i = 0 ; i < b.length; i++) {
			for(int j = 0; j < a.length; j++) {
				if(a[j] > b[i]) {
					cnt_b2++;
				}
			}
			if(cnt_if == 0) {
				cnt_if ++;
				cnt_b1 = cnt_b2;
				cnt_b2 = 0;
			}
		}
		System.out.println("a 배열의 값에는 " + b[0] + "번호 보다 큰 숫자가 " + cnt_b1 + "개 있습니다.");
		System.out.println("a 배열의 값에는 " + b[1] + "번호 보다 큰 숫자가 " + cnt_b2 + "개 있습니다.");
		System.out.println("Q7---------------- ");
		
		// 7
		int money = 4570;
		int pay = 10000;
		int change = pay - money; // 5430
		for(int i = 100000; i > 10; i /= 10) {
			System.out.println((i/10) + "원짜리 " + change % i / (i/10) + "개");
		}
		System.out.println("Q8---------------- ");
		
		// 8
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		int pang_num = 0; // 제거대상 번호
		int pang_cnt = 0; // 제거대상 갯수
		int pang_index = 0; // 제거대상 시작위치 인덱스 
		
		// 11
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 3; i > 0; i--) {
			for(int j = 1; j < 5-i; j++) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2*i-1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
