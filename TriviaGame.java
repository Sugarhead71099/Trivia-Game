import java.util.Scanner;

// This is a trivia game, where questions asked must be answered.
public class TriviaGame {
	
	static Scanner userInput = new Scanner(System.in);					//Takes input
	static QuestionDatabase qD = new QuestionDatabase();					// secondary class (helper class)
	static int arrLength = 0, originalArrLength = qD.getArrLength();					// global variables initialized

	public static void main(String args[]) {					// Main method (Start of program) where code is called upon and/or executed
		
		while(qD.getScore() < originalArrLength) {					// Keep looping over code inside while the user's score is less than the original array length (# of questions)
			
			arrLength = qD.getArrLength();					// get the length of the questions array (number of question[index 0])
			String question = qD.getQuestion((int) (Math.random() * arrLength));					// choose a random index of the array based on the current length (# of questions)
			System.out.println(question);					// print the question out to the user
			String answer = userInput.nextLine().toLowerCase();					// take the answer from the user and convert all to lowercase for accuracy purposes
			String checkAnswer = qD.checkAnswer(question, answer);					// check to see whether the user's answer is right
			System.out.println(checkAnswer);					// print out whether the user's answer was right or not
			System.out.println("Score: " + qD.getScore() + "\n");					// Print out the user's score
			if(qD.getScore() == originalArrLength)
				break;
			
		}
		System.out.println("\nCongratulations you have finished this study session! ");
	}
		
}