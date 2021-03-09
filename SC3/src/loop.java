//(Intermediate) Loops
import java.util.Scanner;


public class loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		
		
//Question 1
	System.out.println("Question 1");
	int i = 100;
		while(i>=10) {
			System.out.println("i is " +i);
			i--;
		}
//Question 2
			System.out.println("Question 2");
			int a = 1;
			int j = 1;
	
				for (a = 1; a <= 10; a++) { 
					for (j = 1 ; j <= a; j++) { 
			    System.out.print(j + " "); }  
					System.out.println(" "); } 
//Question 3
	System.out.println("Question 3");
	System.out.println("Let's add some numbers! [Type a negative number to quit]");
		int q;
		int finalSum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("add:");	
			q = sc.nextInt(); 	
				while (q > 0) {
					finalSum += q;
						System.out.println("add:");
						q = sc.nextInt();
					}
				
		 	System.out.println(finalSum);
		 
//Question 4
	System.out.println("Question 4");
	System.out.println("What character do you want your bar made of?");
		Scanner ch = new Scanner(System.in);
			String bar = ch.next();
		System.out.println("How long is your bar?");
			Scanner nu = new Scanner(System.in);
			int blen = nu.nextInt();
				int c;
				int d;
					for (c = 0; c < 1; c++) {
						for 
						(d = 0; d < blen; d++) {
							System.out.print(bar);}
					System.out.println("");
					
//Question 5
	System.out.println("Question 5");
	System.out.println("What character do you want your triangle made of?");
		Scanner cht = new Scanner(System.in);
			String chta = cht.next();
				System.out.println("How tall do you want your triangle made of?");
					Scanner h =	new Scanner (System.in);
		int high;
			high = h.nextInt();
				int n;
				int m;
					for ( n= 1; n <= high; n++) { 
						for (m = 1 ; m <= n; m++) { 
							System.out.print(chta + " "); }  
						System.out.println(" "); } 
//Question 6
	System.out.println("Question 6");System.out.println("I've pick a random number between 1 and 100.");
	System.out.println("Try to guess it!");
		int max = 100;
		int min = 1;
		int rndom =(int)(Math.random()* (max - min + 1) + min);
// System.out.println(rndom);	
		System.out.println("What is your guess?");
			int guessCount = 1;
			Scanner guss = new Scanner(System.in);
			int guess=guss.nextInt();
			while(guess != rndom ) {
				if(guess > rndom) {						
					System.out.println("this is too high");
					System.out.println("What is your guess?");		
					}
					if(guess < rndom) {
						System.out.println("this is too low");
						System.out.println("What is your guess?");		
					}
					guess = guss.nextInt();
					guessCount++;
				}
			System.out.println("You've guess my number! Good job! It only took you "+guessCount+" tries");
						
						}
				}		
		}
