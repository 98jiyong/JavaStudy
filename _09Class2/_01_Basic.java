package _09Class2;

public class _01_Basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		_01_Basic_one b = new _01_Basic_one();
		System.out.println(b.name);
		b.setName("hong");
		String c = b.getName();
		System.out.println(c);
		System.out.println(b.maskName("***"));
	}

}
