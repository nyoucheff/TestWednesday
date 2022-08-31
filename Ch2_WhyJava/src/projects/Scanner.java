package projects;
import java.util.Scanner;

public class Scanner {
	

		Scanner reader = new Scanner ();
		double mass;
		double velocity;
		double momentum;

		System.out.print("")
		mass = reader.nextDouble();
		System.out.print("Enter velocity: ");
		velocity = reader.nextDouble();

		momentum= mass * velocity;
		System.out.print(“The  is:”);
		System.out.println(momentum);






	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
