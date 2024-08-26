package _98Exam;

public class _Q1 {

	public static void main(String[] args) {
		String a = "aabbccddeeeaaaa";
		int cnt = 1;
		char max_char = ' ';
		int max_length = 0;
		for(int i = 0; i < a.length()-1; i++) {
			if(a.charAt(i) == a.charAt(i+1)) {
				cnt ++;
			}else {
				if(cnt > max_length) {
					max_length = cnt;
					max_char = a.charAt(i); 
				}
				cnt = 1;
			}
			if(i+1 == a.length()-1) {
				if(cnt > max_length) {
					max_length = cnt;
					max_char = a.charAt(i); 
				}
			}
		}
		System.out.println("가장 긴 길이를 가진 문자는 " + max_char + "이며 길이는 " + max_length);

	}

}
