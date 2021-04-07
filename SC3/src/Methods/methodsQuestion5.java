package Methods;

public class methodsQuestion5 {
		
	public static void zoop() { 
			  baffle();  
			  System.out.print("You wugga ");  
			  baffle();  
			}  
			 
			public static void main(String[] args) {  
			  System.out.print("No, I ");  
			  zoop();  
			  System.out.print("I ");  
			  baffle();  
			}  
			 
			public static void baffle() {  
			  System.out.print("wug");  
			  ping();  
			}  
			 
			public static void ping() {  
			  System.out.println(".");  
			  baffle();
//By adding baffle(); at the end of the ping methods created a infinite loop between ping and baffle methods.This caused the overflow in the console.
			} 
}