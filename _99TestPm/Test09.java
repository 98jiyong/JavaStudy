	package _99TestPm;

import java.util.Arrays;
import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// 1
		System.out.println("Q1---------------- ");
		int[] arr1 = {3,45,26,50,74};
		int a = 5;
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] % a == 0) {
				System.out.println(arr1[i]);
			}
		}
		
		// 2
		System.out.println("Q2---------------- ");
		int[] arr2 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
		double avg = 0;
		for(int i = 0; i < arr2.length; i++) {
			avg += arr2[i];
		}
		System.out.println(avg /= arr2.length);
		
		// 3
		String factorial = "";
		String fact_proc = "";
		int fact = 1;
		System.out.println("Q3---------------- ");
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= i; j++) {
				fact *= j; 
				// 마지막에 *을 없애기 위한 조건문 
				if(j == i) {
					fact_proc += j;
				}else {					
					fact_proc += j + "*";
				}
			}
			factorial += i + "의 팩토리얼은 "+ fact_proc +" 값은 " + fact + "\n";
			fact = 1;
			fact_proc = "";
		}
		System.out.println(factorial);
		
		// 4
		System.out.println("Q4---------------- ");
		int[] b = {93,45,83,58,75,56};
		int rep = 0;
		int x = 0;
		int max_num = 0;
		int max_index = 0;
		for(int i = 0; i < b.length - x; i++) {
			if(b[i] > max_num) {
				max_num = b[i];
				max_index = i;
			}
//			System.out.println(max_num + " " + max_index);
			if(i == b.length - (x+1)) {
				rep = b[max_index];
				b[max_index] = b[i];
				b[i] = rep;
				x++;
				max_num = 0;
				i = -1;
//				System.out.println(Arrays.toString(b));
			}
		}
		System.out.println(Arrays.toString(b));
		
		// 5
		System.out.println("Q5---------------- ");
		int[] carnum = {1232,1221,1235,1252,1234,4536,3457,3238,3229,2599};
		int[] parking = new int[10]; // {0,0,0,0,0,0,0,0,0,0}
//		System.out.println(carnum[0] % 10);
//		System.out.println(Arrays.toString(parking));
		for(int i = 0; i < carnum.length; i++) {
			for(int j = 0; j < parking.length; j++) {
				if(carnum[i] % 10 == j) {
					if(parking[j] == 0) {
						parking[j] = carnum[i];
					}else {
						if(j != parking. length - 1) {							
							if(parking[j+1] == 0 ) {
								parking[j+1] = carnum[i];
							}else {							
								System.out.println(carnum[i] + "는 주차 불가합니다.");
							}
						}else {
							System.out.println(carnum[i] + "는 주차 불가합니다.");
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(parking));
		
		// 6
		System.out.println("Q6---------------- ");
		Scanner in = new Scanner(System.in);
		int cnt_id1 = 0;
		System.out.println("ID를 입력해주세요.");
		String id1 = in.nextLine();
		for(int i = 0; i < id1.length(); i++) {
			if(id1.charAt(i) == '@') {
				cnt_id1++;
			}
		}
		System.out.println(id1 + "에는 특수문자 '@'가 " + cnt_id1 + "개 있습니다.");
		
		// 7
		System.out.println("Q7---------------- ");
		String sign="!@#$%^&*";
		System.out.println("ID를 입력해주세요.");
		String id2 = in.nextLine();
		int cnt_id2 = 0;
		for(int i = 0; i < sign.length(); i++) {
			for(int j = 0; j < id2.length(); j++) {
				if(id2.charAt(j) == sign.charAt(i)) {
					cnt_id2++;
				}
			}
		}
		System.out.println(id2 + "에는 특수문자가 " + cnt_id2 + "개 있습니다.");
	}

}
