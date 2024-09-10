package _99TestPm;

public class Test03 {

	public static void main(String[] args) {
		// Q1
		double avg = 89.2;
		if(avg >= 80) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		// Q2
		int level = 2;
		int point = 30;
		if(level == 1) {
			point += 30;
		}else {
			point += 10;
		}
		System.out.println("최종 포인트 : " + point);
		
		// Q3
		int[] lotto1 = {6,12,33,4,5,26};
		lotto1[2] += 80;
		
		// Q4
		int[] lotto2 = {6,12,33,4,5,26};
		if(lotto2[3] % 2 == 1) {
			System.out.println("홀수");
		}else {
			System.out.println("짝수");
		}
		
		// Q5
		int[] lotto3 = {6,12,33,4,5,26};
		int sum = 0;
		
		if(lotto3[0] % 2 == 1) {
			sum += lotto3[0];
		}
		if(lotto3[1] % 2 == 1) {
			sum += lotto3[1];
		}
		if(lotto3[2] % 2 == 1) {
			sum += lotto3[2];
		}
		if(lotto3[3] % 2 == 1) {
			sum += lotto3[3];
		}
		if(lotto3[4] % 2 == 1) {
			sum += lotto3[4];
		}
		if(lotto3[5] % 2 == 1) {
			sum += lotto3[5];
		}
		System.out.println(sum);
		
		// Q6
		int[] a = {45,34,64,45,24};
		System.out.println(a[0] + a[1] + a[2] + a[3] + a[4]); 
		
		// Q7
		int[] b = {45,34,64};
		String result = "";
		
		if((b[0]/10) + (b[0] % 10) > (b[1]/10) + (b[1] % 10) &&
				(b[0]/10) + (b[0] % 10) > (b[2]/10) + (b[2] % 10)){
			result = "철수가 선택한 숫자는 0번째 숫자입니다.";			
		}else if((b[1]/10) + (b[1] % 10) > (b[2]/10) + (b[2] % 10)){
			result = "철수가 선택한 숫자는 1번째 숫자입니다.";
		}else {
			result = "철수가 선택한 숫자는 2번째 숫자입니다.";
		}
		System.out.println(result);
				
		// Q8
		int[] x = {6,5,9};
		int[] y = {4,10,6};
		
		String hit = "";
		
		if(((double) y[0] / (double) x[0]) == 2.0 / 3.0) {
			hit += "0번 새 ";
		}
		if(((double) y[1] / (double) x[1]) == 2.0 / 3.0) {
			hit += "1번 새 ";
		}
		if(((double) y[2] / (double) x[2]) == 2.0 / 3.0) {
			hit += "2번 새 ";
		}
		System.out.println("총알에 맞은 새의 번호는 : " + hit);
		

	}

}
