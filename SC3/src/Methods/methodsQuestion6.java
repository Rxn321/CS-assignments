 package Methods;

public class methodsQuestion6 {

	public static void main(String[] args) {
		int height=3;
		int width=6;
		displayBox(height, width);
	}
	public static void displayBox(int height, int width) {
		int n,m;
		
		for (m = 1 ; m <= height; m++) { 
		for ( n=1; n <= width; n++) { 
		System.out.print("*");}
		System.out.println("");

		}
	}
}
