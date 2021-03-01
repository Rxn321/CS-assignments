//(Intermediate) Loops
import java.util.Scanner;


public class temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
	//Question 1
		System.out.println("Question 1");
		int i = 100;
		while(i>=10) {
			System.out.println("i is " +i);
			i--;
		}
			System.out.println("i is "+i); 
	//Question 2
			System.out.println("Question 2");
			int a = 1;
			int j = 1;
	
				for (a = 1; a <= 10; a++) { 
					for (j = 1 ; j <= a; j++) { 
			    System.out.print(j + " "); }  
			System.out.println(" "); } 
	//Question 3
		/*System.out.println("Question 3");
		System.out.println("Let's add some numbers! [Type a negative number to quit]");
	
		int b;
		int c;
		Scanner sc = new Scanner(System.in);	
		b = sc.nextInt(); 	
		c = sc.nextInt();
	
			while (b >= 0) {
				(b + c);
				System.out.println("add:");
			
			b = sc.nextInt();
		}*/
			
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
					for (c = 0; c <= blen; c++) 
					{
						for 
						(d = 0; d < 1; d++) {
						}
						System.out.println(bar);
					System.out.println(" ");
				}
					
	}
}
