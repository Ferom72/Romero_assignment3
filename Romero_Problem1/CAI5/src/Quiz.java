import java.util.Random;
import java.util.Scanner;

public class Quiz{
	public static void main(String[] args) {
	 quiz();
	}
	
	public static void quiz() {
		Random Numbers = new Random();
        
		Scanner Answer =new Scanner(System.in);
		int i=1,c=0,r=0,opertaion;
		int difficulty= readDifficulty(Answer);
		System.out.println();
		
		int operation= pickOperation(Numbers,Answer);
		
		
		while (i <=10) {
			int numberOne = generateQuestionArgument(Numbers,difficulty);
			int numberTwo = generateQuestionArgument(Numbers,difficulty);
			int correctAnswer = generateCorrectAnswer(operation,numberOne,numberTwo);
			askQuestion(numberOne,numberTwo,operation);
			
		    int response = readResponse(Answer);
		
		    if(isAnswerCorrect(correctAnswer,response)) {
		    	displayCorrectResponse(Numbers);
		        c++;
	       }else {
	    	displayIncorrectResponse(Numbers);
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
	
		
	private static int generateQuestionArgument (Random Numbers, int difficulty) {
		int argument =0;
		
		if(difficulty==1) {
			argument=Numbers.nextInt(10);
		}else if(difficulty==2) {
			argument=Numbers.nextInt(100);
		}else if(difficulty==3) {
			argument=Numbers.nextInt(1000);
		}else if(difficulty==3) {
			argument=Numbers.nextInt(10000);
		}
		return argument;
	}
	
	private static int readDifficulty(Scanner Answer) {
		System.out.print("Enter difficulty level(1 and 4):");
		return Answer.nextInt();
	}

	public static int readResponse(Scanner Answers) {
		Scanner Answer = new Scanner(System.in);
		int value = Answer.nextInt();
		return value;
	}
	
	public static void askQuestion(int numberOne, int numberTwo, int operation) {
	  switch(operation) {
	  case 1: System.out.println("How much is "+ numberOne+" plus "+numberTwo+"?");
	  break;
	  case 2: System.out.println("How much is "+ numberOne+" times "+numberTwo+"?");
	  break;
	  case 3: System.out.println("How much is "+ numberOne+" minus "+numberTwo+"?");
	  break;
	  case 4: System.out.println("How much is "+ numberOne+" divided by "+numberTwo+"?");
	  break;
	  }

	}
	
	public static int pickOperation(Random Numbers,Scanner Answer) {
		System.out.print("Please pick operation 1.Addition,2.Multiplication,3.Subtraction,4.Division,5.Mixed:");
		int operation = Answer.nextInt();
		
		if (operation==5) 
			operation = Numbers.nextInt(4)+1;
		    return operation;
		}

	
	public static boolean isAnswerCorrect(int correctAnswer, int response) {
		return correctAnswer== response;
	}
	
	public static void displayCorrectResponse(Random Numbers) {
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
	
	
	public static void displayIncorrectResponse(Random Numbers) {
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
     double percent = ((double)c/10.0)*100.0;
     System.out.println("\nYou Scored"+percent+"%");
     if(percent<75) {
    	 System.out.println("Please ask your teacher for extra help.");
     }else {
    	 System.out.println("Congratulations, you are ready to go to next level!");
     }
	}
	
	public static int generateCorrectAnswer(int operation,int numberOne, int numberTwo) {
		switch(operation) {
		case 1: return numberOne + numberTwo;	
		case 2: return numberOne * numberTwo;
		case 3: return numberOne - numberTwo;
		case 4: return numberOne / numberTwo;
		}
	    return 98;
		}
	}
  
	