import java.util.Scanner;
class FireMissiles {
	public void Missiles() {
		Scanner input = new Scanner(System.in);
		System.out.println("Who should the missiles be sent to?");
		String person = input.nextLine();
		System.out.println("You want missiles sent to " + person +"? Y/N");
		String confirm = input.nextLine();

		if(confirm.contains("Y") || confirm.contains("y")) {
			System.out.println("Contacting computer... SUCCESS");
			System.out.println("Getting location... SUCCESS");
			System.out.println("Missiles launching in 3..2..1");
			System.out.println("Missiles sucessfully sent to " + person + ".");
		}
		else if(confirm.contains("N") || confirm.contains("n")) {
			System.out.println("Operation aborted.");
		}
		else {
			System.out.println("Invalid response");
		}
	}
	public static void main(String[] args) {
		FireMissiles fire = new FireMissiles();
		fire.Missiles();
	}
}
