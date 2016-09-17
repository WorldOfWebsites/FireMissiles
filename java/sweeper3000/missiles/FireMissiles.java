package sweeper3000.missiles;
import java.util.Scanner;
public class FireMissiles {
	public void Missiles() {
		Scanner input = new Scanner(System.in);
		System.out.println("DISCLAIMER: This will not actually fire missiles");
		System.out.println("Where should the missiles be sent to?");
		String location = input.nextLine();
		System.out.println("You want missiles sent to " + location +"? Y/N");
		String confirm = input.nextLine();

		switch(confirm) {
			case "Y":
			case "y":
			System.out.println("Contacting computer... SUCCESS");
			System.out.println("Getting location... SUCCESS");
			System.out.println("Missiles launching in 3..2..1");
			System.out.println("Missiles launched");
			System.out.println("Missiles successfully sent to " + location + ".");
			break;
			
			case "N":
			case "n":
			System.out.println("Operation aborted");
			break;

			default:
			System.out.println("Invalid response");
			break;
		}
	}
}
