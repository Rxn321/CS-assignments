//(Intermediate) Decision making
import java.util.Scanner;

public class as {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			System.out.println("Question 1: class Secret");
			Scanner sc = new Scanner(System.in);
			System.out.println("What's the password?");
			
				String grade = sc.next();
			if (grade.equals("dragon"))
				System.out.println("I am Batman.");
			else
				System.out.println("Incorrect Password! My secret is still safe ... "); 
			System.out.println(" ");
			
			System.out.println("Question 2: class GradeBot");
			System.out.println("What was the test out of?");
			
			Scanner to = new Scanner(System.in);
			System.out.println("What was your test mark?");
			Scanner tm = new Scanner(System.in);

			double toi = to.nextInt(); 
			double tmi = tm.nextInt(); 
			double mark = tmi/toi;
			//(1-0.01)*100
			double mark0 = mark*100;

			if (mark0>=86 && mark0<=100)
			System.out.println("You got a "+mark0+"% That's an A ... keep up the good work.");	
			else if (mark0>=73 && mark0<86)
			System.out.println("You got a "+mark0+"% That's an B ... not bad.");
			else if (mark0>=67 && mark0<73)
			System.out.println("You got a "+mark0+"% That's an C+ ...  you passed, but you can do better!");
			else if (mark0>=60 && mark0<67)
			System.out.println("You got a "+mark0+"% That's an C ...  you passed.");
			else if (mark0>=50 && mark0<60)
			System.out.println("You got a "+mark0+"% That's an C- ...  you passed, very closly!");
			else if (mark0>=0 && mark0<50)
			System.out.println("You got a "+mark0+"% That's an F ... go study!");
			else
			System.out.println("Silly human, that's not possible. Quit joking around.");
			
			//Question 3: class Magic8Ball Using Math.Random, simulate a Magic 8 Ball.
			System.out.println(" ");
			
			System.out.println("ask me a question:");
			Scanner b = new Scanner(System.in);
			String ball = b.next();
			
			int max = 20;
			int min = 1;
			int rball =(int)(Math.random()* (max - min + 1) + min);
			System.out.println("The magic 8 ball says:");
			if (rball == 1)
				System.out.println("It is certain.");
			if (rball == 2)
				System.out.println("It is decidedly so.");
			if (rball == 3)
				System.out.println("Yes – definitely.");
			if (rball == 4)	
				System.out.println("Without a doubt.");
			if (rball == 5)	
				System.out.println("You may rely on it.");
			if (rball == 6)	
				System.out.println("As I see it, yes.");
			if (rball == 7)
				System.out.println("Most likely.");
			if (rball == 8)
				System.out.println("Outlook good.");
			if (rball == 9)
				System.out.println("Yes.");
			if (rball == 10)
				System.out.println("Signs point to yes.");
			if (rball == 11)
				System.out.println("Repky hazy, try again.");
			if (rball == 12)
				System.out.println("Better not tell you now.");
			if (rball == 13)
				System.out.println("Ask agiain later.");
			if (rball == 14)		
				System.out.println("Cannot predict now.");
			if (rball == 15)
				System.out.println("Concentreate and ask again.");
			if (rball == 16)
				System.out.println("Don't count on it.");
			if (rball == 17)
				System.out.println("NO");
			if (rball == 18)		
				System.out.println("My source says no.");
			if (rball == 19)
				System.out.println("Outlook not so good.");
			if (rball == 20)
				System.out.println("Very doubtful.");

			
	
			
			
				
	}

}
