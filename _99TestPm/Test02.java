package _99TestPm;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문제1
		int[] a = {30,40,50,60,55};
		System.out.println(a[0]+", "+a[1]+", "+a[2]+", "+a[3]+", "+a[4]);
		
		// 문제2
		String[] b = {"kim","lee","park"};
		System.out.println(b[0]+", "+b[1]+", "+b[2]);
		
		// 문제3
		int[] lotto1 = {6,12,33,4,5,26};
		lotto1[2] += 2;	// 33->35
		System.out.println(lotto1[2]);
		
		// 문제4
		int[] lotto2 = {6,12,33,4,5,26};
		System.out.println(lotto2[0]+lotto2[2]+lotto2[4]);
		
		// 문제5
		int[] lotto3= {6,12,33,4,5,26};
		lotto3[0] = lotto3[0];
		lotto3[1] += lotto3[0];
		lotto3[2] += lotto3[1];
		lotto3[3] += lotto3[2];
		lotto3[4] += lotto3[3];
		lotto3[5] += lotto3[4];
		System.out.println(lotto3[0] + "," + lotto3[1] + "," + lotto3[2] + "," + lotto3[3] +
				"," + lotto3[4] + "," + lotto3[5]);
		
		// 문제6
		int[] lotto4= {6,12,33,4,5,26}; 
		System.out.println(lotto4[3] % 2 == 1);
		
		// 문제7
		int money = 2750;
		int pay = 10000;
		int change = pay - money;	//7250
		int thousand = (change % 10000) / 1000;
		int hundred = (change % 1000) / 100;
		int ten = (change % 100) / 10;
		System.out.println("천원 : " + thousand + "개, 백원 : " + hundred + "개, 십원 : " + ten + "개");
		
		// 문제8
		int xA = 700;
		int yA = 500;
		int xB = 900;
		int yB = 300;
		
		int xC = 650;
		int yC = 150;
		// 가변적으로 줄 값
		int x = 0;
		int y = 0;
		
		boolean xValue = (xC + x >= xA) && (xC + x <= xB - 3);
		boolean yValue = (yC + y >= yB + 3) && (yC + y <= yA);
		System.out.println(xValue && true && yValue && true);
	}

}
