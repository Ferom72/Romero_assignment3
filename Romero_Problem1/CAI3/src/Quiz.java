import java.util.Random;
import java.util.Scanner;

public class Quiz{
	public static void main(String[] args) {
	 quiz();
	}
	
	public static void quiz() {
		Random Numbers = new Random();
        
		Scanner Answer =new Scanner(System.in);
		int i=1,c=0,r=0;
	
		
		while (i<=10) {
			int numberOne = Numbers.nextInt(10);
			int numberTwo = Numbers.nextInt(10);
			int value = askQuestion(numberOne,numberTwo);
			int valueTwo = readResponse();
			if (value==valueTwo) {
				displayCorrectResponse();
				c++;
			}else{
			displayIncorrectResponse();
			r++;
		}
		i++;
	    }
		diplayCompletionMessage(c);
		System.out.println("Do you want to solve another problem? (y/n)");
		char answer = Answer.next().charAt(0);
		if(answer=='y'||answer=='Y') {
			quiz();
		}else {
			System.exit(0);
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
		Random Number = new Random();
		int Repetition = Number.nextInt(4)+1;
		
		switch (Repetition) {
		case 1: System.out.println("Very good!");
		break;
		case 2: System.out.println("Excelent!");
		break;
		case 3: System.out.println("Nice work!");
		break;
		case 4: System.out.println("Keep up the good work!");
		break;
		}
	}
	
	
	public static void displayIncorrectResponse() {
		Random Number = new Random();
		int Repetition = Number.nextInt(4)+1;
		
		switch (Repetition) {
		case 1: System.out.println("No.Please try again.");
		break;
		case 2: System.out.println("Wrong.Try once more.");
		break;
		case 3: System.out.println("Don't give up!");
		break;
		case 4: System.out.println("No. Keep trying.");
		break;
		}
		}
	
	public static void diplayCompletionMessage(int c) {
		float x=(float)c/10*100;
		System.out.println("Your Score is"+x+"%");
		if(x>=75) {
			System.out.println("Congratulations,you are ready to go to the next level!");
		}else {
			System.out.println("Please ask your teacher for extra help.");
		}
	}
  
	}