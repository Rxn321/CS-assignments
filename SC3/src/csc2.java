//(Intermediate) Java - Variables and Data-Types
import java.util.Scanner;

public class csc2 {


		public static void main(String[] args) {

		System.out.println("2. Classes, Variables, and Data Types");
			//Question 2:
		System.out.println("	Question 2");	
			double x = 1.0/3.0;
		System.out.println(x);	
		System.out.println(" ");
		System.out.println("	Question 3");

			//Question 3:
			//(a)
		int threeA=(int)4.999;
		System.out.println(threeA);
			//(b)
		double threeB=(int)0.999;
		System.out.println(threeB);
			//(c)
		System.out.println("Syntax error");//int x = (double) 8; is a error because we already declare x to be a integer, so it cannot convert to double  
			//(d)
		int threeD=(int)4.999/(int)2.5;
		System.out.println(threeD);
			//(e)
		int threeE=(int)(4.5/0.9);
		System.out.println(threeE);
		System.out.println(" ");

			//Question 4:
		{System.out.println("	Question 4");
		System.out.println("-a:Radius Calculator-");
			// Area Calculator
		Scanner sc = new Scanner(System.in);
		double area;
		System.out.println("What's the area?");
		area = sc.nextDouble();
		double cr2 = area/Math.PI;
		double cr = Math.sqrt(cr2);
		System.out.println("Radius:");
		System.out.println(cr);
		
		System.out.println(" ");
		System.out.println("-b:Distance Calculator-");
			//Calculate the distance between x and y
		Scanner start = new Scanner(System.in);
		double s = 0;
		System.out.println("What is the starting point");
		s = start.nextDouble();
		Scanner end = new Scanner(System.in);
		double e = 0;
		System.out.println("What is the ending point");
		e = end.nextDouble();
		System.out.println("Distance:");
		double distance1 = (double)s - (double)e;
		double distance = Math.abs(distance1);
		System.out.println(distance);
			
		System.out.println(" ");
		System.out.println("-c:Basic Interest Caculator-");
			//mortage calculator
		//rate
		Scanner sr = new Scanner(System.in);
		double r;
		System.out.println("Interest Rate");
		r = sr.nextInt();
		//number of years
		Scanner sn = new Scanner(System.in);
		double n;
		System.out.println("Years");
		n = sn.nextInt(); 
		//principle
		Scanner sp = new Scanner(System.in);
		double p;
		System.out.println("Principle");
		p = sp.nextInt(); 
		//final amount
		double amount2 = 1+r;
		double amount1 = Math.pow(amount2,n);
		double amountf = amount1*p;
		System.out.println("Amount in Account:");
		System.out.println(amountf);
		
		System.out.println(" ");
		System.out.println("-Random dice-");
		//generates10 random 6-sided dice rolls
		int max=6; 
		System.out.println("You rolled");
		for (int i =0; i<10; i++) {
			x = (int)(Math.random()*max +1);
			  System.out.println(x);
		}
		
				}
		}
}
