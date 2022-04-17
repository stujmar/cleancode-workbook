package JavaOne;
import java.util.Scanner;

public class ChallengeOne {
  
  public static void main(String[] args) {
    String question = "What is the capital of Michigan?";
    String choiceOne = "Detroit";
    String choiceTwo = "Lansing";
    String choiceThree = "Ann Arbor";
    String correctAnswer = choiceTwo;
    String answer = "";

    Scanner input = new Scanner(System.in);
    
    while (!answer.equals(correctAnswer) || answer.equals("B")) {
      if (answer.length() > 0) {
        System.out.println("You are wrong!");
      }
        System.out.println(question);
        System.out.println("A) " + choiceOne);
        System.out.println("B) " + choiceTwo);
        System.out.println("C) " + choiceThree);
        answer = input.nextLine();
    }
    System.out.println("You are correct!");
    input.close();
  }
}
