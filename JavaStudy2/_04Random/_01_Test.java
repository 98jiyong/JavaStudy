package _04Random;

import java.util.Random;

public class _01_Test {

	public static void main(String[] args) {
		// 6개의 랜덤한 로또번호
		// 로또 번호를 저장할 배열
		int[] lotto = new int[6];
		// 랜덤한 번호를 추출하기 위한 객체 만들기
		Random r = new Random();
		// 랜덤한 번호를 뽑기 위한 반복문
		for (int i = 0; i < lotto.length; i++) {
			int num = r.nextInt(45) + 1;
			lotto[i] = num;
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		

	}

}
