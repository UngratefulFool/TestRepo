import java.util.Scanner;

public class MooseToss implements StupidTextGame {

	@Override
	public void play(Scanner console) {
		System.out.println("You toss the moose and it lands on you.");
		System.out.println("You lose!");
	}

	@Override
	public String getName() {
		return "Moose Toss";
	}

}
