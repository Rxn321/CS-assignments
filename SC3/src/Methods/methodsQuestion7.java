package Methods;
import java.util.Scanner;

public class methodsQuestion7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question 1	
		do {
		Scanner diceSides = new Scanner(System.in);
		System.out.println("How many sides do these dice have?:");
		int sides = diceSides.nextInt();		
		
		Scanner diceRolls = new Scanner(System.in);
		System.out.println("How many dice do you want to roll?:");
		int howMany = diceRolls.nextInt();
		diceRoller(sides, howMany);
	} 
		while(again());
	}
			
	public static void diceRoller(int sides, int howMany)	{	
		//Dice roller
		int x=0;
		int sum=0;
		System.out.print("You rolled:");
		for (int i =0; i<howMany; i++) {
			x = (int)(Math.random()*sides +1);
			sum=sum+x;
			System.out.print(+x+",");
		}
		System.out.println();
		System.out.println("Total:"+sum);
	}
		
	public static boolean again() {
		
		Scanner repeat = new Scanner(System.in);
		System.out.println("");
		System.out.println("Again?[y,n]");
		String yn = repeat.next();
		
		if (yn.equals("y")) {
			return true;
		}
		System.out.println("GoodBye!");
		return false;
		
		
		
	}
}
