import java.util.Scanner;
/**
 * 
 * @author Daniel Zwiener
 * 
 * To launch the user through a roller coaster of events that will hopefully give them to tools
 * to excel at space age advancement. The user not only has the choice to participate in an
 * occupation, but also has the ability to decline launching his rocket in the pursuit of finding
 * a truer meaning to life. Otherwise perhaps they can find hope on the moon, or at least aliens.
 *
 */
public class toTheMoon implements StupidTextGame{

	private int money;
	@Override
	public void play(Scanner console) {
		money= (int)(Math.random()*1000)+1;
		Scanner input = new Scanner(System.in);
		System.out.println("You have the technology and $" + money);
		System.out.print("Your workers are on strike and won't push the rocket into the sky until they recieve");
		System.out.print("$1,000 USD in Bitcoin\n");
		while(money < 1000) {
			System.out.println("Would you like to work? y or n");
		if(input.nextLine().toLowerCase().equals("y")) {
			money += (Math.random()*100) + 1;
		} else {
			System.out.println("You are lazy, Good day! Game over");
		}
		System.out.println("You have $" + money);
		}
		System.out.println("Your workers are hard at work");
		System.out.println("Would you like to launch your rocket? y or n");
		if(input.nextLine().toLowerCase().equals("y")) {
			if((int)(Math.random()*2)+1 == 1) {
				System.out.println("Your rocket took off. Game Completed");
			} else {
				System.out.println("I lied, you did not have the technology. Game Over");
			}
		} else {
			System.out.println("Being content with life the way it is, is good too. Game neutral");
		}
	}
	

	
	public String getName() {
		return "To the Moon!";
	}

}
