import java.util.*;

public class Quiz{
	public static void main(String[] args) {
	 quiz();
	}
	
	public static void quiz() {
		Random Numbers = new Random();
		
       int numberOne=Numbers.nextInt(10);
       int numberTwo=Numbers.nextInt(10);
		
		while(true) {
		
		int value = askQuestion(numberOne,numberTwo);
		int valueTwo = readResponse();
		if(value == valueTwo) {
			displayCorrectResponse();
			break;
		}
		displayIncorrectResponse();
	   }	
	  }


	public static int readResponse() {
		Scanner Answer = new Scanner(System.in);
		int value = Answer.nextInt();
		return value;
	}
	
	public static int askQuestion(int numberOne, int numberTwo) {
	
		System.out.println("How much is "+numberOne+" times "+numberTwo);
		return numberOne*numberTwo;
	}
	
	
	public static boolean isAnswerCorrect(int value, int valueTwo) {
		
		if(value==valueTwo) {
			return true;
		}
		return false;
	}
	
	
	public static void displayCorrectResponse() {
		System.out.println("Very Good!");
	}
	
	public static void displayIncorrectResponse() {
		System.out.println("No.Please try again.");
	}
}	
	