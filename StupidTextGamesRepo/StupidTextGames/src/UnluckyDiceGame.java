import java.util.Random;
import java.util.Scanner;

public class UnluckyDiceGame implements StupidTextGame {

	@Override
	public void play(Scanner console) {
		Random rand = new Random();
		int roll = rand.nextInt(6)+1 ;
		System.out.println("You rolled "+roll);
		if (roll < 3) {
			System.out.println("Too small, you lose!");
		} else {
			System.out.println("Too big, you lose!");
		}
	}

	@Override
	public String getName() {
		return "Unlucky Dice Game";
	}

}
