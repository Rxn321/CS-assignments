
import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1	
		
		Scanner diceSides = new Scanner(System.in);
		System.out.println("How many sides do these dice have?:");
		int sides = diceSides.nextInt();		
		
		Scanner diceRolls = new Scanner(System.in);
		System.out.println("How many dice do you want to roll?:");
		int howMany = diceRolls.nextInt();
		diceRoller(sides, howMany);
	}

			
	public static void diceRoller(int sides, int howMany)	{	
		//Dice roller
	
		int x;
		System.out.println("You rolled");
		for (int i =0; i<howMany; i++) {
			x = (int)(Math.random()*sides +1);
			System.out.println(x);
		}
		
		again();
	}
		
	public static void again() {
		
		Scanner repeat = new Scanner(System.in);
		System.out.println("Again?[y,n]");
		String yn = repeat.next();
		
		if (yn.equals("y"))
			System.out.println("y");
			

	}
}	
