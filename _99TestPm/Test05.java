package _99TestPm;

public class Test05 {

	public static void main(String[] args) {
		System.out.println("Q1---------------");
		// 1. 100부터 999까지의 숫자중에서 홀수만 출력하시오.
		for(int i=100; i<1000; i++) {
			if(i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Q2---------------");
		// 2. 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		int oddSum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) {
				oddSum += i;
			}
		}
		System.out.println(oddSum);
		System.out.println("Q3---------------");
		// 3. 다음과 같이 출력하시오   10  9  8  7  6  5  4  3  2  1
		for(int i=10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("Q4---------------");
		// 4. 배열에서 배열의 값이 짝수인 것만 출력하시오.
		int[] arr = {45,23,25,64,3,24,48};
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
			System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
		System.out.println("Q5---------------");
		// 5.배열에서 배열의 값이 홀수 인 곳의 인덱스만 출력하시오.
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 1) {
			System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("Q6---------------");
		// 6.배열의 값을 모두 더한 총합을 구하시오.
		int arrSum = 0;
		for (int i = 0; i < arr.length; i++) {
			arrSum += arr[i];
		}
		System.out.println(arrSum);
		System.out.println("Q7---------------");
		// 7.짝수는 모두 몇개인가요?
		int evenCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenCount++;
			}
		}
		System.out.println(evenCount);
		System.out.println("Q8---------------");
		// 8.위 코드를 분석하여 test문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요.
		String test = "abcdeabce";
		int charCount = 0;
	    for(int i=0; i < 9; i ++){
	    	char aaa = test.charAt(i);
	    	if(aaa == 'a') {
	    		charCount++;
	    	}
	    }
	    System.out.println(charCount);
	    System.out.println("Q9---------------");
	    // 9.배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
	    int biggestNum = 0;
	    int biggestIndex = 0;
	    for (int i = 0; i < arr.length; i++) {
	    	if(arr[i] > biggestNum) {
	    		biggestNum = arr[i];
	    		biggestIndex = i;
	    	}
	    }
	    System.out.println("큰 값 : " + biggestNum + ", 인덱스 : " + biggestIndex);
	    System.out.println("Q10---------------");
	    // 10.범인 숫자 구하기.. 
	    // 범인은 100부터 999까지 숫자중에 여러명이다. 
	    // 범인의 특징은 숫자의 각자릿수를 더한 값이 짝수이다.  범인의 숫자를 모두 찾으시오.
	    int crimeNum = 0;
	    for(int i=100; i<1000; i++) {
	    	crimeNum = (i%10) + ((i/10)%10) + (i/100);
	    	if(crimeNum % 2 == 0) {
	    		System.out.print(i + "  ");
	    	}
	    }
		System.out.println();
		System.out.println("Q11---------------");
		// 11.int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,2,0,0,0,0,0,3,3}
		// 0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		int[] tunnel1 = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int a1 = 0;
		int b1 = 0;
		int tunnelCount1 = 0;
		int longestTunnel1 = 0;
		for (int i = 0; i < tunnel1.length; i++) {
			a1 = tunnel1[i];
			if(b1 == a1) {
				tunnelCount1 ++;
				if(tunnelCount1 > longestTunnel1) {
					longestTunnel1 = tunnelCount1;
				}
			}else {
				if(tunnelCount1 > longestTunnel1) {
					longestTunnel1 = tunnelCount1;
				}
				tunnelCount1 = 0;
			}
			b1 = tunnel1[i];
		}
		System.out.println(longestTunnel1 + 1);
		System.out.println("Q12---------------");
	    // 12.숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.   
		int[] tunnel2 = {1,2,3,0,0,0,1,2,2,4,2,2,2,2,2,2,2,0,0,0,0,0,3,3};
		int a2 = 0;
		int b2 = 0;
		int tunnelNum = 0;
		int tunnelCount2 = 0;
		int longestTunnel2 = 0;
		for (int i = 0; i < tunnel2.length; i++) {
			a2 = tunnel2[i];
			if(b2 == a2) {
				tunnelCount2 ++;
				if(tunnelCount2 > longestTunnel2) {
					longestTunnel2 = tunnelCount2;
					tunnelNum = tunnel2[i];
				}
			}else {
				if(tunnelCount2 > longestTunnel2) {
					longestTunnel2 = tunnelCount2;
					tunnelNum = tunnel2[i];
				}
				tunnelCount2 = 0;
			}
			b2 = tunnel2[i];
		}
		System.out.println("가장 긴 터널의 숫자 : " + tunnelNum + ",길이 :  "+ (longestTunnel2 + 1));
		System.out.println("Q13---------------");
		// 13.가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
		String ttt = "aabbbcccaaaaddbbbaaaaa";
		int biggestChar = 0;
		int numCount = 0;
		char longChar = ' ';
		char x = ' ';
		char y = ' ';
		for(int i=1; i< ttt.length(); i++) {
			x = ttt.charAt(i);
			y = ttt.charAt(i-1);
			if(y == x) {
				numCount ++;
				if(numCount > biggestChar) {
					biggestChar = numCount;
					longChar = ttt.charAt(i);
				}
			}else {
				if(numCount > biggestChar) {
					biggestChar = numCount;
					longChar = ttt.charAt(i);
				}
				numCount = 0;
			}
		}
		System.out.println("알파벳 이름 : " + longChar + ", 개수 : " + (biggestChar + 1));
		System.out.println("Q14---------------");
		// 14.압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
		String tttt ="aabbbcccaaaaddbbbaaaaa";
		char q = ' ';
		char w = ' ';
		char e = ' ';
		int cnt = 0;
		int bigNum = 0;
		String result = "";
		for(int i=1; i < tttt.length(); i++) {
			w = tttt.charAt(i);
			e = tttt.charAt(i-1);
			if(w == e) {
				q = w;
				cnt ++;
				if(cnt > bigNum) {
					bigNum = cnt;
				}
			}else {
				result += q + "" + (cnt + 1) + " ";
				cnt = 0;
			}
			if(i == tttt.length()-1) {
				result += q + "" + (cnt + 1);
			}
		}
		System.out.println(result);
	}
}
