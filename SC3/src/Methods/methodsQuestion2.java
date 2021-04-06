package Methods;

public class methodsQuestion2 {
	//to invoke the verse method about a duck that quacks, we just need to add   
	//System.out.println(""); verse("duck","quack");  below public static void
	//for example
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Question 1");
		String animal, sound = null, verse;
		verse("cow", "moo");
		System.out.println("");
		verse("dog","woof");
		System.out.println("");
		verse("duck","quack");
	}
	private static void verse(String animal, String sound) {
		// TODO Auto-generated method stub
		{
			System.out.println("Old Macdonald had a farm. EE-I-EE-I-O,");
			System.out.println("And on that farm he had a " + animal + ", EE-I-EE-I-O.");
			System.out.println("With a " + sound + " " + sound + " here and k, a " + sound + " " + sound + " there ");

				}
		}
}