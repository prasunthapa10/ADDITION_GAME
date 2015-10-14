/**
 * 
 */

/**
 * @author Prasun Thapa
 *
 */import java.util.Scanner;
public class Addition_Game {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Team");
		int hardness = 10;
		int score = 0;
		// Round 1
				int number1 = (int)(Math.random()*hardness);
						System.out.println("Random number 1 is: " + number1);
						int number2 = (int)(Math.random()*hardness);
						System.out.println("Random number 2 is: " + number2);
						
						int correctAnswer = number1 + number2;
						//  Ask the user to add these two numbers together
						System.out.println("What is " + number1 + " + " + number2 +" = ?");
				
						//  Read in their response
						Scanner input = new Scanner(System.in);
						int studentAnswer = input.nextInt();
				
						//  Check if the answer was correct
						if(correctAnswer == studentAnswer){
						//		IF correct
							//			Tell them it was correct
							System.out.println("Your answer was correct");
							//	10 points is given for correct answer
							score = 10;

		System.out.println("Current Score = " + score);
				
							
						}else{
							//		IF not correct
							//			Tell them it was wrong
							System.out.println("Your answer was not correct");
							// 			Tell them the correct answer
							
		System.out.println("The correct answer is " +
		(number1 + number2) );
//		Do not give them points
		//			Make the next question easier
		System.out.println("What is 3 + 4 ?" );
		int userAnswer = input.nextInt();
		if (userAnswer == 7){
			System.out.println("your answer is correct");
		}
		}
						//Round 2
						// The hardness of the question is increased
						hardness *= 10;
						int number3 = (int)(Math.random()*hardness);
						int number4 = (int)(Math.random()*hardness);
						
// The user is asked to add the two numbers
		System.out.println("What is " + number3 + " + " + number4 + "?");
// The correct answer is stored in variable rightanswer
		int rightanswer = number3 + number4;
		// Variable useranswer is used to store the value prompt by the user
		int useranswer = input.nextInt();
// If statement is applied to verify the user answer
		if (useranswer == rightanswer){
// The user will get 10 points for each right answer
		System.out.println("your answer is correct");
		score += 10;

		System.out.println("Your Current Score = " + score);
			
		}
		else {
// if the answer is incorrect, the correct answer is shown
		System.out.println(" Your answer is incorrect");
		System.out.println("The correct answer is 9" + rightanswer);

// The user is asked a simple question
		System.out.println("What is 5 + 5 ?");
		int userAnswer = input.nextInt();
		if (userAnswer == 10) {
// The user is not getting point of answering the simple question
		System.out.println("You are correct, Be ready for the "
				+ "next question");


		}
		}
// Round 3
		// The question hardness is increased than round2
		hardness *= 10;
		int numberA = (int)(Math.random()* hardness);
		int numberB = (int)(Math.random()*hardness);
// The user is asked to add two numbers
		System.out.println("What is " + numberA + " + " + numberB + "?");
		// Correct answer is stored in variable CorrectAnswer
		int CorrectAnswer = numberA + numberB;
		// Variable Useranswer is used to store the value prompt by the user
		int Useranswer = input.nextInt();
// If statement is used to verify the user answer
		if (Useranswer == CorrectAnswer){
			// if the answer is correct, 10 points will be awarded
			System.out.println("You are absolutely correct");
			// The score will be added for the each correct answer
			score+= 10;
			System.out.println("Your current Score is " + score);
			}
		else {
			// if the answer is wrong, the correct answer is given
			System.out.println("Your answer is wrong");
			System.out.println("The right answer is " + CorrectAnswer);
			/* A simpler question is asked to the user, however, the points is not
			awarded for the simple question*/
			System.out.println("What is 20 + 30 ?");
			int Answer = input.nextInt();
			if (Answer == 50){
				System.out.println("You are correct, Get ready for the"
						+ " final question ");
				
			}
		}


	}

}
