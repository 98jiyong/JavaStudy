package _99TestPm;

public class Refactory_Test08 {

	public static void main(String[] args) {
		// 1
		System.out.println("Q1---------------- ");
		for(int i = 1; i < 5; i++) {
			for(int j = 1; j < 4; j++) {
				System.out.print(i + "*" + j + "=" + (i*j) + " ");
			}
			System.out.println();
		}
		
		// 2
		System.out.println("Q2---------------- ");
		for(int i = 5; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 3
		System.out.println("Q3---------------- ");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4+i; j++) {
				if(j >= 3-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 4
		System.out.println("Q4---------------- ");
		for(int i = 3; i >= 0; i--) {
			for(int j = 0; j < 4+i; j++) {
				if(j >= 3-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 5
		System.out.println("Q5---------------- ");
		int cnt_a = 0;
		int[] a ={34,55,23,56,34,45,34};
		for(int i = 0; i < a.length; i ++) {
			if(a[i] > 40) {
				cnt_a++;
			}
		}
		System.out.println("40보다 큰 수는 " + cnt_a + "개");
		
		// 6
		System.out.println("Q6---------------- ");
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
		
		// 7
		System.out.println("Q7---------------- ");
		int money = 4570;
		int pay = 10000;
		int change = pay - money; // 5430
		for(int i = 100000; i > 10; i /= 10) {
			System.out.println((i/10) + "원짜리 " + change % i / (i/10) + "개");
		}
		
		// 8
		System.out.println("Q8---------------- ");
		int[] pang={1,0,0,0,2,3,4,4,6,2,2,2,2,5};
		int cnt_pang = 0;
		int del_pang_digit = 0;
		String del_pang_num = "";
		String del_pang_ea = "";
		String del_pang_index = "";
		for(int i = 0; i < pang.length; i++) {
			del_pang_digit = pang[i];
			for(int j = i; j < pang.length; j++) {
				if(pang[j] != del_pang_digit) {
					break;
				}else {
					cnt_pang++;
				}
			}
			if(cnt_pang >= 3) {
				del_pang_num += del_pang_digit + "번 ";
				del_pang_ea += cnt_pang + "개 ";
				del_pang_index += i + "번 인덱스 ";
			}
			i = i + cnt_pang - 1;
			cnt_pang = 0;
		}
		System.out.println("제거대상 번호 : " + del_pang_num + "\n제거대상 갯수 : " + del_pang_ea + "\n제거대상 시작 인덱스 : " + del_pang_index);
		
		// 9
		System.out.println("Q9---------------- ");  
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		int cnt = 0;
		int max_cnt = 0;
		char max_alphabet = ' '; 
		char temp = ' ';
		for(int i = 0; i < ttt.length(); i++) {
			temp = ttt.charAt(i);
			for(int j = i; j < ttt.length(); j++) {
				if(ttt.charAt(j) != temp) {
					break;
				}else {
					cnt++;
				}
			}
			if(cnt >= max_cnt) {
				max_cnt = cnt;
				max_alphabet = temp;
			}
			i = i + cnt - 1;
			cnt = 0;
			temp = ' ';

		}
		System.out.println(max_alphabet + " / " + max_cnt);
		
		// 10
		System.out.println("Q10---------------- ");
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size = 2; // 건물의 크기
		int sum = 0; // 지을 수 있는 건물의 총 개수
		int tunnel_cnt = 0; // 반복문을 위한 카운트
		for(int i = 0; i < arr.length; i++) {
			for(int j = i; j < arr.length; j++) {
				if(arr[j] != 0) {
					break;
				}else {
					tunnel_cnt++;
				}
			}
			if(tunnel_cnt >= size) {					
				i = i + tunnel_cnt - 1;
				sum += tunnel_cnt - (size - 1);// 건물 누적
				tunnel_cnt = 0; // 배열의 다음을 위한 초기화
			}
		}
		System.out.println("size가 " + size + "일 경우 " + sum + "개");
		
		// 11
		System.out.println("Q11---------------- ");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4+i; j++) {
				if(j >= 3-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i = 2; i >= 0; i--) {
			for(int j = 0; j < 4+i; j++) {
				if(j >= 3-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		// 12
		System.out.println("Q12---------------- ");
		int i = 4;
		int s = 0;
		for(;;) {
			for(int j = 0; j < i; j++) {
				if(j >= 7-i ) {										
					System.out.print("*");
				}else {					
					System.out.print(" ");
				}
			}
			System.out.println();
			if(s == 0) {
				i++;
			}
			if(s == 1) {
				i--;
			}
			if(i == 7) {
				s = 1;
			}
			if(i == 3) {
				break;
			}
		}
	}
}
