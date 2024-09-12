package _07twoDimensionalArray;

import java.util.Random;

public class _randomCoffee_ {

	public static void main(String[] args) {
		Random r = new Random();
		String[] coffeeRoulette = {"지용","진호","준곤","율"};
		
		System.out.println(coffeeRoulette[r.nextInt(4)]);

	}

}
