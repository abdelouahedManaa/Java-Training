import java.util.Scanner;

public class AssignmentTwo {

	public static void main(String[] args) {
		// Q1 -	Ask the USER for a string
		System.out.println("Please enter a string");
		Scanner input = new Scanner (System.in);
		String sentence = input.nextLine();
		input.close();
		
		// Q2 - Convert that string to all upper-case and print it
		
		String memory = sentence;
		sentence = sentence.toUpperCase();
		System.out.println(sentence);
		
		// Q3 -	Print the length of that string 
		System.out.println(sentence.length());
		
		// Q4 - Replace 'O' with 'Z'
		sentence = sentence.replace('O', 'Z');
		
		// Q5 - Give the last character of the string
		System.out.println(sentence.charAt(4));
		
		// Q6 - Concatenate the string from step 1 with string "Test"
		System.out.println(memory.concat(" Test"));
		

	}

}
