package StringMutation;

public class StringMutation {

	public static void main(String[] args) {
		
		
		//Prints a string and various mutations of it

		String phrase = "Change is İnevitable";
		String mutation1, mutation2, mutation3, mutation4;
		
		mutation1 = phrase.concat(" except from vending machines.");
		mutation2 = mutation1.toUpperCase();
		mutation3 = mutation2.replace('E', 'x');
		mutation4 = mutation3.substring(3, 30);
		
		
		//Print each mutated string
		System.out.println("Mutation #1: "+ mutation1);
		System.out.println("Mutation #2: "+ mutation2);
		System.out.println("Mutation #3: "+ mutation3);
		System.out.println("Mutation #4: "+ mutation4);

	}

}
