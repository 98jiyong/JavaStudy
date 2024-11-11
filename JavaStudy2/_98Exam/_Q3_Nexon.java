package _98Exam;


public class _Q3_Nexon {

	public static void main(String[] args) {
		int[] gen = new int[5000];
		int[] num = new int[5000];
		int[] jmt = new int[5031];
		int sum = 0;
		int result = 0;
		for(int i = 1; i <= 5000; i++) {
			sum = i + i / 1000 + i % 1000 / 100 + i % 100 / 10 + i % 10;
			jmt[sum] = 1;
		}
		for(int i=0; i<jmt.length; i++) {
			if(jmt[i] == 0) {
				result += i;
			}
		}
//		for(int i = 1; i <= 5000; i++) {
//			sum = i + i / 1000 + i % 1000 / 100 + i % 100 / 10 + i % 10;
//			gen[i-1] = sum;
//		}
//		for(int i =1; i<= 5000; i++) {
//			num[i-1] = i;
//		}
//		for(int i =0; i<gen.length; i++) {
//			int j = 0;
//			while(j < 5000) {
//				if(num[i] != gen[j]) {
//					j++;
//				}else {
//					break;
//				}
//				if(j == 4999) {
//					result += num[i];
//					break;
//				}
//			}
//		}
		System.out.println(result);
	}

}
