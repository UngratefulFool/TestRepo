import java.util.Scanner;

public interface StupidTextGame {
	
	/**
	 * This is what actually plays the stupid game
	 * @param console - allows user input
	 */
	public void play(Scanner console);
	
	/** 
	 * @return the name of the game
	 */
	public String getName();

}
