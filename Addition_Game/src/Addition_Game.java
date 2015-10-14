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
							//			Give them points
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


	}

}
