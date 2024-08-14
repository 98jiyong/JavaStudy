package _99TestPm;

import java.util.Arrays;
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
		for(;;) {
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
		System.out.println(Arrays.toString(arr1));
		System.out.println("\nQ5---------------------");
		
		// 5. 
		int[] lotto1 = new int[6];
		// 랜덤한 번호를 뽑기 위한 반복문
		for (int i = 0; i < lotto1.length; i++) {
			lotto1[i] = r.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(lotto1));
		System.out.println("\nQ6---------------------");		
		
		// 6.
		int[] arr2 = new int[45];
		int maxCount = 0;
		int maxLotto = 0;
		for (int i = 0; i < 10000; i++) {
			arr2[r.nextInt(45)]++;
		}
		System.out.println(Arrays.toString(arr2));
		for (int i = 0; i < arr2.length; i++) {
			if(arr2[i] >= maxCount) {
				maxCount = arr2[i];
				maxLotto = i;
			}
		}
		System.out.println("오늘의 추천 로또 번호 : " + (maxLotto + 1));
		System.out.println("Q7---------------------");
		
		// 7.
		int[] jobTime = {40,32,4,16,5,8};
		int workTime = 4;
		int index = 0;
		int maxNum = 0;
		int maxIndex = 0;
		// 배열 중 가장 큰 값의 인덱스 찾기
		for(int i = 0; i < jobTime.length; i++) {
			if(jobTime[i] > maxNum) {
				maxNum = jobTime[i];
				maxIndex = i;
			}
		}
		for(;;) {
			if(jobTime[index % 6] <= 0) {
			}else {
				jobTime[index % 6] -= workTime;
				System.out.println((index % 6) + "번째 사람 작업장 사용");
			}
			index++;
			if(jobTime[maxIndex] <= 0) {
				break;
			}
		}
		System.out.println("Q8---------------------");
				
		// 8.
		int[] lotto = new int[6];
		// 키보드로 부터 입력받기 위한 객체 만들기.
		// 0번째 번호부터 로또 번호 입력받기
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i + 1) + "번 입력하세요");
			int o = in.nextInt();  // nextInt는 키보드로 숫자만 가져온다.
			in.nextLine();  // 버퍼 지우기
			if(o > 45 || o < 1) {
				System.out.println("범위 오류");
				i--;
			}else {				
				lotto[i] = o;
			}
		}
		// 로또 번호를 출력하는 반복문
		for (int i = 0; i < lotto.length; i++) {
			if (i == lotto.length - 1) { // 마지막 번호
				System.out.println("보너스 : " + lotto[i]);
			} else {
				System.out.println(lotto[i]);
			}
		}

	}

}
