import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StupidTextGameLauncher {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		List<StupidTextGame> games = new ArrayList<>();
		games.add(new MooseToss());
		games.add(new UnluckyDiceGame());
		games.add(new toTheMoon());
		
		System.out.println("What stupid game would you like to play?");
		for (int i = 0; i < games.size(); i++) {
			System.out.println((i+1) + ": " + games.get(i).getName());
		}
		int choice = console.nextInt();
		StupidTextGame chosenGame = games.get(choice-1);
		chosenGame.play(console);

	}

}
