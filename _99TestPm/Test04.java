package _99TestPm;

public class Test04 {

	public static void main(String[] args) {
		// Q1

		// Q2

		// Q3

		// Q4
		
		// up1
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) {
				sum += i;
			}else {
				sum -= i;
			}
		}
		System.out.println(sum);
		System.out.println("------------------------");
		// up2
		int oddSum = 0;
		int evenSum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) {
				oddSum += i;
			}else {
				evenSum += i;
			}
		}
		System.out.println(oddSum);
		System.out.println(evenSum);
		System.out.println("------------------------");
		// up3
		int count = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 1) {
				count++;
			}
		}
		System.out.println(count);
		System.out.println("------------------------");
		// up4
		int numStorage = 0;
		for(int i = 100; i < 1000; i++) {
			numStorage += ((i/100) + ((i%100) / 10) + (i%10));
		}
		System.out.println(numStorage);
		System.out.println("------------------------");
		// up5
		String crime = "";
		for(int i = 100; i < 1000; i++) {
			if(((i%100) / 10) % 3 == 0) {
				crime += i + ", " ;
			}
		}
		System.out.println(crime);
		System.out.println("------------------------");
		// up6
		int crimeNum = 0;
		int crimeSum = 0;
		for(int i=0; i<=100; i++) {
			crimeSum += i;
			if(crimeSum < 44) {
				crimeNum = i + 1;
			}
		}
		System.out.println(crimeNum);
		System.out.println("------------------------");
		// up7
		int sum7 = 0;
		String num = "";
		for(int i=1; i<=10; i++) {
			sum7 += i;
			if(i == 10) {
				num += i + "=" + sum7;
			}else {				
				num += i + "+";
			}
		}
		System.out.println(num);
		System.out.println("------------------------");
		// up8
		int fib=1;
		int a = 0;
		int b = 0;
		int sum8 = 0;
		for(int i=1; i<8; i++) {
			b = fib + a;
			sum8 += b;
			fib = a;
			a = b;		
		}
		System.out.println(sum8);
		System.out.println("------------------------");
		// up9
		// 20240808_미완성
		int sum9 = 0;
		int c = 0;
		int d = 0;
		for(int i=1; i<20; i+=2) {
			
		}
		System.out.println(sum9);
		System.out.println("------------------------");
		// up10
		int sum10 = 0;
		for(int i=1000000000; i>1; i/=10) {
			sum10 += (987654321 % i) / (i/10);
		}
		System.out.println(sum10);
		
	}

}
