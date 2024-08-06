package _00Variable;

public class Test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		char b='c';
		double c=20;
		String d="apple";
		System.out.println(a+10);
		System.out.println(b+10);
		System.out.println(c+10);
		System.out.println(d+10);
		c=a+10/2;
		System.out.println(c);
		int k  = a+a/4;
		System.out.println(k);
		int cc = a;
		a=a/3+2;
		cc=cc+a;
		a=10;
		System.out.println(cc);
		System.out.println(a==10);
		System.out.println(a!=10);
		System.out.println(a=a+1);
		System.out.println(a==10);
		// 위 두 줄의 코드를 다음과 같이 하나로 줄일 수 있다.
		System.out.println((a=a+1)==10);
	}

}
