package _07twoDimensionalArray;

import java.util.Random;

public class _randomCoffee_ {

	public static void main(String[] args) {
		Random r = new Random();
		int[] coffeeVote = new int[4];
		int maxVote = 0;
		int maxVoteIndex = 0;
		String[] coffeeRoulette = {"지용","진호","준곤","율"};
		for(int i=0; i<100; i++) {
			coffeeVote[r.nextInt(4)]++;
		}
		for(int i=0; i<coffeeVote.length; i++) {
			if(coffeeVote[i]>maxVote) {
				maxVote = coffeeVote[i];
				maxVoteIndex = i;
			}
		}
		
		System.out.println("가장많은 투표를 받은 사람은? " + coffeeRoulette[maxVoteIndex] +
		" / 득표수 : "+ maxVote);
		System.out.println("지용 : " + coffeeVote[0]+ " 진호 : " + coffeeVote[1] +
				" 준곤 : "+ coffeeVote[2]+ " 율 : "+coffeeVote[3]);
		
		
//		System.out.println(coffeeRoulette[r.nextInt(4)]);

	}

}
