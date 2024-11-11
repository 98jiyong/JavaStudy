package _03Loop;

public class _00_Basic {

	public static void main(String[] args) {
		int[] a = {30,40,50,55,65};
		for(int i=4; i>=0; i--) {
			System.out.println(a[i]);
		}
		System.out.println("------------------------");
		for(int i=0; i<5; i++) {
			System.out.println(a[(i+1)%5]);
		}
		System.out.println("------------------------");
		for(int i=0; i<5; i++) {
			if(a[i] >= 50) {
				System.out.println(a[i]);
			}
		}

		System.out.println("------------------------");
		int cnt = 0;
		for(int i=0; i<5; i++) {
			if(a[i] >= 50) {
				cnt++;
			}
		}
		System.out.println("50점 이상의 개수 : " + cnt);
		System.out.println("------------------------");
		int sum = 0;
		for(int i=0; i<5; i++) {
			if(a[i] >= 50) {
				sum += a[i];
			}
		}
		System.out.println("총점 : " + sum);
		System.out.println("------------------------");
		System.out.println("평균 : " + (double) sum / cnt);
		System.out.println("------------------------");
		int smallestNum = 10000;
		int totalScore = 0;
		for(int i=0; i<5; i++) {
			if(smallestNum > a[i]) {
				smallestNum = a[i];
			}
			totalScore += a[i];
		}
		double average = ((double) totalScore - smallestNum) / ((double) a.length - 1);
		System.out.println("최저점을 제외한 평균 : " + average);
		System.out.println("------------------------");
	}

}
