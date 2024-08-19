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
		int cnt_pang = 1;  // 초기값을 1로 지정
		String pang_s = ""; // 제거할 부분을 담을 문자열
		int pang_cal = 0;  // 제거할 번호
		String pang_num = "";// 제거대상 번호
		String pang_ea = ""; // 제거대상 갯수
		String pang_index = ""; // 제거대상 시작위치 인덱스 
		// 단일 반복문으로 작성 시
//		for(int i = 0; i < pang.length-1; i++) {
//			if(pang[i] == pang[i+1]) {
//				cnt_pang++;
//			}else {
//				if(cnt_pang >= 3) {
//					pang_num += pang[i] + " ";
//					pang_ea += cnt_pang + " ";
//					pang_index += (i - (cnt_pang - 1)) + " ";
//				}
//				cnt_pang = 1;
//			}
//		}
//		System.out.println("제거대상 번호 : " + pang_num + "\n제거대상 갯수 : " + pang_ea + "\n제거대상 시작 인덱스 : " + pang_index);
		
		// 중첩 반복문으로 작성 시
		for(int i = 0; i < pang.length-1; i++) {
			if(pang[i] == pang[i+1]) {
				pang_cal = pang[i];
				cnt_pang++;
				pang_s = ""; // 마지막 값만 저장하기 위한 초기화
				for(int j = 0; j < cnt_pang; j++) {
					pang_s += pang_cal;
//						System.out.println(pang_s);
				}
			}else {
				if(pang_s.length() >= 3) {	
					// 제거할 부분 만들기
					pang_num += pang_cal + " ";
					pang_ea += pang_s.length() + " ";
					pang_index += i-(pang_s.length() -1 ) + " ";
				}
				// 다음 제거할 문자열을 위한 초기화
				pang_s = "";
				cnt_pang = 1;
			}
		}
		System.out.println("제거대상 번호 : " + pang_num + "\n제거대상 갯수 : " + pang_ea + "\n제거대상 시작 인덱스 : " + pang_index);
		System.out.println("Q9---------------- ");
		
		// 9
		String ttt ="aabbbcccaaaaddbbbaaaaa";
		char ttt_ac = ' '; // 알파벳을 담을 문자
		String ttt_as = ""; // 알파벳들을 담을 문자열
		char max_alphabet = ' '; // 가장 긴 터널의 알파벳
		int max_length = 0; // 가장 긴 터널의 길이
		int ttt_cnt = 1; // 반복문을 위한 카운트
		for(int i = 0; i < ttt.length()-1; i++) {
			if(ttt.charAt(i) == ttt.charAt(i+1)) {
				ttt_ac = ttt.charAt(i);
				ttt_cnt++;
			}else {
				for(int j = 0; j < ttt_cnt; j++) {
					ttt_as += ttt_ac;
				}
//				System.out.println(ttt_as);
				if(ttt_as.length() > max_length) {
					max_length = ttt_as.length();
					max_alphabet = ttt_ac;
				}
				ttt_as = "";
				ttt_cnt = 1;
			}
		}
		// 마지막에는 비교할 수 없으므로 한번 더 반복
		for(int j = 0; j < ttt_cnt; j++) {
			ttt_as += ttt_ac;
		}
		if(ttt_as.length() > max_length) {
			max_length = ttt_as.length();
			max_alphabet = ttt_ac;
		}
		System.out.println("가장 긴 터널의 알파벳 : " + max_alphabet);
		System.out.println("가장 긴 터널의 길이 : " + max_length);
		System.out.println("Q10---------------- ");
		
		// 10
		int[] arr = {1,0,0,0,1,1,1,0,0,0,0,1,1,1,1,0,0,0,1};
		int size = 2; // 건물의 크기
		int num = 0; // 지을 수 있는 건물의 수
		int sum = 0; // 지을 수 있는 건물의 총 개수
		int cnt = 0; // 반복문을 위한 카운트
		String park = "";
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				cnt++;
			}else {
				if(cnt >= size) {
					for(int j = 0; j < cnt; j++) {
						park += "0";
					}					
					num = park.length() - (size - 1); // 사이즈 변경 시
					sum += num; // 건물 누적
					cnt = 0; // 배열의 다음을 위한 초기화
					park = ""; // 배열의 다음을 위한 초기화
				}
			}
		}
		System.out.println("size가 " + size + "일 경우 " + sum + "개");
		System.out.println("Q11---------------- ");
		
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
		System.out.println("Q12---------------- ");
		
		// 12
		ttt_ac = ' ';
		ttt_as = "";
		max_alphabet = ' ';
		max_length = 0;
		ttt_cnt = 1;
		for(int i = 0; i < ttt.length()-1; i++) {
			if(ttt.charAt(i) == ttt.charAt(i+1)) {
				ttt_ac = ttt.charAt(i);
				ttt_cnt++;
				ttt_as = ""; // 반복문의 마지막 값만 얻어오기 위한 초기화
				for(int j = 0; j < ttt_cnt; j++) {
					ttt_as += ttt_ac;
				}
//				System.out.println(ttt_as);
			}else {
//				System.out.println(ttt_as);
				if(ttt_as.length() > max_length) {
					max_length = ttt_as.length();
					max_alphabet = ttt_ac;
				}
				ttt_as = "";
				ttt_cnt = 1;
			}
		}
		if(ttt_as.length() > max_length) {
			max_length = ttt_as.length();
			max_alphabet = ttt_ac;
		}
		System.out.println("가장 긴 터널의 알파벳 : " + max_alphabet);
		System.out.println("가장 긴 터널의 길이 : " + max_length);
		
		// bonus
		int i = 1;
		int s = 0;
		for(;;) {
			for(int j = 0; j < i*2-1; j++) {
				if(j == 0) {					
					if(i == 1) {
						System.out.print("   ");
					}else if(i == 2) {
						System.out.print("  ");
					}else if(i == 3) {
						System.out.print(" ");
					}
				}
				System.out.print("*");
			}
			System.out.println();
			if(s == 0) {
				i++;
			}
			if(s == 1) {
				i--;
			}
			if(i == 4) {
				s = 1;
			}
			if(i == 0) {
				break;
			}
		}
	}
	
}
